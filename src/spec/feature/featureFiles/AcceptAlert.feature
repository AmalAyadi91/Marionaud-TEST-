
@acceptAlert
Feature: Accept alert
  As a user i want to accept alert to connect to the application

  @acceptAlert
  Scenario: Alert Acceptation
    Given I connect to the application
    When I click boton accept
    Then redirection to the home page

 