Feature: Google Search with Data

  Scenario: Google Search Test With Data
    Given Navigate to Google website
    When User should search for "Cucumber" in Google
    Then User should see "Cucumber" results in Google

  Scenario: Google Search Test With Data
    Given Navigate to Google website
    When User should search for "Software Testing" in Google
    Then User should see "Software Testing" results in Google

  Scenario: Google Search Test With Data
    Given Navigate to Google website
    When User should search for "QA Positions" in Google
    Then User should see "quality assurance tester" results in Google