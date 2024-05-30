package AutomationWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AutomationTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Trigger url
		driver.get("https://automationexercise.com/");
		
		// show title
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']"))
	    .sendKeys("automation@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Automation@123");
		driver.findElement(By.xpath("//*[@data-qa='login-button']")).click();
		WebElement element = driver.findElement(By.xpath("//*[@id='header']//li[4]/a"));
        element.click();
        
        driver.quit();
	}
	
}








