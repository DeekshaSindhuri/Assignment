package org.com.cucumber;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sec2_StepDef {
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

	@When("^User navigate to create event$")
	public void user_navigate_to_create_event() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User navigate to create event");
	}

	@Then("^New create event window should be displayed$")
	public void new_create_event_window_should_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("New create event window should be displayed");
	}

	@Given("^User to add event title, attendees, location, description, date and time$")
	public void user_to_add_event_title_attendees_location_description_date_and_time(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User to add event title, attendees, location, description, date and time");
	}

	@When("^User wants an online meeting$")
	public void user_wants_an_online_meeting() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User wants an online meeting");
	}

	@When("^User saves the event$")
	public void user_saves_the_event() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User saves the event");
	}

	@Then("^User should be able to view the event in calendar$")
	public void user_should_be_able_to_view_the_event_in_calendar() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the event in calendar");
	}

	@When("^User repeats the event weekly$")
	public void user_repeats_the_event_weekly(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User repeats the event weekly");
	}

	@Then("^User should be able to view the event every week in calendar$")
	public void user_should_be_able_to_view_the_event_every_week_in_calendar() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should be able to view the event every week in calendar");
	}

	@Given("^User to add event title, attendees, location, description$")
	public void user_to_add_event_title_attendees_location_description(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User to add event title, attendees, location, description");
	}

	@When("^User wants all day$")
	public void user_wants_all_day() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User wants all day");
	}

	@When("^User wants to update the start and end date$")
	public void user_wants_to_update_the_start_and_end_date(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User wants to update the start and end date");
	}

	@When("^User wants a private meeting$")
	public void user_wants_a_private_meeting() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User wants a private meeting");
	}

	@When("^User does not want attendee’s response$")
	public void user_does_not_want_attendee_s_response() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User does not want attendee’s response");
	}

	@When("^User does not want attendees to forward the event invite$")
	public void user_does_not_want_attendees_to_forward_the_event_invite() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User does not want attendees to forward the event invite");
	}

	@When("^User discards the event while composing$")
	public void user_discards_the_event_while_composing() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User discards the event while composing");
	}

	@Then("^User should not be able to view the event in calendar$")
	public void user_should_not_be_able_to_view_the_event_in_calendar() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should not be able to view the event in calendar");
	}

	@When("^User delete the event$")
	public void user_delete_the_event() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User delete the event");
	}

	@Given("^User already have an event at four for half an hour$")
	public void user_already_have_an_event_at_four_for_half_an_hour() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User already have an event at four for half an hour");
	}

	@Given("^User to add another event with title, attendees, location, description, date and time$")
	public void user_to_add_another_event_with_title_attendees_location_description_date_and_time(DataTable arg1) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		System.out.println("User to add another event with title, attendees, location, description, date and time");
	}

	@Then("^User should get a warning that this is an over lapping event$")
	public void user_should_get_a_warning_that_this_is_an_over_lapping_event() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get a warning that this is an over lapping event");
	}

	@Then("^User should get a warning to create event without title$")
	public void user_should_get_a_warning_to_create_event_without_title() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("User should get a warning to create event without title");
	}
}
