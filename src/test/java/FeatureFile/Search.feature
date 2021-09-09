Feature: Search Functionality

#  All the steps in Background will get executed before each scenario(just like @BeforeMethod)
  Background:
    Given Navigate to  website
    And Go to products page

  @Smoke
  Scenario: Search for Macbook
    When User search for MacBook
    Then All the results should be displayed for MacBook

  Scenario: Search for Samsung
    When User search for Samsung
    Then All the results should be displayed for Samsung