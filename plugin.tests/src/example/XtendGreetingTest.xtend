package example

import org.junit.Test
import org.junit.Assert

class XtendGreetingTest {
	
	@Test def void testGreeting() {
		Assert.assertEquals("Hello, world.", new XtendGreeting().greeting)
	}
}