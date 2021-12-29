package ejercicio5;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestClass extends TestCase{
	
	public TestClass(String testName) {
		super(testName);
	}
	
	public static Test suite() {
		return new TestSuite(TestClass.class);
	}
	
	public void testApp() {
		assertTrue(false);
	}

}
