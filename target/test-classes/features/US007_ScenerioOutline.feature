
@outline
Feature: Scenerio Outline

  Scenario Outline: TC01_ConfigReader ile Scenerio outline kullanimi
    Given user goes "<Url>"
    Then User waits 3 moments
    #When user checks that if "<AranacakUrl>" includes currentUrl
    And user closes the page
    Examples:
      | Url     | AranacakUrl |
      | faceUrl | faceUrl     |
      | amzUrl  | amzUrl      |
      | ebayUrl | ebayUrl     |
      | google  | google      |








