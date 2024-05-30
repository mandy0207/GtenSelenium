package AutomationWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

import org.openqa.selenium.By;

public class Task {

	 public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");


			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.name("Email")).sendKeys("lubna.mukhtar@yopmail.com");
			driver.findElement(By.id("Password")).sendKeys("Test@123");
			
			// Login  button
			WebElement loginButton = driver.findElement(By.className("login-button"));
			loginButton.click();
			
			driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[4]/a")).click();
			
			
			
			  List<WebElement> allProducts = driver.findElements(By.className("product-title"));
		        for (int i = 0; i < allProducts.size(); i++) {
		            WebElement product = allProducts.get(i);
		            String productName = product.getText();
		            System.out.println(productName);
		            
		            Thread.sleep(5000);

		            if (productName.contains("Green and blue Sneaker")) {
		                WebElement shirtProduct = product.findElement(By.xpath("//*[contains(text(),'Green and blue Sneaker')]"));
		                shirtProduct.click();
		                System.out.println(productName);
		                
		               break;
		               
		            }
		            
		        }
		            
		             // Logout
		               driver.findElement(By.xpath("//a[@class='ico-logout']")).click();

		                // Close the browser
		               driver.quit();
		            
		        }
	 }

