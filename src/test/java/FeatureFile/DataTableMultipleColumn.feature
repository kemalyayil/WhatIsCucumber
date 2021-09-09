Feature: Login Function HubSpot website
  @Smoke
  Scenario: Test email input for hubspot website
    When User enter email
    |123245656|Fail|
    |kjasdhas |Fail|
    |!@#$$%^&&|Fail|
    |hagh@gmail.com |Passed|

    Then User logout