Feature: Homepage test

  @logotest
  Scenario: Homepage test1
    Given User navigate to 'Myntra' homepage
    When User clicked 'Myntra' logo
    Then User should see 'Myntra' homepage

  @headertest
  Scenario: Homepage test2
    Given User navigate to 'Myntra' homepage
    And User sees below mentioned links available
    | Men          |
    | Women        |
    | Kids         |
    | Home Decor   |




