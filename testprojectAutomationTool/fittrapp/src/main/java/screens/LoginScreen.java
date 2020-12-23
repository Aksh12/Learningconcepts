package screens;

import org.openqa.selenium.support.PageFactory;

import base.Constants;
import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginScreen extends ScreenBase{

	public LoginScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id=Constants.LOGIN_GOOGLE_ID)
	private AndroidElement googleLogin;
	
	@AndroidFindBy(xpath=Constants.To_PROCEED_FURTHER_XPATH)
	private AndroidElement toProceed;
	
	@AndroidFindBy(xpath=Constants.SELECT_GOOGLE_ACCOUNT_XPATH)
	private AndroidElement selectGmail;
	
	
	public HomeTabScreen loginWithGoogle() {
		googleLogin.click();
		selectGmail.click();
		return new HomeTabScreen(driver);
	}
	
	public String toProceedFurther() {
		return toProceed.getText();
	}

}
