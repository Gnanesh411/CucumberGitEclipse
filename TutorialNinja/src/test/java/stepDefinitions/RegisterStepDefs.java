package stepDefinitions;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class RegisterStepDefs {
//	@Before(order = 0)
//	public void setUp1() {
//		System.out.println("++ setup1 before hook method got executed ++");
//	}
//
//	@Before(order = 1)
//	public void setUp2() {
//		System.out.println("++ setup2 before hook method got executed ++");
//	}
//
//	@Before(order = 2)
//	public void setUp3() {
//		System.out.println("++ setup3 before hook method got executed ++");
//	}
//
//	@After(order = 0)
//	public void tearDown1() {
//		System.out.println("++ tearDown1 after hook method got executed ++");
//	}
//
//	@After(order = 1)
//	public void tearDown2() {
//		System.out.println("++ tearDown2 after hook method got executed ++");
//	}
//
//	@After(order = 2)
//	public void tearDown3() {
//		System.out.println("++ tearDown3 after hook method got executed ++");
//	}

	@Given("User navigate to Register Account page")
	public void user_navigate_to_register_account_page() {
		System.out.println(">>User navigate to Register Account page");
	}

	@When("User enters below details into the fields")
	public void User_enters_below_details_into_the_fields(DataTable datatable) {
		Map<String, String> map = datatable.asMap(String.class, String.class);
		System.out.println(">>User has entered the first name as:" + map.get("firstname"));
		System.out.println(">>User has entered the last name as:" + map.get("lastname"));
		System.out.println(">>User has entered the emailaddress as:" + map.get("emailaddress"));
		System.out.println(">>User has entered the Telephone as:" + map.get("Telephone"));
		System.out.println(">>User has entered the Password as:" + map.get("Password"));
	}

	@When("Selects Privacy Policy field")
	public void selects_privacy_policy_field() {
		System.out.println(">>Selects Privacy Policy field");
	}

	@When("Clicks on Continue button")
	public void clicks_on_continue_button() {
		System.out.println(">>Clicks on Continue button");
	}

	@Then("Account should get successfully created")
	public void account_should_get_successfully_created() {
		System.out.println(">>Account should get successfully created");
	}

	@When("Selects Yes for newsletter")
	public void selects_yes_for_newsletter() {
		System.out.println(">>Selects Yes for newsletter");
	}

	@When("User dont enter details into any fields")
	public void user_dont_enter_details_into_any_fields() {
		System.out.println(">>User dont enter details into any fields");
	}

	@Then("Warning messages should be displayed for the mandatory fields")
	public void warning_messages_should_be_displayed_for_the_mandatory_fields() {
		System.out.println(">>Warning messages should be displayed for the mandatory fields");
	}

	@Then("Warning message informating the User about duplicate email should be displayed")
	public void warning_message_informating_the_user_about_duplicate_email_should_be_displayed() {
		System.out.println(">>Warning message informating the User about duplicate email should be displayed");
	}
}
