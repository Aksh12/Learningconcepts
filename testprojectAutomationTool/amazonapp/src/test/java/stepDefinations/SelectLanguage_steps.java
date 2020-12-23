package stepDefinations;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.*;
import testBase.TestBase;
import screens_amazonApp.*;

public class SelectLanguage_steps {
	SignInToYourAccountScreen signIn;
	
	@Given("user launch the Amazon app for first time")
	public void user_launch_the_amazon_app_for_first_time() throws IOException {
		TestBase.setUp();
	}
	
	@When("user select {string} language from the provided list")
	public void user_select_language_from_the_provided_list(String string) {
		LanguageSelectionScreen langSelectScreen = new LanguageSelectionScreen();
		signIn = langSelectScreen.selectYourLanguage(string);
	}


	@Then("AUT should be displayed in the selected {string}")
	public void aut_should_be_displayed_in_the_selected_language(String displayedLanguage) {
	  String selectedLanguage =  signIn.verifyLanguageSelection();
	  System.out.println("selectLanguage : " +  selectedLanguage);
	  System.out.println("displayedlanguage: " + displayedLanguage);
	  Assert.assertTrue(selectedLanguage.equals(displayedLanguage));
	  TestBase.tearDown();
	}

	
}
