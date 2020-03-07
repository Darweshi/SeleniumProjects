#@test
Feature: Test sub page functionality

Scenario: Verify the functionality of drop down menu
Given user is on sub page
When the user clicks the + symbol
Then user is able to see specific options

Scenario: Utilize the filter options
Given user on sub page
When user clicks filters
Then results corresponding to the filters are shown

Scenario: Access to subcategories
Given the user is on sub page
When user clicks a subcategory
Then the user is redirected to desired category

Scenario: Sort products and change view
Given the user on sub page
When the user clicks the alternate view and the user chooses how to sort the products
Then the changes are displayed

Scenario: Check the functionality of a product
Given the user chooses product from sub page
When the user clicks a product
Then the user is directed to page for product