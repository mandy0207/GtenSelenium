package shivamcode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class asserttion_dataprovider {

    @Test
    @Parameters({"username", "password"})
    public void assertion(String username,String password) throws InterruptedException {
    	SoftAssert softAsset = new SoftAssert();
        String expectedHeading = "PRODUCT STORE";
        String expectedstatus = "Welcome Shivam";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        String actualHeading = driver.findElement(By.xpath("//a[@id='nava']")).getText();
        
        Assert.assertEquals(actualHeading, expectedHeading);
        
        driver.findElement(By.id("login2")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.findElement(By.cssSelector("#loginusername")).sendKeys(username);
        driver.findElement(By.cssSelector("#loginpassword")).sendKeys(password);
        Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[onclick='logIn()']")).click();
		Thread.sleep(1000);
		String actualstatus = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
		softAsset.assertEquals(actualstatus, expectedstatus);
		softAsset.assertAll();

    }
}
