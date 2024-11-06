
@authentification 
Feature: I want to verify the authentification
As a user i want to verify the authentification


Background:
  Given I connect to the application
  When I accept alert
  And I click "mon compte"
  And I add my email "ayadiamal.geo@gmail.com"
  And I add the passeword "AMALamal123@"
  And I click bouton me connecter
  
  
  @Authentification_OK
  Scenario: Authentification OK
  Then I will be redirected to the home page 
 