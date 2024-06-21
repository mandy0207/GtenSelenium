package basics;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemoBookClick {
	WebDriver driver;
	@Test
	public void test() throws InterruptedException, MalformedURLException {
		ChromeOptions opt = new ChromeOptions();
		
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), opt);
		driver.manage().window().maximize();
	
		driver.get("https://demowebshop.tricentis.com/");
		
		List<WebElement> listbox = driver.findElements(By.xpath("(//*[@class='listbox'])[1]//li/a"));
		
		for(WebElement listElem : listbox) {
			if(getElementText(listElem).equalsIgnoreCase("Books")) {
				javaScriptClickElement(listElem);
				break;
			}
		}
		
		System.out.println(driver.getTitle());
		driver.quit();
		

	}
	
	public  String getElementText(WebElement element) {
		try {
			return element.getText();
		}
		catch(Exception e) {
			Assert.assertFalse(true, "Not able to catch text of element");
		}
		return "";
	}
	
	public  void javaScriptClickElement(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

}
