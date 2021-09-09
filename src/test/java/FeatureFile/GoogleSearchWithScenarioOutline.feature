Feature: Google Search w Scenario Outline

  Scenario Outline:
    Given Navigate to Google.com
    When User search for "<SearchItem>" in Google.com
    Then User should see results for "<Results>" in Google.com

    Examples:
      | SearchItem   | Results  |
      | Cucumber     | cucumber |
      | Java         | java     |
      | Buenos Aires | buenos   |