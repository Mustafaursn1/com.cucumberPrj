@amazonSearch
Feature: Amazon Search

  Scenario: TC01 user searchs nutella on Amazon
    Given user goes  to Amazon
    Then user searchs  nutella
    And user checks if the result include nutella
    And user closes the Amazon

  Scenario: TC02 user searchs Selenium on Amazon
    Given user goes  to Amazon
    Then user searchs  Selenium
    And user checks if the result include Selenium
    And user closes the Amazon

