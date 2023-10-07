@AccountManagement
Feature: Account Management

  @CreateAnAccount
  Scenario Outline: User can create an account
    Given I am on Signup page
    When I enter "<Username>" "<Password>"
    And I click on Signup
    Then User should be created successfully
    Examples:
      | Username      | Password |
      | abi22@gmail.com | Task124  |




  @AbilityToLogin
  Scenario Outline: User can login
    Given I am on Demoblaze login page
    When I enter "<Username>" "<Password>"
    And I click on Login
    Then I should be logged in successfully

    Examples:
      | Username      | Password |
      | abi22@gmail.com | Task123  |


