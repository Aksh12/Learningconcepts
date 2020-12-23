package testsuite1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testsuite2.suiteClass;

public class BeforeClass2 extends suiteClass {

	
	
	@Test
	public void testMethod3() {
		System.out.println("under 'Test 3' Method");
	}
	

	@Test
	public void testMethod4() {
		System.out.println("under 'Test 4' Method");
	}
	
	@BeforeClass
	public void myBeforeClass() {
	System.out.println("under 'before 1 class'");	
	}
	
	@BeforeMethod
	public void myBeforeMethod() {
		System.out.println("under 'before 1 method' ");
	}
	
	@AfterMethod
	public void myAfterMethod() {
		System.out.println("under 'After 1 method' ");
	}
	
	@AfterClass
	public void myAfterClass() {
	System.out.println("under 'After 1 class'");	
	}

	
}
