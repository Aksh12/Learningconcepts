package localRunner;

import base.ScreenBase;
import io.appium.java_client.android.AndroidElement;
import io.testproject.java.enums.TakeScreenshotConditionType;
import io.testproject.java.sdk.v2.Runner;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;
import io.testproject.java.sdk.v2.enums.ExecutionResult;
import screens.ComposeMessageScreen;
import screens.ConversationScreen;
import screens.MessageThreadScreen;
import screens.ProvisioningScreen;
import screens.StartMessagingScreen;

public class LocalRunner {

	public static final String devToken = "4ieRzR7cfQuQwpHvaZbGoJ7954y5IQT5XXWOvPZYRtA";
	public static final String deviceID = "74ad6a6a";
	public static final String appPackage = "com.verizon.messaging.vzmsgs";
	public static final String appActivity = "com.verizon.mms.ui.activity.Provisioning";

	public static void main(String[] args) throws InstantiationException {
		Runner run = Runner.createAndroid("4ieRzR7cfQuQwpHvaZbGoJ7954y5IQT5XXWOvPZYRtA", "74ad6a6a",
				appPackage, appActivity);
		AndroidDriver<AndroidElement> driver = (AndroidDriver) run.getDriver();
		
		ProvisioningScreen provisionscreen;
		StartMessagingScreen startmessagescreen;
		ConversationScreen conversationscreen;
		ComposeMessageScreen composemessagescreen;
		MessageThreadScreen messagethreadscreen;
		

		conversationscreen = new ConversationScreen(driver);
		provisionscreen = new ProvisioningScreen(driver);
		startmessagescreen = new StartMessagingScreen(driver);
		composemessagescreen = new ComposeMessageScreen(driver);
		messagethreadscreen = new MessageThreadScreen(driver);
		
		driver.resetApp();
		
		startmessagescreen.clickStartMessagingButton();
		provisionscreen.dontAskAgain();
		provisionscreen.provisioningStatus();;
		
		
		if((conversationscreen.searchButton.isDisplayed())) {
			System.out.println("Pass");
			
		}else {
			System.out.println("Failed");
			
		}
		
		conversationscreen.composeNewMessage();
		composemessagescreen.enterToField("8861715105");
		composemessagescreen.enterText("Testing");
		composemessagescreen.sendMessage();
			if(composemessagescreen.validateMessageStatus()) {
				
				System.out.println("Pass");
				System.out.println("from here pass");
				
			}else {
				
				System.out.println("Fail");
				System.out.println("from here fail");
				
			}
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			messagethreadscreen.messageOptions("Message Info");
			

//			conversationscreen.composeNewMessage();
//			composemessagescreen.enterToField("8861715105");
//			composemessagescreen.enterText("Testing dft Message Application");
//			ScreenBase.hideKeyboard();
//			ScreenBase.back();
//			if(conversationscreen.draftSMS()) {
//				System.out.println("Pass");
//			}else {
//				System.out.println("Fail");
//			}
//			
//		} 


	}
}

