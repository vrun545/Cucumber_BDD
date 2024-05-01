@Feature2
Feature: Adding items to the shopping cart on Amazon

  Scenario: Adding an item to the shopping cart
    Given I am on the Product Page
    When I hit the add to cart button
    Then Proceed to Checkout page will appear
    When I hit Proceed to Checkout button
    Then Product should add to the cart
