package screens_amazonApp;

import java.util.List;

import org.openqa.selenium.support.PageFactory;

import commonUtils.CommonUtility;
import constants.Constants;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import testBase.TestBase;

public class LanguageSelectionScreen extends CommonUtility{

	public LanguageSelectionScreen() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(className=Constants.SELECT_LANGUAGE_CLASSNAME)
	private static List<AndroidElement> selectLanguage;
	
	public static SignInToYourAccountScreen selectYourLanguage(String enterLanguage) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    TestBase.waitForElement(Constants.SELECT_LANGUAGE_CLASSNAME, "CLASSNAME");
	    for(int i=1; i<=selectLanguage.size(); i++) {
	    	if(selectLanguage.get(i).getAttribute("content-desc").contains(enterLanguage)) {
	    		selectLanguage.get(i).click();
	    		try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
	    		break;
	    	}else {
	    	
	    	}
	    }
		return new SignInToYourAccountScreen();
	}


}
