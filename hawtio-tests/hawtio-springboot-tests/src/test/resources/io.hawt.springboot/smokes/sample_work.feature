Feature: The main links in Hawtio work.
  Checking, that we can click on main menu links and it redirects us to the right page.

  @springBootTests
  Scenario: Check User can access and login Hawtio page
    Given User is on Hawtio page
    Then User is logged in