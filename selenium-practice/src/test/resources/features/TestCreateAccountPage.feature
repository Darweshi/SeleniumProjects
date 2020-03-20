@test
Feature: Verification of account creation with valid credentials

Scenario: User successfully create account
Given the user is on the sign in page
When the user enter new email
And the user navigates to create account page
And inputs their name
And chooses their gender
And user enters password
And user enters address
Then user clicks submit and is redirected to their account