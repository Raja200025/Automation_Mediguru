@Basic_New_Appointment
Feature: verify sample feature to test 'Basic Appointment'
  Scenario: Login with sample features to test Basic New Check in Appointment

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'friendsprovider'
    And   I enter the password as 'Hello123@'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click the New CheckIn
    And   I select the appointmenttypes as "General"
    # And   I Select "appointmentType" as "General"
    And   I Enter first name as 'testpatienttwo'
    And   I Enter last name as 'zztest'
    And   I click Mobile Number
    And   I click India
    And   I Enter Mobile number as '8344024459'
    And   I Enter Email id as 'testpatienttwo@mailinator.com'
    And   I Enter the Reason for Visit as 'General Checkup'
    And   I click Create Button
    Then  I verify message as Appointment created successfully