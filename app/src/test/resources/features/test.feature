Feature: First search in google

  @regression
  Scenario: Search in google
    Given the access to google
    When I type "Automation test" in input
    Then I will be redirected to the Search page