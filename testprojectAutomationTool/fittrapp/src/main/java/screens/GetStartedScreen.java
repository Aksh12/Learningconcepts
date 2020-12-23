package screens;

import org.openqa.selenium.support.PageFactory;

import base.Constants;
import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GetStartedScreen extends ScreenBase {



	public GetStartedScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}



	@AndroidFindBy(id=Constants.GET_STARTED_ID)
	private AndroidElement getStarted;

	public LoginScreen selectGetStarted() {
		waitForElement(Constants.GET_STARTED_ID, "ID");
		getStarted.click();
		return new LoginScreen(driver);

	}

}
