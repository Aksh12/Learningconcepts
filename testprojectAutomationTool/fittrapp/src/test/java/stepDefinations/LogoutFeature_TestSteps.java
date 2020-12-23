package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import screens.GetStartedScreen;
import screens.HomeTabScreen;
import screens.LoginScreen;

public class LogoutFeature_TestSteps {
	
	GetStartedScreen getStarted;
	LoginScreen loginScreen;
	HomeTabScreen homeTab;
	
	@When("user clicks on Hamburger menu")
	public void user_clicks_on_hamburger_menu() {
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		homeTab = new HomeTabScreen(TestBase.driver);
	   homeTab.clickHamburgerMenu();
	}

	@When("user clicks on logout option")
	public void user_clicks_on_logout_option() {
	   homeTab.logout();
	}

	@Then("user is on proceed to further screen")
	public void user_is_on_proceed_to_further_screen() {
		loginScreen = new LoginScreen(TestBase.driver);
	   Assert.assertEquals(loginScreen.toProceedFurther(), "To proceed further, please login");
	}
	
}
