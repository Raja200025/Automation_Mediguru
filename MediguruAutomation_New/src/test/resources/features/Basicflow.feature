@basicflow
Feature: To Test Super admin can create the Organization to appointment creation

  Scenario: Super admin creating the Org

    Given I Navigate to "https://testtelehealth.mediguru.com/"
    Given I am on Login Page
    When I enter the Username as "superadmin1"
    And I enter the password as "Hello123."
    And I click the "submit" Button
    And I verify Application superadmin dashboard displayed
    And I click the "Organization Management"
    And i Click "Add Organization" in sidebar
    And I enter org name as "name"
    And I enter Description as "Test Org Description"
    And I select the "English" as my preferred language
    And I clicking the "Create" button

    And I click the "Speciality Management"
    And i Click "Add Speciality" in sidebar
    And I select the Organization
    And I enter the speciality as "Cardiology"
    And I enter the Description as "description"
    And I click "Save" button for speciality

    And I click the "Location Management"
    And i Click "Add Location" in sidebar
    And I select the Organization
    And I can enter Location as "Seattle"
    And superadmin can add the Description as "Text"
    And super admin can add speciality as "Cardiology"
    And superadmin click "save" button

    And I click the "Canned Message"
    And i Click "Add Canned Messages" in sidebar
    And I select the Organization
    And Super admin enter title as "Welcome"
    And super admin select the category as "General"
    And I entering the detailed message as "Greetings form Org"
    And I Associated to "Provider"
    And I pick the location as "Seattle"
    And I click "save" button to saved the canned message
#Provider Invite
    And I click the "Dashboard"
    And i Click "Invite" in sidebar
    And I select the Organization
    And I select the "Provider" role
    And i select the "Location" as "Seattle"
    And I enter the firstname as "Testprovider"
    And I enter the lastname as "ZzTest14"
    And I enter the provider email address "Testprovider14@mailinator.com"
    And I add the description as "Welcome to MEDIGURU"
    And I click the "Invite" button
    And I log out of the application

#Medical Assistant Invite
#    And i Click "Invite" in sidebar
#    And I select the Organization
#    And I select the "Medical Assistant" role
#    And i select the "Location" as "Seattle"
#    And I enter the firstname as "TestMedicalAssistant"
#    And I enter the lastname as "ZzTest14"
#    And I enter the ma email address "TestMA14@mailinator.com"
#    And I add the description as "Welcome to MEDIGURU"
#    And I click the "Invite" button
#    And I log out of the application
#Provider Registration
    Given I navigate to mailinator page
    And   I Enter id as 'Testprovider14@mailinator.com'
    And   I Enter Go button
    Then  I verify mail page is displayed
    Then  I click on Link in Invite email
    Then  I click on regsitration link
    Then  I Verify the Provider Registration page displayed
    And   I click "title" in form as "Dr"
    And   I Enter NPI in form as '435465656'
    And   I click "Speciality and Services" in form as "DERMATOLOGY"
    And   I click "providertype" in form as "Doctor"
    And   I upload the certificate in form
    And   I click Mobile Number in form
    And   I click India in list
    And   I Enter Mobile number in form as '9655803849'
    And   I Enter DOB as "11/17/1994" in the form
    And   I click "gender" in form as "Male"
    And   I Enter address one as 'abc123' in form
    And   I Enter city as 'seattle' in form
    And   I Enter state as 'washington' in form
    And   I Enter country as 'US' in form
    And   I Enter zipcode as '98100' in form
    And   I click Next Button in form
    Then  I verify Credntials page is displayed
    And   I Enter the Provider username as 'nehapro' in form
    And   I Enter the Provider password as 'Hello123.' in form
    And   I Enter the confirm password as 'Hello123.' in form
    And   I click the Register Now button in form
    Then  I verify the alert message as 'Registration complete'
#Medical Assistant Registration
#    Given I navigate to mailinator page
#    And   I Enter MA id as 'TestMA@mailinator.com'
#    And   I Enter Go button
#    Then  I verify mail page is displayed
#    Then  I click on Link in Invite email
#    Then  I click on regsitration link
#    Then  I Verify the MA Registration page displayed
#    And   I click "title" in form as "Dr"
#    And   I Enter NPI in form as '435465656'
#    And   I click "Speciality and Services" in form as "DERMATOLOGY"
#    And   I upload the certificate in form
#    And   I click Mobile Number in form
#    And   I click India in list
#    And   I Enter Mobile number in form as '9655803849'
#    And   I Enter DOB as "11/17/1994" in the form
#    And   I click "gender" in form as "Male"
#    And   I Enter address one as 'abc123' in form
#    And   I Enter city as 'seattle' in form
#    And   I Enter state as 'washington' in form
#    And   I Enter country as 'US' in form
#    And   I Enter zipcode as '98100' in form
#    And   I click Next Button in form
#    Then  I verify Credntials page is displayed
#    And   I Enter the username as 'keerthi' in form
#    And   I Enter the password as 'Hello123.' in form
#    And   I Enter the confirm password as 'Hello123.' in form
#    And   I click the Register Now button in form
#    Then  I verify the alert message as 'Registration complete'

#Urgent Appointment Booking
    Given I navigate to 'https://testtelehealth.mediguru.com/login'
    Then  I verify the loginpage is displayed
    And   I enter the username as 'friendsprovider'
    And   I enter the password as 'Hello123@'
    Then  I click the Login button
    Then  I verify the application page has been loggedin
    Then  I click the New CheckIn
    And   I Select the "Duration" in appointment dropdown list
    And   I Select "appointmentType" as "General"
    And   I Enter first name as 'testpatienttwo'
    And   I Enter last name as 'zztest'
    And   I click Mobile Number
    And   I click India
    And   I Enter Mobile number as '8344024459'
    And   I Enter Email id as 'testpatienttwo@mailinator.com'
    And   I Enter the Reason for Visit as 'General Checkup'
    And   I click Create Button
    Then  I verify message as Appointment created successfully

#    New Appointment Booking
    Then  I click the New Appointment
    And   I Enter Date as "02/01/2022"
    And   I Select "appointmentType" as "General"
    And   I Pick a Slot
    And   I Enter first name 'testpatientthres'
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