package org.com.cucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sec3_StepDef {
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page()  {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate to login page");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password()  {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User enters username and password");
	}

	@When("^User should be logged in$")
	public void user_should_be_logged_in()  {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be logged in");
	}

	@When("^User to navigate to add contacts$")
	public void user_to_navigate_to_add_contacts() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User to navigate to add contacts");
	}

	@When("^User to wait for \"([^\"]*)\" seconds$")
	public void user_to_wait_for_seconds(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User waits for " + arg1 + " sec");
	}

	@Then("^New contact window should be displayed$")
	public void new_contact_window_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("New contact window should be displayed");
	}

	@Given("^User to enter first name, Last name, Email address, Mobile number, Company, Address, Birthday$")
	public void user_to_enter_first_name_Last_name_Email_address_Mobile_number_Company_Address_Birthday(
			DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println(
				"User to enter first name, Last name, Email address, Mobile number, Company, Address, Birthday");

	}

	@When("^User saves the contact$")
	public void user_saves_the_contact() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User saves the contact");
	}

	@When("^User to refresh the page$")
	public void user_to_refresh_the_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User to refresh the page");
	}

	@Then("^User should be able to view the newly added contact$")
	public void user_should_be_able_to_view_the_newly_added_contact() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the newly added contact");
	}

	@Given("^User to store \"([^\"]*)\" as \"([^\"]*)\"$")
	public void user_to_store_as(String arg1, String arg2) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should " + arg1 + "  " + arg2);
	}

	@Then("^User should be able to view the new contact with details$")
	public void user_should_be_able_to_view_the_new_contact_with_details() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the new contact with details");
	}

	@Given("^User has already added contact with name \"([^\"]*)\"$")
	public void user_has_already_added_contact_with_name(String arg1) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User has already added contact with name " + arg1);
	}

	@Then("^User should get error that contact already exists$")
	public void user_should_get_error_that_contact_already_exists() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get error that contact already exists");
	}

	@Then("^User should get error that contact with only one detail is not permitted$")
	public void user_should_get_error_that_contact_with_only_one_detail_is_not_permitted() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get error that contact with only one detail is not permitted");
	}

	@Given("^User enters first name, Last name$")
	public void user_enters_first_name_Last_name(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User enters first name, Last name");
	}

	@When("^User discards the contact$")
	public void user_discards_the_contact() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User discards the contact");
	}

	@Then("^User should not be able to view the newly added contact$")
	public void user_should_not_be_able_to_view_the_newly_added_contact() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should not be able to view the newly added contact");
	}

}
