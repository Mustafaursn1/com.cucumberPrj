
@CrosBrowserTest
Feature: app_title_verification

  @grid_chrome
  Scenario: Tc01_title_on_chrome
    Given user is on the application_url "https://www.bluerentalcars.com/"
    Then verify the page title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then close the remote driver

  @gridFireFox
  Scenario: Tc01_title_on_chrome
    Given user is in fire fox on the application_url "https://www.bluerentalcars.com/"
    Then verify the page title is "Blue Rental Cars | Cheap, Hygienic, VIP Car Hire"
    Then close the remote driver

