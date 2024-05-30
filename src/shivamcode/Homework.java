package shivamcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
	
	 public static void main(String[] args) throws InterruptedException {
	       
		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			
			
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.xpath("//input[@class='email']")).sendKeys("shivkum4567ty@yopmail.com");
			driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Qwer@12345");
			driver.findElement(By.xpath("//*[@class='buttons']//input[@value='Log in']")).click();
			driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click();
			
			Thread.sleep(5000);

	            // Print all products in the clothing section
	            List<WebElement> allproducts = driver.findElements(By.className("product-title"));
	            for (WebElement product : allproducts) {
	                String productName = product.getText();
	                System.out.println(productName);
                    
	                Thread.sleep(5000);
	                
	                // click on the product is a Blue Jeans.
	                if (productName.contains("Blue Jeans")) {
	                    WebElement clicktheproduct = driver.findElement(By.xpath("//*[contains(text(),'Blue Jean')]"));
	                    clicktheproduct.click();
	                    System.out.println("click the product: " + productName);
	                    break;
	                }
	            }
	        
	          driver.quit();  
	    }

}
