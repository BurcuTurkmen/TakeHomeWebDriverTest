Feature: Dynamic Loading Functionality

  Scenario: Dynamic Loading Function Example1 Test
    Given User Navigate to Dynamic Loading page
    When User able to click the exampleOne
    Then User verify the Element on page that is hidden page is loaded
    And  User able to click start button
    Then User successfully get the message

  Scenario: Dynamic Loading Function Example2 Test
    Given User Navigate to Dynamic Loading page
    When User able to click the exampleTwo
    Then User verify the Element rendered after the fact page is loaded
    And  User able to click start button
    Then User successfully get the message