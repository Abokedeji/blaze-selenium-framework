@OrderManagement
Feature: Order Management


  Scenario Outline: User can check product description
    Given I am on user product page
    When I click on an item
    Then product description page should be displayed
    Examples:
      | Item              |
      | Samsung galaxy s6 |
