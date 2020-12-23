package testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase {

	public ExtentHtmlReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setReport() {

		ExtentHtmlReporter htmlreport = new ExtentHtmlReporter(".//reports//extent.html");

		htmlreport.config().setEncoding("utf-8");
		htmlreport.config().setDocumentTitle("XP880 APP");
		htmlreport.config().setReportName("Automation Test Result");
		htmlreport.config().setTheme(Theme.STANDARD);

		extent = new ExtentReports();
		extent.attachReporter(htmlreport);

		extent.setSystemInfo("Automation Tester", "Akshay Soni");
		extent.setSystemInfo("build-ingo", "Android v16");
		extent.setSystemInfo("Organization", "Sonim");

	}

	@AfterTest
	public void endReport() {
		extent.flush();
	}

	@Test
	public void doLogin() {

		test = extent.createTest("login test");
		System.out.println("Execute login test");
	}

	@Test
	public void registration() {

		test = extent.createTest("Registration test");
		System.out.println("Execute registration");
		Assert.fail("Test registration failed");

	}

	@Test
	public void sendMail() {
		test = extent.createTest("Send email");
		System.out.println("Executing sending email test");
		throw new SkipException("Test sending email is skipped");

	}

	@AfterMethod
	public void teadDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			String methodName = result.getMethod().getMethodName();

			String logText = "<b>" + "TEST CASE : - " + methodName.toUpperCase() + " FAILED" + "</>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.RED);
			test.fail(m);

		} else if (result.getStatus() == ITestResult.SUCCESS) {

			String methodName = result.getMethod().getMethodName();

			String logText = "<b>" + "TEST CASE : - " + methodName.toUpperCase() + " PASSED" + "</>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			test.pass(m);

		}

		else if (result.getStatus() == ITestResult.SKIP) {
			String methodName = result.getMethod().getMethodName();
			String logText = "<b>" + "TEST CASE : - " + methodName.toUpperCase() + " SKIPPED" + "</>";
			Markup m = MarkupHelper.createLabel(logText, ExtentColor.YELLOW);
			test.skip(m);

		}

	}

}
