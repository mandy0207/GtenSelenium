package learnListener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("I am in on test start" +" :  "+ result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("I am in on test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("I am in on test failure");
	}
	

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("i am in finish");
	}

	
	
	
	
}
