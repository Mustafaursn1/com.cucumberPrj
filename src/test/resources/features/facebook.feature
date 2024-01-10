@facebookLogin
Feature: Facebook sign in

  Scenario: TC01 User does sign in
    Given User goes to facebook
    Then  user enters email
    And  User enters password
    And It tests whether the user entered with incorrect data
