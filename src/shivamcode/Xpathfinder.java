package shivamcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathfinder {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("shivkum4567ty@yopmail.com");
		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("Qwer@12345");
		//parent/child 
		driver.findElement(By.xpath("//*[@class='buttons']//input[@value='Log in']")).click();
		// parent[index]/child[index]
		driver.findElement(By.xpath("(//ul[@class='list'])[1]/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@class =\"title\"]//*[contains(text(),' Cell phones')]")).click();
		//xpath by text
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Smartphone')]")).click();
        WebElement txtbox=driver.findElement(By.xpath("//*[contains(@name,'.EnteredQuantity')]"));
		
		Thread.sleep(1000);
		txtbox.clear();
		txtbox.sendKeys("2");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-43']")).click();
		driver.quit();
		
}

}
