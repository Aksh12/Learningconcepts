package screens;

import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GetStartedScreen extends ScreenBase {

	public GetStartedScreen(AndroidDriver driver) {
	super(driver);
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	
	

}
