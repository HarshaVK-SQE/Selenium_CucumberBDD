Feature: Feature to test the Login Functionality
  Scenario Outline: Check the login functionality with valid username and password
    Given user is on the orange hrm login page
    When user enters the valid <username> and <password>
    And user click on the submit button
    Then user should navigate to orange hrm home page successfully

    Examples:
              | username| password |
              | student   | Password123  |
