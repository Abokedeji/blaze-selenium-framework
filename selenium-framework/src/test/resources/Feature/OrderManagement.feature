@OrderManagement
Feature: Order Management


@ViewProductDescription
  Scenario Outline: User can check product description
    Given I am on user product page
    When I click on an item
    Then product description page should be displayed
    Examples:
      | Item              |
      | Samsung galaxy s6 |


  Scenario: User can add item to cart
    Given I am on product description page
    When I click Add to cart
    Then Product should be added successfully
