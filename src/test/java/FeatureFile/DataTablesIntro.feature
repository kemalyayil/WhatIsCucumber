Feature: Login to web app
# We use data table in cucumber a step to be run multiple times with various data.

# We use scenario outline running a scenario multiple times with different data

#  Scenario Outline: Login Hotspot scenario
#    Given Navigate to Hotspot website
#    When User enter "<emailAddress>"
#    Then User logout
#
#    Examples:
#    |emailAddress|
#    | dasjdjasjj    |
#    | 1225456666    |
#    | !@#$%%%^&*    |
#    | jsh@gmail.com |


  Scenario: Login Hotspot scenario
    Given Navigate to Hotspot website
    When User enter email address
      | dasjdjasjj    |
      | 1225456666    |
      | !@#$%%%^&*    |
      | jsh@gmail.com |
      | qqsdas122@jsh |
    Then User logout





#  Scenario: Positive Login Test
#    Given Navigate to Hotspot website
#    When User enter valid email address
#    Then Success message should be displayed
#
#  Scenario: Negative Login Test
#    Given Navigate to Hotspot website
#    When User enter invalid email address
#    Then Warning message should be displayed
#
#  Scenario: Negative Login Test2
#    Given Navigate to Hotspot website
#    When User enter only special characters as email address
#    Then Warning message should be displayed
#
#  Scenario: Negative Login Test3
#    Given Navigate to Hotspot website
#    When User enter only spaces as email address
#    Then Warning message should be displayed