@FunctionalTest
Feature: Login Functionality

  @SmokeTest
  Scenario: Login with HerokuApp
    Given User is on HerokuApp
    When User enters the username and password
    Then User logged in successfully

