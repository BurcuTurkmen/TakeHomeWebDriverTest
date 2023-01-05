Feature: Mouse Hover Functionality

  Scenario: Mouse Hover Function Test
    Given User navigate to mouse hover page
    When User does a mouse hover on first image
    Then Additional information should be displayed for first image
    And User does a mouse hover on second image
    Then Additional information should be displayed for second image
    And User does a mouse hover on third image
    Then Additional information should be displayed for third image
