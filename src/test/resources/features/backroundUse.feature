@backraoundTry
Feature: US001 Use the Backround

  Background: Common steps
    Given User goes to ebay


  Scenario: TC01 user searches on ebay

    Then  user search the smartphone
    And  User check the result of the result if that inclueds smartphone


  Scenario: TC02 user searches on ebay

    Then  user search the iphone
    And  User check the result of the result if that inclueds iphone


  Scenario: TC03 user searches on ebay

    Then  user search the Samsung
    And  User check the result of the result if that inclueds Samsung
    And User close ebay

