Feature: To Test the Login Functionality time duration

  Scenario: Successful Login using Valid Credentials time duration

    Given I Navigate to "https://testtelehealth.mediguru.com/"
    Given I am on Login Page
    When I enter the provider/Ma Username as "superadmin"
    And I enter the provider or Ma password as "Hello123@"
    And I click the "submit" Button
#    Then I am Navigated to the Home Page
    And I log out of the application
