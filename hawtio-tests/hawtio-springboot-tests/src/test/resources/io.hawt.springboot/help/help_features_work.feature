Feature: All functions at Help page work.
  Checking the functionality of Help page.

  @helpTests @springBootTests
  Scenario Outline: Check the tabs are correctly opened
    Given User is on "Home" tab of Help page
    When User clicks on "<tabName>" tab of Help page
    Then Header of "<tabName>" and header's id "<tabId>" are presented

    Examples: Tab names and IDs
      | tabName     | tabId       |
      | Camel       | camel       |
      | Connect     | connect     |
      | JMX         | jmx         |
      | Diagnostics | diagnostics |
      | Preferences | preferences |
      | Runtime     | runtime     |

  @helpTests @springBootTests
  Scenario Outline: Check links are not broken in Home tab
    Given User is on "Home" tab of Help page
    When User clicks on link text "<linkText>"
    Then User is redirected to the "<url>"
    And User is returned to previous page

    Examples: Link texts and URLs of Home tab
      | linkText     | url                        |
      | Hawtio       | hawt.io                    |
      | contributing | hawt.io/docs/contributing/ |
      | GitHub       | github.com/hawtio/hawtio   |

  @helpTests @springBootTests
  Scenario: Check links are not broken in Camel tab
    Given User is on "Camel" tab of Help page
    When User clicks on link text "Camel"
    Then User is redirected to the "actuator/hawtio/camel/contexts"
    And User is returned to previous page