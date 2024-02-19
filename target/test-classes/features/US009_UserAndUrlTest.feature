@WebDriverUrl
Feature: Us009_Practice Url and User UI Testing

  Scenario Outline: :Test of User and Url
    Given user goes "webUniUrl"
    Then User goes the loginPortal
    And User clicks loginPortal
    And User goes ohher Window
    And User waits 1 moments
    And User enters Username to  box of  "<username>"
    And User waits 1 moments
    And User enters password to box of "<password>"
    And User waits 1 moments
    And User clicks loginButton
    And User waits 1 moments
    And User makes a test what writing is validation failed
    And User waits 1 moments
    And User write ok and closes the PopUp
    And User waits 1 moments
    And user returns the first page
    And User waits 1 moments
    And User makes a test what user is on first page
    And user closes the page
    Examples:
      | username | password           |
      | tomy     | 123gute.@gmail.com |

