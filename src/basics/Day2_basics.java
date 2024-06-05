package basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2_basics {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//opens a url
		driver.get("https://omayo.blogspot.com/");
		
		// grab a title
		String title = driver.getTitle();
		
		System.out.println(title);
		
		WebElement doc_dropdown= driver.findElement(By.id("drop1"));
		
		Select drpdown= new Select(doc_dropdown);
		
//		drpdown.selectByValue("def");
//		
//		Thread.sleep(4000);
//		
		drpdown.selectByVisibleText("doc 2");
		
		
//		drpdown.selectByIndex(4);//doc 4 should be selelcted
		
		
			
		
			
		}

		
	}


