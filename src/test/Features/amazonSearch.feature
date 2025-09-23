Feature: Feature to check the amazon search feature.

Scenario: Check the Amazon search feature
    Given when user land on amazon home page
    When user click on Search bar and enter the text
    And click on search button
    Then user should see the search results