package shivamcode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		// take the text from print it 
		WebElement heading = driver.findElement(By.xpath("//*[@class='title']"));
		String text = heading.getText();
        System.out.println(text);
        
        //use of css
        System.out.println(heading.getCssValue("box-sizing"));

		// select option from dropdown and print its attribute (value)
		WebElement option = driver.findElement(By.xpath("//*[@id='country']//*[contains(text(),'France')]"));
		String optionValue	= option.getAttribute("value");
        System.out.println(optionValue);
		
		driver.quit();

	}


}
