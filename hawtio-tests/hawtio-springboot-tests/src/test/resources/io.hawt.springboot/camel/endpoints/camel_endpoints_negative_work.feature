Feature: All negative operations with Camel endpoints page.
  Checking the negative scenarios after performing some operation on Camel endpoint page.

  @camelTests @allSpringBootTests
  Scenario: Add an endpoint with wrong URI
    Given User clicks on Camel in Spring Boot main menu
    And User is on Camel Endpoints page of "cbr-example-context" context
    And User clicks on Endpoints tab of Camel Endpoints page
    When User adds Endpoint "testfail" from URI
    Then Unsuccessful message in Camel Endpoints is appeared and closed
