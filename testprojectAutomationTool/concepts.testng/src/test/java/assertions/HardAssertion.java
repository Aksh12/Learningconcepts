package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class HardAssertion {
	
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("Test Step 1");
		while(true) {
			System.out.println("1");
		}
		
	}
	
	
	
	@Test
	public void test2() {
		SoftAssert ass = new SoftAssert();
		//ass.assertTrue(3>5);
		ass.assertTrue(5>3);
		System.out.println("Test step 3");
	   //System.out.println("Test case 2");
	 ass.assertAll();
	}

}
