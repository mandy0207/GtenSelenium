package uiComponents;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:flipkart.com");

		TakesScreenshot screeshot = (TakesScreenshot) driver;

		File src = screeshot.getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir") + "//Screenshots//screenshot"+getDateTime()+".png");

		FileUtils.moveFile(src, dest);

		driver.quit();
	}

	public static String getDateTime() {
		
		Random rand = new Random(); 
		int value = rand.nextInt(100000); 
		return Integer.toString(value);
	}
}
