@LoginTest
Feature: Login test
  @Login_test_001
  Scenario: Redirection to Login page
    Given User navigate to 'Myntra' homepage
    When User mouse hover on user icon
    And User clicks on "Log in" button
    Then "Log in" page should be displayed

  @Login_test_002
  Scenario: Redirection to SignUp page
    Given User navigate to 'Myntra' homepage
    When User mouse hover on user icon
    And User clicks on "Sign up" button
    Then "Sign up" page should be displayed

