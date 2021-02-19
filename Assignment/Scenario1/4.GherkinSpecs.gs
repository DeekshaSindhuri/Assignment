Feature: Compose an email in outlook
The purpose of this feature is to test all the possible user flows while composing the email in Outlook mobile browser

Background: User to log in to compose email
Given User navigate to login page
When User enters username and password
And User should be logged in
And User to navigate to compose email
Then New email window should be displayed

  Scenario: Send an email with all details populated
    Given User enters recipient email id, cc, Bcc, subject and body
    	| Raj@outlook.com | Raj2@outlook.com | Raj3@outlook.com | Test email | Testing this email |
    When User sends email
    Then User should be able to view the email in Sent folder
    
  Scenario: Send an email with attachments
    Given User enters recipient email id, subject and body
    	| Raj@outlook.com;Raj2@outlook.com | Test email | Testing this email |
    And User attaches a file and an image
    When User sends email
    Then User should be able to view the email with attachments in Sent folder

  Scenario: Save the email as draft while composing
    Given User enters recipient email id, subject and body
    	| Raj@outlook.com | Test email | Testing this email |
    When User saves the email as draft
    Then User should be able to view the email in Draft folder

  Scenario: Delete email while composing
    Given User enters recipient email id, subject and body
    	| Raj@outlook.com | Test email | Testing this email |
    When User delete the email while composing
    Then User should not be able to view the email in Draft folder
    
  Scenario: Delete the email without composing
    When User deletes the email draft
    Then User should not be able to view the email in Draft folder
   
  Scenario: Error while sending an email without recipient address
    When User sends email
    Then User should get error to add at least one recipient address
    
  Scenario: Error while sending an email with an incorrect recipient address
   	Given User enters recipient email id, subject and body
    	| Rajoutlook.com | Test email | Testing this email |
    When User sends email
    Then User should get warning that at least one recipient address isn't valid
        
  Scenario: Warning before sending an email without subject
   	Given User enters recipient email id and body
    	| Raj@outlook.com | Testing this email |
    When User sends email
    Then User should get warning to send email without subject
        
  Scenario: Send email with empty body
   	Given User enters recipient email id, subject
    	| Rajoutlook.com | Test email |
    When User sends email
    Then User should be able to view the email in Sent folder   
    
#This is an Error Scenario
  Scenario: Warning while sending an email with attachment/attach text in email body
    Given User enters recipient email id, subject and body
    	| Raj@outlook.com | Test email | attachment |
    When User sends email
    Then User should get attachment reminder before sending