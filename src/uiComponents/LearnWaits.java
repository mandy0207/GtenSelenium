package uiComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*
		 * Implicit wait
		 * 1. Global wait - applies to all the elements
		 * 2. Code redundancy
		 * 3. saving time . if any element shows up before implicit wait threshold time, 
		 * it will not keep waiting instead go ahead for execution.
		 */
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));  
		driver.get("https://selenium.qabible.in/dynamic-load.php");
		driver.findElement(By.cssSelector("[id='save']")).click();
		WebElement name=driver.findElement(By.cssSelector(".card-title"));

		System.out.println(name.getText());
		driver.findElement(By.cssSelector("#progress-bars")).click();
		driver.findElement(By.cssSelector("#downloadButton")).click();
		
		
		/**
		 * Explicit wait
		 */
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		WebElement element =driver.findElement(By.cssSelector("[class='progress-label']"));
		System.out.println("Before waiting :"+element.getText());
		wait.until(ExpectedConditions.textToBePresentInElement(element, "Complete!"));
		System.out.println("After waiting : "+element.getText());
		
		
		
		driver.quit();

	}

}
