package base;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listners implements ITestListener {
	
	public static Date d = new Date();
	public static String fileName = "Extent_" + d.toString().replace(" ", "_").replace(":", "_") + ".html";
	
	private static ExtentReports extent = ExtentManager.createInstances(fileName);
	public static ThreadLocal<ExtentTest> testReport =  new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		ExtentTest test = extent.createTest("TestName : " + result.getMethod().getMethodName());
		testReport.set(test);
		
	}

	public void onTestSuccess(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText =  "<b>" + "TestName = " + methodName.toUpperCase() + "<b>";
		Markup m= MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		testReport.get().pass(m);
			
		
	}

	public void onTestFailure(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "TestName : " + methodName.toUpperCase() + "<b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
		testReport.get().fail(m);
	}

	public void onTestSkipped(ITestResult result) {
		
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "TestName : " + methodName.toUpperCase() + "<b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
		testReport.get().skip(m);
	}

	public void onFinish(ITestContext context) {
		
	}
	
	

}
