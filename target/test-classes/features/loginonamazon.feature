@Feature3
Feature: Checking Login functionality of Website
	
  Scenario: Login with valid credentials
    Given I am on Amazon WebPage
    When I enter Username "varun123" and Password "varun123"
    And Hit the Login button
    Then I should not be logged in
    
  Scenario: Login with invalid credentials
    Given I am on Amazon WebPage
    When I enter Username "@jh989s@!" and Password "g78s89s"
    And Hit the Login button
    Then It should throw error
