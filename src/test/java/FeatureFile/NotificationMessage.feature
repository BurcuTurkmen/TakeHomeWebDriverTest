Feature: Notification Message Feature

  Scenario: Notification Message Function Test 1
    Given User navigate to notification message page
    When User able to click on the click here link
    Then Unsuccessful message should be display
    And User able to double click on the click here link
    Then Success message should be display