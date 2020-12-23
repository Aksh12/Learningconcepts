package testcases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.springframework.util.Assert;

import io.appium.java_client.android.AndroidElement;
import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.AndroidTest;
import io.testproject.java.sdk.v2.tests.helpers.AndroidTestHelper;
import screens.ComposeMessageScreen;
import screens.ConversationScreen;

@Test(name = "2.Verify Sending of SMS")
public class Test_Sending_SMS implements AndroidTest{
	
	ConversationScreen conversationscreen;
	ComposeMessageScreen composemessagescreen;

	@Override
	public ExecutionResult execute(AndroidTestHelper helper) throws FailureException {
		AndroidDriver<AndroidElement> driver = helper.getDriver();
		TestReporter reporter = helper.getReporter();
		
		conversationscreen = new ConversationScreen(driver);
		composemessagescreen = new ComposeMessageScreen(driver);
		
		driver.launchApp();
		
		conversationscreen.composeNewMessage();
		reporter.step("Clicked on Compose Message");
		composemessagescreen.enterToField("8861715105");
		reporter.step("Entered number in to field");
		composemessagescreen.enterText("Testing Automating Message Application");
		reporter.step("Entered text in to field");
		composemessagescreen.sendMessage();
		reporter.step("clicked on Send button");
		driver.setTimeout(2000);
			if(composemessagescreen.validateMessageStatus()) {
				reporter.step("SMS is sent", true, TakeScreenshotConditionType.Success );
				reporter.getStepReports();
				reporter.result("Test case completed Successfully !!");
				return ExecutionResult.PASSED;
				
			}else {
				reporter.step("SMS not sent", false, TakeScreenshotConditionType.Failure );
				reporter.getStepReports();
				reporter.result("Test case Failed !!");
				return ExecutionResult.FAILED;
			}
		} 
		

	}

