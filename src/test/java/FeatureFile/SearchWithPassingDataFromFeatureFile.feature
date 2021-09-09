Feature: Search Function
#  asagida yapacaklarimiz oncekiler gibi hardcoding olmayacak

  Background:
    Given Navigate to  website
    And Go to products page


  Scenario: User search for Sony
    When User search for "Sony"
    Then All the results should be displayed for "Sony"

  Scenario: User search for LG
    When User search for "LG"
    Then All the results should be displayed for "LG"

  Scenario: User search for Canon
    When User search for "Canon"
    Then All the results should be displayed for "Canon"