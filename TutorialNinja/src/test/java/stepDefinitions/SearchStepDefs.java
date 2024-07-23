package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class SearchStepDefs {
	
//	@Before("@register") //Hooks and Tagged Hooks
//	public void setUp() {
//		System.out.println("browser got opened");
//	}
//	@After("@register")
//	public void tearDonw() {
//		System.out.println("Browser got closed");
//	}
//	@BeforeStep("@register")
//	public void beforeEveryStep() {
//		System.out.println("++Before every step hook");
//	}
//	@AfterStep("@register")
//	public void afterEveryStep() {
//		System.out.println("++After every step hook");
//	}

	@Given("User open the Application")
	public void user_open_the_application() {
		System.out.println(">>User open the Application");
	}

	@When("User enter valid product into search field")
	public void user_enter_valid_product_into_search_field() {
		System.out.println(">>User enter valid product into search field");
	}

	@When("User Click on Search button")
	public void user_click_on_search_button() {
		System.out.println(">>User Click on Search button");
	}

	@Then("Valid Product should get displayed in search results")
	public void valid_product_should_get_displayed_in_search_results() {
		System.out.println(">>Valid Product should get displayed in search results");
	}

	@When("User enter non-existing product into search field")
	public void user_enter_non_existing_product_into_search_field() {
		System.out.println(">>User enter non-existing product into search field");
	}

	@Then("^Proper text informing the User about no product matching should be displayed$")
	public void proper_text_informing_the_user_about_no_product_matching_should_be_displayed() {
		System.out.println(">>Proper text informing the User about no product matching should be displayed");
	}

	@When("User dont enter any product into search field")
	public void user_dont_enter_any_product_into_search_field() {
		System.out.println(">>User dont enter any product into search field");
	}
}
