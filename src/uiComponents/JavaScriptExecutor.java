package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		JavascriptExecutor js = (JavascriptExecutor )driver;
		WebElement textBox= driver.findElement(By.id("single-input-field"));
		WebElement btn = driver.findElement(By.id("button-one"));
		
		js.executeScript("arguments[0].value='Hello Folks';", textBox);
		js.executeScript("arguments[0].click();", btn);
		
		
		driver.navigate().to("https://www.noon.com/uae-en/");
		
		Thread.sleep(2000);
		//scrol to particular value of y axis
		js.executeScript("window.scrollBy(0, 1000);");
		
		//scroll to desired element
		WebElement desiredElement = driver.findElement(By.xpath("//*[contains(text(),'Recommended for you')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", desiredElement);
		
		
	//	js.executeScript("window.scrollBy(0, );");
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
