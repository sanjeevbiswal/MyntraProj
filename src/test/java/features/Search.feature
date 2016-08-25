@Search_001
Feature: Search in homepage
  Scenario Outline: Search homepage
    Given User navigate to 'Myntra' homepage
    When User search for "<ItemName>" using search input box
    And User clicked 'Search' button in the homepage
    Then User should navigate to "<ItemName>" search page
    Examples:
    | ItemName  |
    |Jeans      |
    |Shirts     |
    |Dress      |
