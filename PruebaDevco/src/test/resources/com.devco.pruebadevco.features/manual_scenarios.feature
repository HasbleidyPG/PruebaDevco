Feature: As a user of the system,
  I need to validate the functionalities of the system manually
  to control the problems that arise


  @Manual
  Scenario: Sending packages
    Given the user is on the page
    When the user types all the fields
    Then the system should show the available options

  @Manual
  Scenario: Change language
    Given the user is on the page
    When the language is changed
    Then the system should change the language on the whole page

  @Manual
  Scenario: Dowloand app
    Given the user is on the page
    When they want to download the App and fill out the information
    Then the system must allow the download of the app

  @Manual
  Scenario: Registration on the page
    Given the user is on the page
    When they register on the page
    Then the system should allow them to log in

  @Manual
  Scenario: Search activities
    Given the user is in the application
    When entering the information to search for activities to be carried out
    Then the system should show the available options

  @Manual
  Scenario: Rent Cars
    Given the user is in the application
    When he enters the information to rent a car
    Then the system should show the available options

  @Manual
  Scenario: Transfers
    Given the user is in the application
    When he enters the car rental information for transfer
    Then the system should show the available options

  @Manual
  Scenario: Find hotel with flight included
    Given that the user is on the page
    When making the query for hotels with flight included
    Then the system should show the available options

  @Manual
  Scenario: Flights with various destinations
    Given the user is on the page
    When he is going to make the reservation with several flights
    Then he must validate that all the fields are filled

  @Manual
  Scenario: Create a vacation package without information
    Given the user is in the packages option
    When all the fields are left blank
    Then it must be validated that it does not allow the search

  @Manual
  Scenario: Suggestion selection
    Given the user is in any option on the page
    When he selects a suggestion
    Then it will be validated that all the fields are filled with the information of the suggestion

  @Manual
  Scenario: Login without creating an account
    Given the user is in any option on the page
    When logging in via social media
    Then you must allow login

  @Manual
  Scenario: Password recovery
    Given the user is in the login option of the page
    When password recovery is required
    Then the password should be changed

  @Manual
  Scenario: Add to Favorites
    Given the user is in any option on the page
    When adding to favorites
    Then the list of added items should be displayed

  @Manual
  Scenario: recent searches
    Given the user is in any option on the page
    When it is required to see the history of visits
    Then the list with the searches carried out previously should be seen









