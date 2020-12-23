package testcases;

import io.testproject.java.annotations.v2.Test;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import io.testproject.java.sdk.v2.exceptions.FailureException;
import io.testproject.java.sdk.v2.reporters.TestReporter;
import io.testproject.java.sdk.v2.tests.AndroidTest;
import io.testproject.java.sdk.v2.tests.helpers.AndroidTestHelper;
import screens.ConversationScreen;
import screens.ProvisioningScreen;
import screens.StartMessagingScreen;


@Test(name = "1.Verify StartMessaging & Test_SkipProvision Functionality")
public class Test_SkipProvision implements AndroidTest {
	
	ProvisioningScreen provisionscreen;
	StartMessagingScreen startmessagescreen;
	ConversationScreen conversationscreen;

	@Override
	public ExecutionResult execute(AndroidTestHelper helper) throws FailureException {
		AndroidDriver <AndroidElement> driver = (AndroidDriver) helper.getDriver();
		TestReporter reporter = helper.getReporter();
		
		conversationscreen = new ConversationScreen(driver);
		provisionscreen = new ProvisioningScreen(driver);
		startmessagescreen = new StartMessagingScreen(driver);
		
		driver.resetApp();
		driver.launchApp();
		
		startmessagescreen.clickStartMessagingButton();
		reporter.step("Clicked in start Messaging Button");
		provisionscreen.dontAskAgain();
		reporter.step("Clicked on dontAskAgain option");
		provisionscreen.provisioningStatus();
		reporter.step("Clicked on skip provision option");
		
		
		
		if((conversationscreen.searchButton.isDisplayed())) {
			reporter.step("Now on Conversation Screen", true, TakeScreenshotConditionType.Success );
			reporter.getStepReports();
			reporter.result("Test case completed Successfully !!");
			return ExecutionResult.PASSED;
			
		}else {
			reporter.step("Skip Provision option is not working", false, TakeScreenshotConditionType.Failure );
			reporter.getStepReports();
			reporter.result("Test case Failed !!");
			return ExecutionResult.FAILED;
			
		}	
	}


}
