Feature: Iframe Functionality

  Scenario: Switch to an iframe and type text
    Given Users navigate to the iframe page
    When User switch to iframe and type a text
    Then The text should be displayed in the iframe