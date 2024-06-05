package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day3_basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement doc_dropdown= driver.findElement(By.id("drop1"));
		
		Select drpdown= new Select(doc_dropdown);
		
		List<WebElement> list = driver.findElements(By.xpath("//select[@id='drop1']/option"));
		
		String selectedElement = "doc 3";
		
		for (WebElement i: list) {
			System.out.println(i.getText());
			
			if (i.getText().equalsIgnoreCase(selectedElement) ) {
				
				drpdown.selectByVisibleText(selectedElement);
				
			}

	}
}
}
