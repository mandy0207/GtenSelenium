package javaBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	static 	WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.get("https://www.demoblaze.com");
		driver.findElement(By.id("login2")).click();
		
		driver.findElement(By.id("loginusername")).sendKeys("Vinodbhusal");
		driver.findElement(By.id("loginpassword")).sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Thread.sleep(2000);
		WebElement phoneBtn=driver.findElement(By.cssSelector(".list-group-item:nth-child(2)"));
		scroll(phoneBtn);
		phoneBtn.click();
		Thread.sleep(2000);
		
		List<WebElement> phoneList = driver.findElements(By.cssSelector(".card-title a"));
		
		for(WebElement phone :phoneList) {
			if(phone.getText().equalsIgnoreCase("Samsung galaxy s7")) {
				scroll(phone);
				phone.click();
				break;
				
			}
		}
	}
	
	public static void scroll(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
}
