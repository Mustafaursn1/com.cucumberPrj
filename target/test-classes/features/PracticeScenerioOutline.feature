Feature: US007 Blue RentaCar Camp

  @Brc @grp1
  Scenario Outline: User tries to enter wit the invalid credential
    Given user goes "blueRentCarUrl"
    Then User clicks the logintext
    And User tries to enter "<InvalidEmail>"
    And User tries to enter with "<InvalidPassword>"
    And User clicks login button
    And Detects no user login
    And  user closes the page
    Examples:
      | InvalidEmail         | InvalidPassword |
      | Manager5@gmail.com   | Manager5!       |
      | Manager6@gmail.com   | Manager6!       |
      | Manager7@hotmail.com | Manager7!       |