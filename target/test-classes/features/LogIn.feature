Feature:  Automate Adactin Hotel Booking
  
  Scenario: LogIn to Adactin Hotel Website
  
    Given User visits the HomePage
    When User enters the username in the username field
    And User enters the password in the password field
    Then User clicks submit button and it navigates to SearchHotel page