package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearnHardAssertions {


	@Test
	public void verifyhardAssert() {
		
		String actualName= "Prashant";
		String expectedName= "Prashant";
		
		//Hard assertion failure will stop the program abruptly
	
		System.out.println("We are here");
		
		Assert.assertEquals(actualName, expectedName);
		System.out.println("watching you");
		Assert.assertTrue(true);
		Assert.assertFalse(false, "Please pass false only");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
