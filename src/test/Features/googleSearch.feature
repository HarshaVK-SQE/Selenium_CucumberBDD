#Author: Harsha Vardhan
#Date: 05-Sept-2025
#Description: Google Search Functionality

  Feature: Feature to Test the Google Search Functionality

    Scenario: Navigate to Google and check the Search Functionality
      Given user navigated is on the Google Search
      When user enters the search text
      And user click on the search button
      Then user is navigated to search page
