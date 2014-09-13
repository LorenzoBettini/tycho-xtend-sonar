This example demonstrates how to collect code coverage by tests, which executed by [tycho-surefire-plugin](http://www.eclipse.org/tycho/) and the xtend-maven-plugin.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.6 or higher
* [SonarQube Java Plugin](http://docs.codehaus.org/x/KwChCw) 1.4 or higher
* Maven 3.0.3 or higher

Execution
=========

1.  Build project and execute all tests:

        export MAVEN_OPTS="-Xmx512m -XX:MaxPermSize=256m"
        mvn clean install

2.  Analyze with SonarQube:

        mvn sonar:sonar
