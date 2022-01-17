
Feature: Automate Adactin Hotel Booking

  Scenario: Book Hotel Page
    Given User enters the valid first and last name
    And User enters the billing Address
    And User enters the credit card Number and the Type of card
    And User enters the credit card Expiry Month and Year
    And User enters the credit card CVV Number 
    Then Clicks on Book it navigates to Booking Confirmation Page