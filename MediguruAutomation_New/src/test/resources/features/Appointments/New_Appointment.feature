@login
Feature: verify sample feature to test 'Basic Appointment'
  Scenario: Login with sample features to test Basic Appointment

    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'friendsprovider'
    And   I enter the password as 'Hello123@'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click the New Appointment
    And   I Enter Date as "02/01/2022"
    And   I Select "appointmentType" as "General"
    And   I Pick a Slot
    And   I Enter first name as 'testpatientthres'
    And   I Enter last name as 'zztest'
    And   I click Mobile Number
    And   I click India
    And   I Enter Mobile number as '8344024459'
    And   I Enter Email id as 'ks17@mailinator.com'
    And   I Enter the Reason for Visit as 'General Checkup'
    And   I click Create Button
    Then  I verify message as Appointment created successfully
    And   I click on the schdule page
    And   I click to open the appointment details page
    And   I verify Appointment details page displayed
    And   I Click on the Resend confirmation button
    Then  I Verify message as Resend confirmation send successfully
    And   I click the cancel button
    And   I verify Pop-up screen displayed
    And   I Click on Confirmation yes button
    Then  I verify message displayed as Appointment Cancel successfully
    And   I navigate home page
