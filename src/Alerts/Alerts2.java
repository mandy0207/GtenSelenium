package Alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert al= driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		al.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(3000);
		
		al.accept();
		

	}

}
