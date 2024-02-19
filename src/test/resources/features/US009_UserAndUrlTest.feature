Feature: Us009_Practice Url and User UI Testing

  Scenario: :Test of User and Url
    Given user goes "http://www.webdriveruniversity.com/"
    Then User goes the loginPortal
    And User clicks loginPortal
    And User goes ohher Window
    And User enters Username to  box of  "username"
    And User enters password to box of "password"
    And User clicks loginButton
    And User makes a test what writing is validation failed
    And User write ok and closes the PopUp
    And user returns the first page
    And User makes a test what user is on first page


