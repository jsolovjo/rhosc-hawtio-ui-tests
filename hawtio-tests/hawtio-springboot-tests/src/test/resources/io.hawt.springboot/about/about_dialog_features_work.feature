Feature: The About dialog shows the basic information about Hawtio's components and versions are used.
  Checking, that all data is presented and correctly displayed.

  @springBootSmokes @springBootTests
  Scenario Outline: Check the About dialog correctly presents the information about Hawtio's components and versions are used
    Given User is on Hawtio main page
    When User clicks on About in right dropdown menu with question mark
    Then The "Hawtio Management Console" header is presented in About dialog
    And The "<name>" is presented in About dialog
    Then About dialog is closed

    Examples: Names of Hawtio's Components
      | name               |
      | Hawtio             |
      | Hawtio Core        |
      | Hawtio Integration |
      | Hawtio OAuth       |