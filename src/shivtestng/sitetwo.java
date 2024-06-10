package shivtestng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class sitetwo {
	
	@Test(groups="Smoke")
	public void sitetwof_test() {
		System.out.println("first sitetwo test");
	}
	
	@Test
	public void sitetwos_test() {
		System.out.println("Second sitetwo test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
	
	

}
