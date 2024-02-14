@paramater
Feature: US002 Parametre Kullanimi
  Scenario: TC01 Kullanici amazonda parametreli arama yapar
    Given user goes  to Amazon
    Then user search "selenium" by Amazon
    And User check the result of the result if that inclueds "selenium"
    And user closes the Amazon