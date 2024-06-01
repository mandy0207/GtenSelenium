package uiComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTables {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> rowData = driver.findElements(By.xpath("//*[@id='dtBasicExample']/tbody/tr[4]/td"));
		
		for(WebElement data : rowData) {
			System.out.println(data.getText());
		}
//		rowData.forEach(data->{
//			System.out.println(data.getText());
//		});
		driver.quit();
	}


}
