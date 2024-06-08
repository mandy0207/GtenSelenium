package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingAssertions {

	@Test
	public void mytest() {
		String expectedHeading = "Welcome to our store";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actualHeading=driver.findElement(By.cssSelector("[class*='-content-title'] h2")).getText();
		
		Assert.assertEquals(actualHeading, expectedHeading);
		
		boolean btnDisplayed=driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		
		Assert.assertTrue(btnDisplayed, "bUTTON IS NOT DISPLAYED");
		
		
		driver.quit();
		
		
	}
}
