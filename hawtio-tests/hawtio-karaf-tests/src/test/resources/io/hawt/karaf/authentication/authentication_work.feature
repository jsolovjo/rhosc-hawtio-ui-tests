Feature: Different actions on Login page of Hawtio

  @allKarafTests @authenticationTests
  Scenario Outline:Input wrong credentials
    Given User is on Login page
    When  User enters credantials username "<username>" and password "<password>"
    Then Login fails

    Examples: Set of credantials
    |username | password |
    |Karaf|karf|
    |Karaf|Karaf|
    |KARAF|KARAF|
    | | |
    |||
    |alert( "hello" );|   alert( "" );|
    |alert("hello" )|alert( "" )|
    |<script>alert('test');<\/script>|<script>alert('test');<\/script>|
