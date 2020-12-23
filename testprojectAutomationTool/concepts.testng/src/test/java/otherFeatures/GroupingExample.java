package otherFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingExample {
	
	@Test(groups="Snack")
	public void testA() {
		Assert.assertTrue(false);
		System.out.println("am in test A");
	}
	
	
	@Test(groups="Snack")
	public void testB() {
		System.out.println("am in test B");
	}
	
	
	@Test(groups="Lunch")
	public void testC() {
		System.out.println("am in test C");
	}
	
	@Test(groups="Lunch")
	public void testD() {
		System.out.println("am in test D");
	}
	
	@Test(groups="Dinner")
	public void testE() {
		
		System.out.println("am in test E");
	}

}
