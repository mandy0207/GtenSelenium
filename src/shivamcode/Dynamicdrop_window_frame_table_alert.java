package shivamcode;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Dynamicdrop_window_frame_table_alert {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		System.out.println(driver.getTitle());
		
		
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> city = driver.findElements(By.xpath("//*[contains(@class,'wikipedia-search-results')]/div/a"));
		
	    for(WebElement cities : city) {
			if(cities.getText().equalsIgnoreCase("Delhi University")) {
				cities.click();
			}
		}
	    
	    Thread.sleep(5000);
	    //for access the second tab
	    Set<String> windows = driver.getWindowHandles();
		
		Iterator<String> ws = windows.iterator();
	    String firstwindow = ws.next();
		String seconfwindow = ws.next();
		
		driver.switchTo().window(seconfwindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();

		driver.switchTo().window(firstwindow);
		System.out.println(driver.getTitle());
		
		
		//for the frame
		driver.switchTo().frame("frame-one796456169");
		
		WebElement textBox = driver.findElement(By.id("RESULT_TextField-0")); 
        textBox.sendKeys("shivam");
        
        driver.switchTo().defaultContent();
        
        //for the table
        List<WebElement> rowinfo = driver.findElements(By.xpath("//*[@name='BookTable']/tbody/tr[5]/td"));
        for(WebElement info : rowinfo) {
			System.out.println(info.getText());
		}
        
        //for the popup window and alert
        driver.findElement(By.xpath("//button[contains(text(),'Alert')]")).click();
        Alert popupalert = driver.switchTo().alert();
		Thread.sleep(2000);
		popupalert.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Confirm Box')]")).click();
		Thread.sleep(2000);
		popupalert.dismiss();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();
		Thread.sleep(2000);
		popupalert.sendKeys("Shivam");
		popupalert.accept();
		Thread.sleep(2000);
		
		//for drag and drop
        Actions drop = new Actions(driver);
		
		WebElement get = driver.findElement(By.id("draggable"));
		WebElement put = driver.findElement(By.id("droppable"));
		
		drop.dragAndDrop(get, put).perform();
		
		//for ismethod
        WebElement checkbox=driver.findElement(By.id("sunday"));
	    
        //check the presence of webelement
         System.out.println(checkbox.isDisplayed());
		
		//check is it clickable
		System.out.println(checkbox.isEnabled());
		
		//check it is selected or not
		System.out.println(checkbox.isSelected());
		
		checkbox.click();	
		
		//shift key actions
		WebElement name = driver.findElement(By.id("name"));
		drop.moveToElement(name).click().keyDown(Keys.SHIFT).sendKeys("aman").perform();
		
		//double and right click
		WebElement head=driver.findElement(By.xpath("//h2[contains(text(),'JS Alerts')]"));
		
		drop.moveToElement(head).doubleClick().perform();
				
		drop.moveToElement(head).contextClick().perform();
		
		//hover the mouse
		WebElement hover=driver.findElement(By.xpath("//h2[contains(text(),'Resizable')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", hover);
        
		drop.moveToElement(hover).perform();
	}


}
