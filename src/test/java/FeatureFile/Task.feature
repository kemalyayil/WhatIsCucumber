Feature: Search The Members in The Class

  Background:
    Given Navigate to  website
    And Go to class page


  Scenario: User search for Liping in the class
    When User search for "Liping" in the class
    Then All the results should be displayed for "Liping" in the class

  Scenario: User search for Arzu in the class
    When User search for "Arzu" in the class
    Then All the results should be displayed for "Arzu" in the class

  Scenario: User search for Cengiz in the class
    When User search for "Cengiz" in the class
    Then All the results should be displayed for "Cengiz" in the class