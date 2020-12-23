package dataprovider;

import org.testng.annotations.Test;

public class ParallelMethodTestExample {

	@Test
	public void test1() {
		System.out.println(Thread.currentThread().getId() + " :Test1");
	}
	
	@Test
	public void test2() {
		System.out.println(Thread.currentThread().getId() + " :Test2");
	}
	
	@Test
	public void test3() {
		System.out.println(Thread.currentThread().getId() + " :Test3");
	}
	
	@Test
	public void test4() {
		System.out.println(Thread.currentThread().getId() + " :Test4");
	}
	
}
