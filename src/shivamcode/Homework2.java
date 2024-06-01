package shivamcode;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));

        ///driver.get("https://www.redbus.in/");
        //Thread.sleep(5000);
        
        
        //WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Government Buses')]"));
        
        //driver.get("https://www.reliancedigital.in/");
        //Thread.sleep(5000);
        //WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Great Deals on Electronics')]"));
        
        driver.get("https://timesofindia.indiatimes.com/");
        Thread.sleep(5000);
        WebElement element = driver.findElement(By.xpath("//h2[normalize-space()='Spotlight']"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        
        Thread.sleep(5000);
        

	}

}
