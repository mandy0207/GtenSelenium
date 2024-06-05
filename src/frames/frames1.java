package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoqa.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[text()='Elements']")));
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//h5[contains(text(), 'Alerts, Frame & Windows')]")).click();
		
		
		driver.findElement(By.xpath("//*[text()='Frames']")).click();
		
		
		
		driver.switchTo().frame("frame1");
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("sampleHeading")));
		
		String message=driver.findElement(By.id("sampleHeading")).getText();
		
		System.out.println(message);
		
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		System.out.println(driver.findElement(By.id("sampleHeading")).getText());
		
		
		
		Thread.sleep(15000);
		
		driver.close();
		
		driver.quit();
		
		

	}

}
