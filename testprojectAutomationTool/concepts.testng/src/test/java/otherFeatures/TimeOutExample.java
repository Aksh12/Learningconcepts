package otherFeatures;

import org.testng.annotations.Test;

public class TimeOutExample {
	
	@Test
	public void test1() throws InterruptedException {
		
		Thread.sleep(6000);
		while(true) {
		
			System.out.println("test 1");
		}
		
		
	}
	
	@Test
	public void test2() throws InterruptedException {
		
		Thread.sleep(3000);
		for(;;) {
			System.out.println("test2");	
		}		
		

	}


}
