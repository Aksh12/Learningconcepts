package screens;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.ScreenBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.functions.ExpectedCondition;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.testproject.java.annotations.v2.Test;
import io.testproject.java.sdk.v2.drivers.AndroidDriver;
import junit.framework.Assert;

public class ConversationScreen extends ScreenBase {
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/searchbutton")
	public AndroidElement searchButton;
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/composeFab")
	private AndroidElement composeNewSMSMMS;
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/draft")
	private AndroidElement draftMessageSMS;
	
	@AndroidFindBy(id="com.verizon.messaging.vzmsgs:id/main")
	private AndroidElement selectConversation;

	public ConversationScreen(AndroidDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public ConversationScreen searchConversation() {
		searchButton.click();
		return this;
	}
	
	public ConversationScreen composeNewMessage() {
		composeNewSMSMMS.click();
		return this;
	}
	
	public MessageThreadScreen selectConversation() {
		selectConversation.click();
		
		return new MessageThreadScreen(driver);
	}
	
	public boolean draftSMS() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		if(wait.until(ExpectedConditions.visibilityOf(draftMessageSMS)).getAttribute("text").equals("Draft")) {
		return (draftMessageSMS.isDisplayed());
		}else {
		 
			return false;
		}
		
	}

}
