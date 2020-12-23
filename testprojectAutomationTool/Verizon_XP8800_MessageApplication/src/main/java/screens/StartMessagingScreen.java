package screens;

import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;

public class StartMessagingScreen extends ScreenBase {
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/start")
	public AndroidElement startMessagingButton;

	public StartMessagingScreen(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public ProvisioningScreen clickStartMessagingButton() {
		startMessagingButton.click();
		return new ProvisioningScreen(driver);
	}

}
