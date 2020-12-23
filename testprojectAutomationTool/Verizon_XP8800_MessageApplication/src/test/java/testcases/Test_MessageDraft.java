package testcases;

import base.ScreenBase;
import io.appium.java_client.HidesKeyboard;
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

@Test(name = "3.Verify saving SMS as Draft by pressing back key")
public class Test_MessageDraft implements AndroidTest {

	ConversationScreen conversationscreen;
	ComposeMessageScreen composemessagescreen;

	@Override
	public ExecutionResult execute(AndroidTestHelper helper) throws FailureException {

		AndroidDriver driver = helper.getDriver();
		TestReporter reporter = helper.getReporter();

		conversationscreen = new ConversationScreen(driver);
		composemessagescreen = new ComposeMessageScreen(driver);

		driver.launchApp();

		conversationscreen.composeNewMessage();
		reporter.step("Clicked on Compose Message");
		composemessagescreen.enterToField("8861715105");
		reporter.step("Entered number in to field");
		composemessagescreen.enterText("Testing dft Message Application");
		reporter.step("Entered text in to field");
		ScreenBase.hideKeyboard();
		reporter.step("KeyBoard is hide");
		ScreenBase.back();
		reporter.step("Pressed Back key");

		if (conversationscreen.draftSMS()) {
			reporter.step("Message is saved as Draft", true, TakeScreenshotConditionType.Success);
			reporter.getStepReports();
			reporter.result("Test case completed Successfully !!");
			return ExecutionResult.PASSED;
		} else {

			reporter.step("Draft functionality Failed", false, TakeScreenshotConditionType.Failure);
			reporter.getStepReports();
			reporter.result("Test case Failed !!");
			return ExecutionResult.FAILED;
		}

	}

}
