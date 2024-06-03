package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
 
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement desiredElement=driver.findElement(By.xpath("//*[@class='totalAmount']"));
		scroll(desiredElement);
		/**
		 * switch isnide frame using
		 * 1. ID or name
		 * 2. WebElement
		 * 3 Index
		 */
		//switching using id
		//driver.switchTo().frame("courses-iframe");
		
		//switching using name
		switchFrame("iframe-name");
		String emailText=driver.findElement(By.xpath("//*[@class='icon fa fa-envelope']/parent::*")).getText();
		System.out.println(emailText);
		
		//used to come out of iframe
		
		switchOutofFrame();
		
		driver.findElement(By.xpath("//*[@value='radio1']")).click();
		driver.quit();
		
		

		}
	

	public static void  switchFrame(String id) {
		driver.switchTo().frame(id);
	}
	
	public static void switchOutofFrame() {
		driver.switchTo().defaultContent();
	}
	
	public static void scroll(WebElement desiredElement) {
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
	}
}
