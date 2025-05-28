package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	    System.out.println("Test has been started!");
	  }

	@Override
	  public void onTestSuccess(ITestResult result) {
		System.out.println("Test PASS!");
	  }

	@Override
	  public void onTestFailure(ITestResult result) {
		System.out.println("Test FAILED!");
	  }


	@Override
	  public void onTestSkipped(ITestResult result) {
		System.out.println("Test SKIPPED!");
	  }


	@Override
	  public void onStart(ITestContext context) {
		System.out.println("Test Start!");
	  }

      @Override
	  public void onFinish(ITestContext context) {
    	  System.out.println("Test Finish!");
	  }

}
