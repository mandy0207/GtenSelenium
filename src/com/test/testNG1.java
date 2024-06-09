package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG1 {
	
	
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://amazon.in");
		

	}
	@Test
	public void title() {
		
		 String url=driver.getCurrentUrl();
		 
		 Assert.assertEquals(true, url.equals("https://www.amazon.in/"));
		 

	}
	@AfterTest
	public void teardown() {
		 
		 driver.quit();
		 

	}
	
	
	

}
