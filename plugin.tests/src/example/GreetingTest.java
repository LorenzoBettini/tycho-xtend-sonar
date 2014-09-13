package example;

import org.junit.Test;

public class GreetingTest
{
    @Test
    public void test()
    {
      new Greeting().coveredByTest();
    }
    
    public boolean foobar() {
    	// 2 findbugs issues:
		// findbugs:DM_NUMBER_CTOR
		// findbugs:EC_UNRELATED_TYPES
		return new Integer(0).equals("foo");
	}
}
