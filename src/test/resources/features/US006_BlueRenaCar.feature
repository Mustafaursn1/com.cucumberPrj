Feature: US005_Blue RentaCar with invalid credential login
  Scenario: TC11_User tries  to enter wiht the invalid credential
    Given user goes "blueRentCarUrl"
    Then User clicks the logintext
    Then User waits 3 moments
    And User enter the invalid Email
    Then User waits 3 moments
    And User enter the invalid Password
    Then User waits 3 moments
    And User clicks login button
    Then User waits 3 moments
    #And User sees the alerttext
    #Then User waits 3 moments
    #And User writes on consol the alerttext
    #Then User waits 3 moments
    And Detects no user login
    Then User waits 3 moments
    And user closes "blueRentCarUrl"