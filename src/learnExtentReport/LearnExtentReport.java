package learnExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReport {
	
	ExtentReports extent;

	@BeforeTest
	public void generateReport() {
		String reportPath= System.getProperty("user.dir")+"//Reports//AutomationReport.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("Automation Report");
		reporter.config().setReportName("Gten Automation");
		
	    extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name", "Zahid");
		extent.setSystemInfo("Brand", "DEMO SHOP");
	}
	
	@Test
	public void mytest1() {
		extent.createTest("mytest1");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.quit();
		extent.flush();
	}
	
	@Test
	public void mytest2() {
		ExtentTest test = extent.createTest("mytest2");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://flipkart.com/");
		test.log(Status.PASS, "Hello bro I am passed");
		driver.quit();
		extent.flush();
	}
	
	
	@Test
	public void mytest3() {
		ExtentTest test = extent.createTest("mytest3");
		test.log(Status.FAIL, "failing deliberately");
		Assert.fail();
		extent.flush();
		
	}
	
	
}
