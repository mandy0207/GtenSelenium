package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		/**CSS SYNTAX
		 * 1) if you have a classname= .className
		 * 2) if you have id = #id
		 * 3) general syntax of css=  tagname[attribute='value'] or [attribute='value']
		 * 4) In case of multiple classes omit space and use dot (.) eg=>  .button-1.login-button
		 * 5) .list li:nth-child(4) a
		 * 6) [attribute*='value']   for regular path
		 */
		
		driver.findElement(By.cssSelector(".ico-login")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("mypassword");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		driver.findElement(By.cssSelector(".list li:nth-child(4) a")).click();
	
		driver.quit();
		
		
		

	}

}
