package testsuite2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteClass {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("---under before suite----");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("----under After suite----");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("****under before test****");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("****under After test****");
	}

}
