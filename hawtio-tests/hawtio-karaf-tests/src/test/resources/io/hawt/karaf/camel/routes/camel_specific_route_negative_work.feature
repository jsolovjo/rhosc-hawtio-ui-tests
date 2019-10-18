Feature: All negative operations with Camel Specific Route page.
  Checking the negative scenarios after performing some operation on Camel Specific Route page.

  @camelTests @allKarafTests
  Scenario: Check that Stop button in Camel Specific Route page is disabled when Camel Specific Route is stopped
    Given User clicks on Camel in Spring Boot main menu
    And User is on Camel "cbr-route" Route page of "cbr-example-context" context
    When User sets stop in the dropdown menu of Camel Specific Route
    Then The "Stop" button from drop-down menu is disabled
    And State of Camel Specific Route is "Stopped"

  @camelTests @allKarafTests
  Scenario: Check that Delete button in Camel Specific Route page is disabled when Camel Specific Route is started
    Given User clicks on Camel in Spring Boot main menu
    And User is on Camel "cbr-route" Route page of "cbr-example-context" context
    When User sets start in the dropdown menu of Camel Specific Route
    Then The "Delete" button from drop-down menu is disabled
    And State of Camel Specific Route is "Started"

  @camelTests @allKarafTests
  Scenario: Check that Start button in Camel Specific Route page is disabled when Camel Specific Route is started
    Given User clicks on Camel in Spring Boot main menu
    When User is on Camel "cbr-route" Route page of "cbr-example-context" context
    Then The "Start" button from drop-down menu is disabled
    And State of Camel Specific Route is "Started"

  @camelTests @allKarafTests
  Scenario: Execute operation with wrong parameter in Camel Specific Route
    Given User clicks on Camel in Spring Boot main menu
    And User is on Camel "cbr-route" Route page of "cbr-example-context" context
    And User clicks on Operations tab of Camel Specific Route page
    When User executes operation with name "shutdown(long)" and parameter "-44"
    Then Result of executed operation is "java.lang.IllegalArgumentException : Timeout must be a positive value"