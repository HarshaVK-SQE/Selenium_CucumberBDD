#Author: Harsha Vardhan Kanakagiri
#Date: 05 September 2025
#Description: Login Feature Functionality

  Feature: Feature to test the Login Functionality

    Scenario: Check Login is successful with valid userName and passWord.

      Given user is on Login Page
      When user enters userName and passWord
      And user clicks on Login Button
      Then user is navigated to Home Page
