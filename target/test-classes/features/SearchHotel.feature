
Feature: Automate Adactin Hotel Booking
  
  Scenario: User Search the required Hotel
  
    Given User is navigated to search Hotel page once logged In
    When User selects the preferred location
    And User selects the preferred Hotels
    And User selects the Room Type
    And User selects the Number of Rooms
    And User selects the Check In and Check Out Date
    And User selects the Adults and Children per Room to stay
    Then Selecting gives the list of Hotel based on the requirement given
    

