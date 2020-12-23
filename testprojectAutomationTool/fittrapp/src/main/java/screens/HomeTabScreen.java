package screens;

import org.openqa.selenium.support.PageFactory;

import base.Constants;
import base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomeTabScreen extends ScreenBase{

	public HomeTabScreen(AndroidDriver<AndroidElement> driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@AndroidFindBy(xpath=Constants.TODAYS_SCHEDULE_XPATH)
	private AndroidElement todaysSchedule;

	@AndroidFindBy(id=Constants.LOGOUT_ID)
	private AndroidElement logout;
	
	@AndroidFindBy(id=Constants.HAMBURGER_MENU)
	private AndroidElement hamburgerMenu;

	public boolean todaysScheduleOption() {
		waitForElement(Constants.TODAYS_SCHEDULE_XPATH, "XPATH");
		return todaysSchedule.isDisplayed();
	}
	
	public void clickHamburgerMenu() {
		hamburgerMenu.click();
	}
	
	public String logout() {
		
		logout.click();
		LoginScreen lg = new LoginScreen(driver);
		return lg.toProceedFurther();
		
	}

}
