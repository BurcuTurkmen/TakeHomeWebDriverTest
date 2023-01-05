Feature: Login Functionality

  Scenario: Admin User Login to LocalHost Positive Test
    Given User navigates to login page
    When User enters valid credentials with valid username "tomsmith" and valid password "SuperSecretPassword!"
    And User clicks on login button
    Then User should login successfully


  Scenario: Admin User Login to LocalHost Negative Test
    Given User navigates to login page
    When User enters invalid credentials with invalid username "TomSmith" and invalid password "SuperSecretPassword!!!"
    And User clicks on login button
    Then User should not be able to login successfully