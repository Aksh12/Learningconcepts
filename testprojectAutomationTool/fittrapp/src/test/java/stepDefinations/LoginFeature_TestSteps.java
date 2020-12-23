package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import screens.GetStartedScreen;
import screens.HomeTabScreen;
import screens.LoginScreen;

public class LoginFeature_TestSteps{
	
	GetStartedScreen getStarted;
	LoginScreen loginScreen;
	HomeTabScreen homeTab;
	
	@Before
	public void setUp() throws IOException {
		System.out.println("Am in before setup");
		TestBase.setUp();
		System.out.println("open");
	}
	
	@After
	public void tearDown() {
		System.out.println("Am in after tear down");
		TestBase.quit();
		System.out.println("closed");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		getStarted = new GetStartedScreen(TestBase.driver);
		loginScreen = getStarted.selectGetStarted();
	}

	@And("user selects Log in with Google option and chooses Gmail Account")
	public void user_selects_log_in_with_google_option() {
		homeTab = loginScreen.loginWithGoogle();
	}

	@Then("user is on Todays Schedule screen")
	public void user_is_on_todays_schedule_screen() {
	    Assert.assertTrue(homeTab.todaysScheduleOption());
	}
	
	


}
