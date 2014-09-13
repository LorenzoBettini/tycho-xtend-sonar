package example

import org.junit.Test
import org.junit.Assert

class XtendGreetingTest {
	
	@Test def void testGreeting() {
		val greeting = new XtendGreeting().greeting
		println(greeting)
		Assert.assertEquals("Hello, world.", greeting)
	}

	def useEquals2() {
		// 2 findbugs issues:
		// findbugs:DM_NUMBER_CTOR
		// findbugs:EC_UNRELATED_TYPES
		new Integer(0).equals("foo");
	}
}