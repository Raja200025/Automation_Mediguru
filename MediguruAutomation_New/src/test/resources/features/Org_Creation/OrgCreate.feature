@orgRegistration
Feature: To Test Super admin can create the Organization

  Scenario: Super admin creating the Org

    Given I Navigate to "https://testtelehealth.mediguru.com/"
    Given I am on Login Page
    When I enter the Username as "superadmin1"
    And I enter the password as "Hello123."
    And I click the "submit" Button
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

    And I click the "Dashboard"
    And i Click "Invite" in sidebar
    And I select the Organization
    And I select the "Provider" role
    And I enter the firstname as "Testprovider"
    And I enter the lastname as "ZzTest14"
    And I enter the email address "Testprovider14@mailinator.com"
    And I add the description as "Welcome to MEDIGURU"
    And I click the "Invite" button

    And i Click "Invite" in sidebar
    And I select the Organization
    And I select the "Medical Assistant" role
    And I enter the firstname as "TestMedicalAssistant"
    And I enter the lastname as "ZzTest14"
    And I enter the email address "TestMA14@mailinator.com"
    And I add the description as "Welcome to MEDIGURU"
    And I click the "Invite" button


