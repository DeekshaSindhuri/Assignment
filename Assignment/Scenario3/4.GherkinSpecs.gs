Feature: Add a contact in outlook
The purpose of this feature is to test all the possible user flows while adding contacts in Outlook mobile browser

Background: User to log in to add contacts
Given User navigate to login page
When User enters username and password
And User should be logged in
And User to navigate to add contacts
And User to wait for "10" seconds
Then New contact window should be displayed

  Scenario: Add a contact with all details
    Given User to enter first name, Last name, Email address, Mobile number, Company, Address, Birthday
    	| Raj | Name | Raj@outlook.com | 7654433229 | Accenture | Bangalore,Karnataka,India | 8 June, 1994 |
    When User saves the contact
    And User to refresh the page
    Then User should be able to view the newly added contact

   Scenario Outline: Add a contact
    Given User to store "<FieldName>" as "<Value>"	
    When User saves the contact
    And User to refresh the page
    Then User should be able to view the new contact with details  
	Examples:
	| FieldName | Value |
    	| Email address | Raj@outlook.com |
    	| Company | Accenture |
    	| Notes | This is dummy note to test |  
    	
#This is Error Scenario    
  Scenario: Adding a duplicate contact
    Given User has already added contact with name "Raj"
    And  User to enter first name, Last name, Email address, Mobile number, Company, Address, Birthday
    	| Raj | Name | Raj@outlook.com | 7654433229 | Accenture | Bangalore,Karnataka,India | 8 June, 1994 |
    When User saves the contact
    Then User should get error that contact already exists 
    
#This is Error Scenario
  Scenario Outline: Contact should not be created with only one detail
    Given User to store "<FieldName>" as "<Value>"
    When User saves the contact
    And User to refresh the page
    Then User should get error that contact with only one detail is not permitted
	Examples:
			| FieldName | Value |
    	| Full name | Raj Kapoor |
    	| Mobile number | 7654433229 |
    	| Address | Bangalore,Karnataka,India |
    	| Birthday | 8 June, 1994 |    
    	
  Scenario: Discard the contact while adding
    Given User enters first name, Last name
    	| Raj | Name |
    When User discards the contact
    Then User should not be able to view the newly added contact