package testcases;

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
import screens.MessageThreadScreen;

@Test(name = "4. Test Lock Message Option")
public class Test_LockMessageOption implements AndroidTest{

	ConversationScreen conversationscreen;
	ComposeMessageScreen composemessagescreen;
	MessageThreadScreen messagethreadscreen;
	
	@Override
	public ExecutionResult execute(AndroidTestHelper helper) throws FailureException {
		
		AndroidDriver driver = helper.getDriver();
	    TestReporter reporter = helper.getReporter();
	    
	    conversationscreen = new ConversationScreen(driver);
		composemessagescreen = new ComposeMessageScreen(driver);
		messagethreadscreen = new MessageThreadScreen(driver);
		
		if(messagethreadscreen.messageOptions("Lock Message")) {
			reporter.step("Message is locked");
			reporter.step("Lock Message functionality success", true, TakeScreenshotConditionType.Success);
			reporter.getStepReports();
			reporter.result("Test case completed Successfully !!");
			return ExecutionResult.PASSED;
		}else {
			reporter.step("Lock Message Functionality Failed", false, TakeScreenshotConditionType.Failure);
			reporter.getStepReports();
			reporter.result("Test case Failed !!");
			return ExecutionResult.FAILED;
		}
		
	}

}
