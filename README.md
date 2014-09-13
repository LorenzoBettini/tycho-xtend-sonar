This example is based on [https://github.com/SonarSource/sonar-examples/tree/master/projects/tycho](https://github.com/SonarSource/sonar-examples/tree/master/projects/tycho) and it uses also the xtend-maven-plugin.

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
