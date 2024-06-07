package learn_testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebTesting {

	/**
	 * 1. Any method annonated with Test would be considered as test case only
	 * 2. Order of execution depends upon alphabetical order of method
	 * 3. we can prioritize the execution order using priority,  priority= {0,1,2}
	 * 4. If two test cases have same priority , alphabetical order will take precedence
	 * 5. BeforeTest will execute once only before all tests present in class 
	 * 6. AfterTest will execute once only after all tests present in class 
	 * 7. Before Method will execute before every test method.
	 * 8. After method will execute after every test method.
	 * 
	 */

	@Test
	public void firstWebTest() {
		System.out.println("I am in first web test case");
	}
	
	@Test(priority =1, groups="Smoke")
	public void secondWebTest() {
		System.out.println("I am in second web test case");
	}
	
//	@BeforeMethod
//	public void beforeMethod() {
//		System.out.println("I am in before test method");
//	}
//	
//	
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("I am in after test method");
//	}
	
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before web test");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("I am in after web test");
	}
	
	
	


}
