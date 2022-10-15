@smoke
Feature: F0_Shopping Cart | users Can add product in Shopping cart with total less than 350$
  Scenario: User can add items with price below his budget
    Given user can login with newly registered account "firstname","lastname","email884@gmai.com","p@ssworD223"
    When user hover women menu select pants category and opens item details
    And user select color,size and add item to shopping cart
    Then the item Total is less than budget
