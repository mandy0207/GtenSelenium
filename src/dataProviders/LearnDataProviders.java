package dataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataProviders {

	@Test(dataProvider="getData")
	public void mytest(String name, String age) {
		
		System.out.println("HELLO FOLKS");
		System.out.println(name + " : "+ age);
			
	}

	
	@DataProvider
	public Object[][] getData() {
		
		String [][] data = new String[2][2];
		data[0][0]="Prashant";
		data[0][1] ="26";

		data[1][0]= "Zahid";
		data[1][1]="27";
		
		return data;
	}

}
