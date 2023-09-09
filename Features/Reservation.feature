Feature: Teasting the bus reservation process

  Scenario: Select a seat and fill the passenger data
    Given The user is on the home page
    When Select the desired trip route
    And Select the Departure data
    And Press search for bus button
    And Select the desired seats
    And Define the boarding point
    And Define the dropping point
    And Enter mobile number
    And Enter Email
    And Select the seat number
    And Press the arrow for more details
    And Enter the name
    And Select gender from list
    And Enter age
    And Select concession from list
    And Close the browser
