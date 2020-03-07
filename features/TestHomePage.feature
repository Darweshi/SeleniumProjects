#@test
Feature: Test home page functionality

Scenario: Utilize search bar
Given user is on home page
When user clicks on search bar and inputs valid text then clicks search
Then the user is shown consistent results

Scenario Outline: Utilize search 
Given user is on home page
When user clicks on search bar and inputs valid "<text>" then clicks search
Then the user is shown consistent results
Examples:
|dresses|

Scenario: Test functionality of advertisement slider
Given the user is on home page
When user clicks the slide
Then the user is redirected to a different page

Scenario: Access to login page
Given user is on the home page
When user clicks the sign in tab
Then the user is redirected to the login page

Scenario: Check cart
Given the user is on the home page
When user clicks the cart tab
Then the user is redirected to respective cart

Scenario: Add items to cart
Given User chooses item from home page
When user clicks button add to cart
Then the user checks cart
Then the item is in users cart
