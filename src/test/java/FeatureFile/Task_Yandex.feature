Feature: Searching Yandex Task
  Scenario: Search data in Yandex
    Given Navigate to Yandex
    When User search for "Cucumber" in Yandex
    Then User should see the results about "cucumber" in Yandex