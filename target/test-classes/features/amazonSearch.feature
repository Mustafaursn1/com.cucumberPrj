@amazonSearch
Feature: Amazon Search

  Scenario: TC01 user searchs nutella on Amazon
    Given user goes  to Amazon
    Then user searchs  nutella
    And user checks if the result include nutella
    And user closes the Amazon
