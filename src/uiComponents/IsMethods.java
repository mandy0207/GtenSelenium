package uiComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		WebElement firstChkBox=driver.findElement(By.xpath("(//*[@type='checkbox'])[1]"));
		
		boolean firstchecked=firstChkBox.isSelected();
		System.out.println(firstchecked);
		 
		firstChkBox.click();
		//verify button/checkbox is checked/selected or not
		System.out.println(firstChkBox.isSelected());
		
		//verify button/chechkbox is clickable
		System.out.println(firstChkBox.isEnabled());
		
		//verify webelement is displayed
		System.out.println(firstChkBox.isDisplayed());
	
		driver.quit();
		
		

	}

}
