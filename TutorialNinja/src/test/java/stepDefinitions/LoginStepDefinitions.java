package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginStepDefinitions {
	
//	@Before(order=0,value="@search")//hooks and value attributes
//	public void setUp() {
//		System.out.println("++ before hook-setup method got executed ++");
//	}
//	@After(value="@search")
//	public void tearDown() {
//		System.out.println("-- after hook-teardown method got executed --");
//	}
	
	@Given("User opens the Application URL")
	public void user_opens_the_application_url() {
		System.out.println(">>User got navigated to login page");
	}

	@When("^User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String emailAddress) {
		System.out.println(">>user_enters_valid_email_address:"+emailAddress);
	}

	@And("^User enters valid password (.+)$")
	public void user_enters_valid_password(String pswd) {
		System.out.println(">>user_enters_valid_password:"+pswd);
	}

	@And("clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println(">>clicks_on_login_button");
	}

	@Then("User should Login Successfully")
	public void user_should_login_successfully() {
		System.out.println(">>User should Login Successfully");
	}

	@And("User enters Invalid password {string}")
	public void user_enters_invalid_password(String Invalidpswd) {
		System.out.println(">>User enters Invalid password:" + Invalidpswd);
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">>User should get a proper warning message");
	}

	@When("User enters Invalid email address {string}")
	public void user_enters_invalid_email_address(String InvalidEmail) {
		System.out.println(">>User enters Invalid email address:" + InvalidEmail);
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		System.out.println(">>User dont enter any credentials");
	}
}
