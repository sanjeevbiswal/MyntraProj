@Search_001
Feature: Search in homepage
  Scenario: Search Homepage
    Given User navigate to 'Myntra' homepage
    When User search for "Jeans" using search input box
    And User clicked 'Search' button in the homepage
    Then User should navigate to "Jeans" search page
