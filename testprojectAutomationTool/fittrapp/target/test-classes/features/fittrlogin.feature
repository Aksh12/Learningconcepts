Feature: Fittr app login feature


  Scenario: Fittr app login with already registered Gmail Account Test case
    Given user is on login page
    And user selects Log in with Google option and chooses Gmail Account
    Then user is on Todays Schedule screen

