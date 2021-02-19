Feature: Create an event in outlook calendar
The purpose of this feature is to test all the possible user flows while creating an event in Outlook mobile browser

Background: User to login in to create an event
Given User navigate to login page
When User enters username and password
And User should be logged in
And User navigate to create event
Then New create event window should be displayed

  Scenario: Create an online event
    Given User to add event title, attendees, location, description, date and time
    	| Test event | Raj@outlook.com | webex url | This is a test online meeting | Thu, 18 Feb | 4:00 PM -> 4:30 PM |
    When User wants an online meeting
    And User saves the event
    Then User should be able to view the event in calendar

   Scenario: Create a recurring online event
    Given User to add event title, attendees, location, description, date and time
    	| Test event | Raj@outlook.com | room number | This is a test online meeting | Thu, 18 Feb | 6:00 PM -> 6:30 PM |
    When User wants an online meeting
    And User repeats the event weekly
    	| Thursday |
    And User saves the event
    Then User should be able to view the event every week in calendar

  Scenario: Create all day event
   Given User to add event title, attendees, location, description
    	| Test event | Raj@outlook.com | room number | This is a test online meeting |
    When User wants all day 
    And User wants to update the start and end date
    	| Thu, 19 Feb | Thu, 20 Feb |
    And User saves the event
    Then User should be able to view the event in calendar
         
   Scenario: Create a private event without response options
    Given User to add event title, attendees, location, description, date and time
    	| Test event | Raj@outlook.com | room number | This is a test online meeting | Thu, 18 Feb | 2:00 PM -> 2:30 PM |
    When User wants a private meeting
    And User does not want attendee’s response 
		And User does not want attendees to forward the event invite
    And User saves the event
    Then User should be able to view the event in calendar

  Scenario: Discard an online event while composing
    Given User to add event title, attendees, location, description, date and time
    	| Test event | Raj@outlook.com | webex url | This is a test online meeting | Thu, 18 Feb | 5:00 PM -> 5:30 PM |
    And User wants an online meeting
    When User discards the event while composing
    Then User should not be able to view the event in calendar

  Scenario: Delete the event without editing
    When User delete the event
    Then User should not be able to view the event in calendar

#This is Error Scenario
   Scenario: Warning on over lapping event
   	Given User already have an event at four for half an hour
   	And User to add another event with title, attendees, location, description, date and time
    	| Test event | Raj@outlook.com | webex url | This is a test online meeting | Thu, 18 Feb | 4:00 PM -> 4:30 PM |
    And User wants an online meeting
    When User saves the event
    Then User should get a warning that this is an over lapping event 
    
#This is Error Scenario
   Scenario: Warning on blank event creation
    When User saves the event
    Then User should get a warning to create event without title