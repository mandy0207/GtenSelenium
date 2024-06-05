package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4_basiics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		
		driver.get("https://flipkart.com");
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		WebElement desiredElement = driver.findElement(By.xpath("//*[contains(text(),'Sports, Healthcare & more')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
		
		//ask that if the wait time is more and the elemnt does not load what to do in such a case
		
		
		driver.navigate().to("https://noon.com");
		
		WebElement firstElement = driver.findElement(By.xpath("//h2[contains(text(),'More reasons to shop')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", firstElement);
		
		
		WebElement secondElement = driver.findElement(By.xpath("//h2[contains(text(),'Recommended for you')]"));
		
		js.executeScript("arguments[0].scrollIntoView(true);", secondElement);
		
		
		driver.close();
		
		driver.quit();

	}

}
