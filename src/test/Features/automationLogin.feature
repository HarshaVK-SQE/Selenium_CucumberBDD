Feature: Feature to check the Login Functionality


  Scenario Outline: Check Login is successful with valid userName and password
    Given user is on the login page
    When I enter username "<username>" and password "<password>"
    And click on the submit button
    Then user should navigate to home page successfully

    Examples:
            | username | password |
            | student  | Password123 |
            | student11  | aPassword123 |
