package stepsDefinations;

import io.cucumber.java.en.*;

public class LoginSteps {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    
		System.out.println("Am under given, Hellow world");
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	   
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	   
	}

	@Then("login should be successful")
	public void login_should_be_successful() {
	   

}
}