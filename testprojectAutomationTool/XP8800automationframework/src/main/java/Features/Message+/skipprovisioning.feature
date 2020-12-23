Feature: Verizon Message+ application

  Scenario: Verifying Start Messaging and Skip Provisioning Test Scenario
    Given Message+ application is launched
    When user click on start Messaging option
    And user click on Skip Provisioning option
    Then user is on New feature:Add to favorites screen 
