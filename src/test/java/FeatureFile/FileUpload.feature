Feature: File Upload Functionality

  Scenario: File Upload Function Test 1
    Given User Navigate to File Upload page
    When User able to click on the File Upload button
    And User able to select the file from already downloaded file
    And User able to click on the upload button
    Then User successfully uploaded the file

  Scenario: File Upload Function Test 2
    Given User Navigate to File Upload page
    When User able to click on the File Upload button
    And User able to select the file from already downloaded file
    And User able to drag and drop the file in the box
    Then User successfully uploaded the file