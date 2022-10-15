@smoke
Feature: F01_Register | users could register with new accounts
  Scenario: guest user could register with valid data successfully
    Given user go to register page
    When user enters "firstname","lastname","email25254@gmai.com","p@ssworD223"
    Then the registration page displayed successfully
