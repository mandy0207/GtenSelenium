package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearnSoftAssertions {


	@Test
	public void verifyhardAssert() {
		
		SoftAssert softAsset = new SoftAssert();
		
		String actualName= "Prashant";
		String expectedName= "Prashan";
		
		//soft assertion will store all the failures and we can throw at end using softassetassertAll();
	    // we use it when we don't want to hamper execution of our test
		System.out.println("We are here");
		
		 softAsset.assertEquals(actualName, expectedName);
		 System.out.println("watching you");
		 softAsset.assertTrue(false);
		 softAsset.assertFalse(true, "Please pass false only");
		
		 softAsset.assertAll();
		
		
		
	}

}
