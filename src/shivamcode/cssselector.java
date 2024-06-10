package shivamcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class cssselector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4)); 
		driver.findElement(By.id("login2")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.findElement(By.cssSelector("#loginusername")).sendKeys("testmay2510pm");
		driver.findElement(By.cssSelector("#loginpassword")).sendKeys("Rewq@1234");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		WebElement element =driver.findElement(By.cssSelector("button[onclick='logIn()']"));
		element.click();
		System.out.println("Before waiting :"+element.getText());
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("logout2"), "Log out"));
        WebElement logOutElement = driver.findElement(By.id("logout2"));
        System.out.println("After waiting : " + logOutElement.getText());


	}

}
