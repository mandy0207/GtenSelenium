package shivamcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {
	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.findElement(By.id("login2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("loginusername")).sendKeys("testmay2510pm");
		driver.findElement(By.id("loginpassword")).sendKeys("Rewq@1234");
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("login2")).click();
		Thread.sleep(1000);
		driver.quit();

	}

}
