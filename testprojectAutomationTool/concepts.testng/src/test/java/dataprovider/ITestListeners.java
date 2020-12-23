package dataprovider;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListeners implements ITestListener, IExecutionListener {

	public void onExecutionStart() {
		System.out.println("----on execution start-----");
	}

	public void onExecutionFinish() {
		// TODO Auto-generated method stub
		System.out.println("-----on execution finish-----");
		
	}

	public void onTestSuccess(ITestResult result) {
	
		System.out.println(result.getMethod().getMethodName() +  "******Passed******");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed");
	
	}

	public void onFinish(ITestContext context) {
		System.out.println(context.getName() + " : finished********");
		
	}
	
	public void onStart(ITestContext context) {
		System.out.println(context.getName() + " : started*********");
		
	}

}
