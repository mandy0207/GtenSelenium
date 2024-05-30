package shivamcode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectallproduct {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		 WebElement loginbutton=driver.findElement(By.className("submit-button"));
		loginbutton.click();
	 
		//returns list of web elements
	    List<WebElement> allproducts = driver.findElements(By.className("btn_inventory"));
	    System.out.println(allproducts.size());
	    
	    for(int i=0;i<allproducts.size();i++) {
	    	allproducts.get(i).click();	    }
	    
	    Thread.sleep(10000);
	    
	  //returns list of web elements
	  /*  List<WebElement> allproduct = driver.findElements(By.className("btn_inventory"));
	    System.out.println(allproduct.size());
	    
	    for(WebElement removetheproduct : allproduct)
	    {
	    	removetheproduct.click();
	    } */
	    

	}

}
