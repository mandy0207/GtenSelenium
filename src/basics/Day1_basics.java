package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_basics {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//opens a url
		driver.get("https://automationdemo.capsulecrm.com/");
		
		// grab a title
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		System.out.println( driver.getCurrentUrl());
		
		driver.findElement(By.id("login:usernameDecorate:username")).sendKeys("mscoding24");
		
		driver.findElement(By.id("login:passwordDecorate:password")).sendKeys("AutomationDemo24");
		
		driver.findElement(By.id("login:login")).click();
		
		
		
		 
		 

	}

}
