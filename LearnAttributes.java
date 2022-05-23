package week5.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	@Test
	public void b() {
		System.out.println("test B");
	}
	@Test(enabled = false)
	public void a() {
		System.out.println("enabled = false another way to ignore test case");
	}
	@Ignore
	@Test
	public void c() {
		System.out.println("@Ignore to ignore test case");
	}
	@Test(priority = -1)
	public void d() {
		System.out.println("Priority with negative values will get higher priority");
	}
	@Test(invocationCount = 3,invocationTimeOut = 3000,threadPoolSize = 2)  
	public void e() {
		System.out.println("invocationCount helps to achieve testcases multiple times without for loop");
	}
	@Test(timeOut = 3000)  
	public void f() {
		System.out.println("timeout mention time the test takes for each iteration");
	}
	@Test(dependsOnMethods = {"week5.day1.LearnAttributes.b"},alwaysRun = true)  
	public void g() {
		System.out.println("dependsOnMethods create dependencies which will run last");
	}
	@Test 
	public void h() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("manually throws exception");
		throw new RuntimeException();
	}
	

}
