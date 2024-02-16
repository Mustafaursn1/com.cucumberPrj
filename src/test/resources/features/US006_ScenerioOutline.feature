Feature: US006_User searches by amazon what he wants artikels

  Scenario Outline: TC01_User searches by amazon what he wants artikels

    Given user goes  to Amazon
    Then user search "<wanted artikels>" by Amazon
    And User waits 3 moments
    And User check the result of the result if that inclueds "<wanted artikels>"
    And  user closes the Amazon
    Examples:
      | wanted artikels |
      | Nutella         |
      | Selenium        |
      | Iphone          |
      | Samsung         |
