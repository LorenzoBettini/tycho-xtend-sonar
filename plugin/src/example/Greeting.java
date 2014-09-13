package example;

public class Greeting
{
    public void coveredByTest()
    {
       System.out.println("Hello, world.");
    }
    
	public boolean foobar() {
		// 2 findbugs issues:
		// findbugs:DM_NUMBER_CTOR
		// findbugs:EC_UNRELATED_TYPES
		return new Integer(0).equals("foo");
	}
}
