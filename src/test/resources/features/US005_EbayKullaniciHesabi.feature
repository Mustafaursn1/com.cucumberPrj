Feature: eBay dogru olmayan Kulanici ile giris yapmak

  Scenario: Kullanici dogru olamayan bilgilerlerle giris yapmayi dener
    Given User goes to ebay
    When  User click einlogin button
    Then User enters  invalid email and enter
    Then User enters invalid password and enter
    And User verifies that there is no login with incorrect user information.
    And User close ebay



