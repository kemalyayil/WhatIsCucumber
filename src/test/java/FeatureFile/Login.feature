Feature: Login Functionality
  @Smoke
  Scenario: Login with valid username and password
    Given Navigate to  website
    When User enter valid username and password
    Then User should login successfully

  Scenario: Login with invalid username and password
    Given Navigate to  website
    When User enter invalid username and password
    Then Login should fail

  Scenario: Login with valid username and an invalid password
    Given Navigate to  website
    When User enter valid username and an invalid password
    Then Login should fail