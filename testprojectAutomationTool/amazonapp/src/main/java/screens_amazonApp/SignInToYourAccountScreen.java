package screens_amazonApp;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import commonUtils.CommonUtility;
import constants.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.TestBase;

public class SignInToYourAccountScreen extends CommonUtility {

	public SignInToYourAccountScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className=Constants.LANGUAGE_VERIFY_CLASSNAME)
	private AndroidElement languageVerifyText;
	
	public String verifyLanguageSelection() {
		System.out.println("lang text from method : " + languageVerifyText.getText());
		return languageVerifyText.getText();
		
	}



}
