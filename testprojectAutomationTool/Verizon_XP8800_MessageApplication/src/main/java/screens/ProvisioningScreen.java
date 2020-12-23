package screens;

import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;

public class ProvisioningScreen extends ScreenBase {
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/skip_provisioning_tv")
	public AndroidElement provisioningButton;
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/dontAskaginCheckBox")
	public AndroidElement dontAskAgainChkBox;

	public ProvisioningScreen(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public ProvisioningScreen dontAskAgain() {
		dontAskAgainChkBox.click();
		return this;
	}
	
	public ConversationScreen provisioningStatus() {
		provisioningButton.click();
		return new ConversationScreen(driver);
		
	}
	


}
