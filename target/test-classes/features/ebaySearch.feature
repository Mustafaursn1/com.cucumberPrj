@ebay
Feature: ebay search

  Scenario: TC01 user searches on ebay
    Given User goes to ebay
    Then  user search the smartphone
    And  User check the result of the result if that inclueds smartphone
    And User close ebay
