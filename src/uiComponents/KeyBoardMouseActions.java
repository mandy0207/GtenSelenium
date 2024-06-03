package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardMouseActions {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		
		Actions act = new Actions(driver);
		WebElement others=driver.findElement(By.id("others"));
		//hover
		act.moveToElement(others).perform();
		
		WebElement textBox=driver.findElement(By.id("single-input-field"));
		act.moveToElement(textBox).click().sendKeys("rahul").perform();
		
		textBox.clear();
		//pressing any key while performing actions
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("rahul").perform();
		
		WebElement msg=driver.findElement(By.id("button-one"));
		
		//double click on an element
		act.moveToElement(msg).doubleClick().perform();
		
		//Right Click
		act.moveToElement(msg).contextClick().perform();
	
		driver.quit();
		
		
		
		
		
		
		

	}

}
