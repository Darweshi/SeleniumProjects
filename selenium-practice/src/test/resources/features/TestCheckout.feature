@test
Feature: Verify the process of ordering an item

Scenario: The user successfully orders an item
Given the user starts on the home page
When the user adds an item to cart
And the user clicks on the cart
And the user navigates to sign in tab
And the user signs in to their account
Then the user proceeds to the address page
Then the user procceds to the shipping page
Then the user proceeds to payment page
Then the user chooses the prefered way to pay
And the user confirms payment
Then the user is given a reciept with confirmation