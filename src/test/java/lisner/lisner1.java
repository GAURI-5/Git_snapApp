package lisner;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class lisner1 implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println(testname+"test case started");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println(testname+"successful"); 
		}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println(testname+"Failed ");
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println(testname+"Skipped ");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println(testname+" failed within percentage");
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		String testname=result.getName();
		System.out.println(testname+" failed with timeout");
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		String testname=context.getName();
		System.out.println(testname+" on start");
	
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		String testname=context.getName();
		System.out.println(testname+" on finish");
		
	}

}
