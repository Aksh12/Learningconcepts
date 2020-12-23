package dataprovider;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataProviderWithMethodParameter {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("under BEFORE");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("under AFTER");
	}
	
	@Test(dataProvider="inputData", dataProviderClass = DataProviderInput.class)
	public void calculateab(int a, int b) {
		int sum=(a+b);
		System.out.println("a+b =  " + sum);
		Assert.assertTrue(false);
		
	}
	
	@Test(dataProvider="inputData", dataProviderClass = DataProviderInput.class)
	public void calculateabc(int a, int b, int c) {
		int sum=(a+b+c);
		System.out.println("a+b+c =  " + sum);
	}
	
	//@AfterMethod
	public void testResult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println(result.getMethod().getMethodName() + " : Pass " );
		}else {
			System.out.println(result.getMethod().getMethodName() + " : Failed " );
		}
		
	}

}
