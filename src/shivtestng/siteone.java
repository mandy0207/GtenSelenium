package shivtestng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class siteone {
	

	@Test(priority =2)
	public void first() {
		System.out.println("first test");
	}
	
	@Test(priority =1, groups="Smoke")
	public void second() {
		System.out.println("second test");
	}
	

	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before test method");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after test method");
	}
	
	
	

}
