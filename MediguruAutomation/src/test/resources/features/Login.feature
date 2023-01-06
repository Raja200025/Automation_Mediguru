Feature: To Test the Login Functionality

  Scenario: Successful Login using Valid Credentials

    Given I am on Login Page
    When I enter the Username as "jtestma1@yopmail.com"
    And I enter the password as "Joe1@123"
    And I click the "Login" Button
    Then I am on the Home Page
