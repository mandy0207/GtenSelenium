package Working;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//Open URL
		driver.get("https://demowebshop.tricentis.com");
		
		driver.findElement(By.xpath("//*[@href='/login']")).click();
		driver.findElement(By.xpath("//*[@class='email']")).sendKeys("zahid@globaltestingexperts.com");
		driver.findElement(By.id("Password")).sendKeys("Zahid@123");
		Thread.sleep(2000);
		// Login button
		WebElement loginButton = driver.findElement(By.className("login-button"));
		loginButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click();
		
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Custom T-Shirt')]")).click();
		
	}

}
