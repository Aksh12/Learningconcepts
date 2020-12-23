package screens;

import org.openqa.selenium.support.PageFactory;

import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SkipSignInScreen extends ScreenBase {

	private static AndroidDriver driver;
	
	public SkipSignInScreen(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id="")
	private AndroidElement SKIP_SIGN_IN;
	
	public void skipSignIn() {
		SKIP_SIGN_IN.click();
	}
	

}
