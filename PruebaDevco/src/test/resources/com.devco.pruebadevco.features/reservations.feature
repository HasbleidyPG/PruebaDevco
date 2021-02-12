Feature: I as a user of the application,
  I need to make hotel reservations, flights, make vacation rentals, search for cruises and rent cars
  for the vacation trip

  Background:
    Given the user is in the application

  @HotelReservation
  Scenario: Hotel reservation
    When entering the reservation information
      | GoingTo |
      | Madrid  |
    Then system must show the available hotels

  @VacationsRentals
  Scenario: Vacations rentals
    When he enters all the rentals information
      | GoingTo |
      | Madrid  |
    Then the preference option can be selected

  @RentCar
  Scenario: Rent Car
    When he enters all cars information
      | PickUp |
      | Madrid |
    Then you can view the cars options

  @FlightReservation
  Scenario: Flight Reservation
    When the user does not enter all the data
      | LeavingFrom |
      | Medellin    |
    Then the system should display an error message

  @CruiseReservation
  Scenario: Cruise reservation
    When the user selects the reservation information
    Then the system should show the options

