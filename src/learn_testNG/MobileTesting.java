package learn_testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MobileTesting {

	
	@Test(groups= "Smoke")
	public void firstMobileTest() {
		System.out.println("I am in first mobile test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in before class");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am in after class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suite");
	}
	
	/**
	 * SUITE
	 * tEST
	 * CLASS
	 */
	
	

	
	
	
}
