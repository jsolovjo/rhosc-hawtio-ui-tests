Feature: Different actions on Preferences page


  @preferncesTests
  Scenario Outline: Set up negative values on Camel tab of Preferences page
    Given User is on Preferences page
    And User clicks on Jolokia tab of Prefernces page
    When User sets value of "<value>" to "<setting>" on Jolokia tab of Preferences page
    And User clicks on Apply button
    Then Input field "<setting>" should not contain "<value>"

    Examples: Set of inputs and values
    |setting|value|
    |maxDepth|-0|
    |maxDepth|0.1|
    |maxDepth|0.00001|
    |maxDepth|-0.00001|
    |maxCollectionSize|-0|
    |maxCollectionSize|0.000001|
    |maxCollectionSize|-0.1|
    |maxCollectionSize|500000|
    |maxDepth|7|

#    @preferncesTests
#    Scenario Outline: Set up negative values in Camel tab
#      Given User is on Preferences page
#      And User clicks on Camel tab of Prefernces page
#      When User sets value of "<value>" to "<setting>" on Camel tab of Preferences page
#      And User reloads page
#      Then Input field "<setting>" should not contain "<freevalue>"
#
#      Examples: Set of inputs and values
#      |setting|value|
#      |camelMaximumTraceOrDebugBodyLength|-1|
#      |camelMaximumTraceOrDebugBodyLength|-999999|
#      |camelMaximumTraceOrDebugBodyLength|-14|
#      |camelMaximumTraceOrDebugBodyLength|-0.1|
#      |camelMaximumLabelWidth|-1|
#      |camelMaximumLabelWidth|-9999999|
#      |camelMaximumLabelWidth|-00099|
#      |camelMaximumLabelWidth|-0.1|
#      |camelRouteMetricMaxSeconds|-1|
#      |camelRouteMetricMaxSeconds|-99999|
#      |camelRouteMetricMaxSeconds|-14|
#      |camelRouteMetricMaxSeconds|-0.1|

