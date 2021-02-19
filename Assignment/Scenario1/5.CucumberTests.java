package org.com.cucumber;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sec1_Stepdef {
	@Given("^User navigate to login page$")
	public void user_navigate_to_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigated to login page");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Entered user and passowrd");
	}

	@When("^User should be logged in$")
	public void user_should_be_logged_in() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User logged in");
	}

	@When("^User to navigate to compose email$")
	public void user_to_navigate_to_compose_email() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User opened compose email");
	}

	@Then("^New email window should be displayed$")
	public void new_email_window_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("New email window is displayed");
	}

	@Given("^User enters recipient email id, cc, Bcc, subject and body$")
	public void user_enters_recipient_email_id_cc_Bcc_subject_and_body(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User enters recipient email id, cc, Bcc, subject and body");
	}

	@When("^User sends email$")
	public void user_sends_email() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User sends email");
	}

	@Then("^User should be able to view the email in Sent folder$")
	public void user_should_be_able_to_view_the_email_in_Sent_folder() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the email in Sent folder");
	}

	@Given("^User enters recipient email id, subject and body$")
	public void user_enters_recipient_email_id_subject_and_body(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User enters recipient email id, subject and body");
	}

	@Given("^User attaches a file and an image$")
	public void user_attaches_a_file_and_an_image() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User attaches a file and an image");
	}

	@Then("^User should be able to view the email with attachments in Sent folder$")
	public void user_should_be_able_to_view_the_email_with_attachments_in_Sent_folder() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the email with attachments in Sent folder");
	}

	@When("^User saves the email as draft$")
	public void user_saves_the_email_as_draft() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User saves the email as draft");
	}

	@Then("^User should be able to view the email in Draft folder$")
	public void user_should_be_able_to_view_the_email_in_Draft_folder() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the email in Draft folder");
	}

	@When("^User delete the email while composing$")
	public void user_delete_the_email_while_composing() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User delete the email while composing");
	}

	@Then("^User should not be able to view the email in Draft folder$")
	public void user_should_not_be_able_to_view_the_email_in_Draft_folder() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should not be able to view the email in Draft folder");
	}

	@When("^User deletes the email draft$")
	public void user_deletes_the_email_draft() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User deletes the email draft");
	}

	@Then("^User should get error to add at least one recipient address$")
	public void user_should_get_error_to_add_at_least_one_recipient_address() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get error to add at least one recipient address");
	}

	@Then("^User should get warning that at least one recipient address isn't valid$")
	public void user_should_get_warning_that_at_least_one_recipient_address_isn_t_valid() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get warning that at least one recipient address isn't valid");
	}

	@Given("^User enters recipient email id and body$")
	public void user_enters_recipient_email_id_and_body(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("Entered user and passowrd");
	}

	@Then("^User should get warning to send email without subject$")
	public void user_should_get_warning_to_send_email_without_subject() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get warning to send email without subject");
	}

	@Given("^User enters recipient email id, subject$")
	public void user_enters_recipient_email_id_subject(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User enters recipient email id, subject");
	}

	@Then("^User should get attachment reminder before sending$")
	public void user_should_get_attachment_reminder_before_sending() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get attachment reminder before sending");
	}

}
