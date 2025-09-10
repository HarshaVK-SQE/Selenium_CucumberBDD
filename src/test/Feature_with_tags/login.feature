


Feature: Feature to check the Login Functionality

  @SmokeTest
  Scenario Outline: Scenario to check the login functionality with valid username and passwords
    Given user lands on the login page
    When user enters the valid <username> and <password>
    And user click on the submit button
    Then user should navigate to the home page.

    Examples:
        |username| password|
        | student | Password123 |
