@Feature1
Feature: Searching Product and Selecting particular product

  Scenario: I search for mobiles on search box and select a product
    Given I am on Amazon Home Page
    When I passed "IPhone 15" on search box
    And Hit search button
    Then Search result should show expected result
    When I select a particular product
    Then It should redirect to that particular product page
