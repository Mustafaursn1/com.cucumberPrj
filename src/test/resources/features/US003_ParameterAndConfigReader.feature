Feature: Paremetre Kullanimi

  Scenario: TC01_Paremetre ve configReader birlikte kullanimi
    Given user goes "faceUrl"
    When user checks that if "facebook" includes currentUrl
    #Then user search "selenium" by Amazon
    #Then User check the result of the result if that inclueds "selenium"
    And user closes the "faceUrl"

  Scenario: TC02_Paremetre ve configReader birlikte kullanimi
    Given user goes "ebayUrl"
    When user checks that if "ebay" includes currentUrl
    Then User waits 5 moments
    And user closes the "ebayUrl"

