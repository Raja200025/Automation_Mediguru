package TestAutomation.glue;

import TestAutomation.Pages.HomePage;
import TestAutomation.Pages.Loginpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class HomepageSteps extends BaseStepClass {


    @And("^I select the \"([^\"]*)\" role$")
    public void iSelectTheRole(String Role) {
        HomePage.selectRole(Role);
    }


    @And("^I enter the firstname as \"([^\"]*)\"$")
    public void iEnterTheFirstnameAs(String Firstname) {
        Loginpage.send(Firstname, HomePage.firstname);
    }

    @And("^I enter the lastname as \"([^\"]*)\"$")
    public void iEnterTheLastnameAs(String Lastname) {
        Loginpage.send(Lastname, HomePage.lastname);
    }

    @And("^I enter the email address \"([^\"]*)\"$")
    public void iEnterTheEmailAddress(String email) {
        Loginpage.send(email, HomePage.emailaddress);
    }

    @And("^I add the description as \"([^\"]*)\"$")
    public void iAddTheDescriptionAs(String text) {
        Loginpage.send(text, HomePage.description);
    }

    @And("^I click the \"([^\"]*)\" button$")
    public void iClickTheButton(String invite) {
        HomePage.submitBtn();
    }

    @And("^I click the \"([^\"]*)\"$")
    public void iClickThe(String orgManageBtn) {
        HomePage.NavManagementBtn(orgManageBtn);
    }

    @And("^i Click \"([^\"]*)\" in sidebar$")
    public void iClickInSidebar(String AddBtn) {
        HomePage.ClickAddBtn(AddBtn);
    }

    @And("^I enter org name as \"([^\"]*)\"$")
    public void iEnterOrgNameAs(String OrgName) throws IOException {
        HomePage.Org(OrgName);
    }

    @And("^I enter Description as \"([^\"]*)\"$")
    public void iEnterDescriptionAs(String OrgDes) {
        Loginpage.send(OrgDes, HomePage.description);
    }

    @And("^I select the \"([^\"]*)\" as my preferred language$")
    public void iSelectTheAsMyPreferredLanguage(String Language) {
        HomePage.PreferredLanguage(Language);
    }

    @And("^I clicking the \"([^\"]*)\" button$")
    public void iClickingTheButton(String arg0) {
        HomePage.submitBtn();
    }

    @Then("^I verify org create successfully$")
    public void iVerifyOrgCreateSuccessfully() {
    }

    @And("^I click \"([^\"]*)\" button$")
    public void iClickButton(String addBtn) {
        HomePage.ClickAddBtn(addBtn);
    }

    @And("^I select the Organization$")
    public void iSelectTheOrganization() throws IOException {
        HomePage.selectOrg();
    }

    @And("^I enter the speciality as \"([^\"]*)\"$")
    public void iEnterTheSpecialityAs(String Speciality) throws Throwable {
        Loginpage.send(Speciality, HomePage.Name);
    }

    @And("^I enter the Description as \"([^\"]*)\"$")
    public void iEnterTheDescriptionAs(String DescriptionTxt) {
        Loginpage.send(DescriptionTxt, HomePage.description);
    }

    @And("^I click \"([^\"]*)\" button for speciality$")
    public void iClickButtonForSpeciality(String arg0) {
        HomePage.submitBtn();
    }


    @And("^I can enter Location as \"([^\"]*)\"$")
    public void iCanEnterLocationAs(String Location) {
        Loginpage.send(Location, HomePage.Name);
    }

    @And("^superadmin can add the Description as \"([^\"]*)\"$")
    public void superadminCanAddTheDescriptionAs(String Des4Location) {
        Loginpage.send(Des4Location, HomePage.description);
    }

    @And("^superadmin click \"([^\"]*)\" button$")
    public void superadminClickButton(String arg0) {
        HomePage.submitBtn();
    }

    @And("^Super admin enter title as \"([^\"]*)\"$")
    public void superAdminEnterTitleAs(String TitleTxt) {
        Loginpage.send(TitleTxt, HomePage.title);
    }

    @And("^super admin select the category as \"([^\"]*)\"$")
    public void superAdminSelectTheCategoryAs(String category) {
        HomePage.selectCategory(category);
    }

    @And("^I entering the detailed message as \"([^\"]*)\"$")
    public void iEnteringTheDetailedMessageAs(String DetailedMsg) {
        Loginpage.send(DetailedMsg, HomePage.DetailedMsg);
    }

    @And("^I Associated to \"([^\"]*)\"$")
    public void iAssociatedTo(String associationTo) {
        HomePage.roleAssociateTo(associationTo);
    }

    @And("^I pick the location as \"([^\"]*)\"$")
    public void iPickTheLocationAs(String Location) {
        HomePage.locationAssociateTo(Location);
    }

    @And("^I click \"([^\"]*)\" button to saved the canned message$")
    public void iClickButtonToSavedTheCannedMessage(String saveBtn) {
        HomePage.submitBtn();
    }

    @And("^super admin can add speciality as \"([^\"]*)\"$")
    public void superAdminCanAddSpecialityAs(String speciality) {
        HomePage.SelectSpecialityTo(speciality);
    }

    @And("^I enter the provider email address \"([^\"]*)\"$")
    public void iEnterTheProviderEmailAddress(String arg0) throws Throwable {
        HomePage.Pro_Enter_mailaddress(arg0);
    }

    @And("^I enter the ma email address \"([^\"]*)\"$")
    public void iEnterTheMaEmailAddress(String value) throws Throwable {
        HomePage.MA_Enter_mailaddress(value);
    }

    @And("^I verify Application superadmin dashboard displayed$")
    public void iVerifyApplicationSuperadminDashboardDisplayed() {
        HomePage.Superadmindashboard();
    }


    @And("^i select the \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iSelectTheAs(String drop, String value) {
        HomePage.selectLocation(drop,value);
    }
}

