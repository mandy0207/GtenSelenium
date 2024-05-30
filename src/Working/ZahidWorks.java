package Working;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ZahidWorks {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://petstore.octoperf.com/");
		// render title
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Enter the Store")).click();
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("GtenTask");
		WebElement prevVal=driver.findElement(By.name("password"));
		prevVal.clear();
		prevVal.sendKeys("Test@123");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.linkText("Sign Out")).click();
		Thread.sleep(2000);
		System.out.println( driver.getCurrentUrl());
		
		driver.quit();
	}
}













