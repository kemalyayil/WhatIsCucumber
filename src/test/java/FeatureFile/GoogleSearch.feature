Feature: Google Search Function
  @Smoke
  Scenario: Search for Cucumber
    Given Navigate to Google
    When User search for Cucumber in Google
    Then User should see Cucumber results in Google