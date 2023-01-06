@Login
Feature: Verify sample feature to test 'Invite flow';

  Scenario: Invite flow for MA Registration

    Given I navigate to mailinator page
    And   I Enter id as 'TestMA14@mailinator.com'
    And   I Enter Go button
    Then  I verify mail page is displayed
    Then  I click on Link in Invite email
    Then  I click on regsitration link
    Then  I Verify the MA Registration page displayed
    And   I click "title" in form as "Dr"
    And   I Enter NPI in form as '435465656'
    And   I click "Speciality and Services" in form as "DERMATOLOGY"
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
    And   I Enter the username as 'keerthi' in form
    And   I Enter the password as 'Hello123.' in form
    And   I Enter the confirm password as 'Hello123.' in form
    And   I click the Register Now button in form
    Then  I verify the alert message as 'Registration complete'