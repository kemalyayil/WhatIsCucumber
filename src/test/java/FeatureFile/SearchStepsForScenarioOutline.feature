Feature: Search with Scenario Outline

  Background:
    Given Navigate to website
    And Go to products page

# Scenario Outline will execute same scenario with different data
  Scenario Outline: Search items in website
    When User search for "<SearchItem>" in the "<website>"
    Then User should see the results for "<ResultItems>"

    Examples:
      | website | SearchItem | ResultItems     |
      | Amazon  | LG         | LG TVs          |
      | Walmart | IPhone     | Apple phones    |
      | BestBuy | Samsung    | Samsung tablets |
      | Target  | Sony       | Sony Cameras    |