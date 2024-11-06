@addParfumToTheBasket
Feature: Addparfum to the basket
  As a user i want to select a parfum and ad it to the basket

  Background: 
    Given I connect to the application
    When I accept alert
    And I click "mon compte"
    And I add my email "ayadiamal.geo@gmail.com"
    And I add the passeword "AMALamal123@"
    And I click bouton me connecter

  @addParfum
  Scenario: Add Parfum to the pasket
    Given I am on the welcome page
    When I whrite gucci guilty in the research box
    And I click enter with the keyboard
    And I click add to the basket
    And I click go to the basket
    Then I will be redirected to the payment page
