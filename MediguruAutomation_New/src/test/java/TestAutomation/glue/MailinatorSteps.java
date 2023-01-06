package TestAutomation.glue;

import TestAutomation.Pages.MailinatorPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class MailinatorSteps {

    @Then("^I navigate to mailinator page$")
    public void i_navigate_to_mailinator_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.load();

    }

    @Then("^I Enter Go button$")
    public void i_Enter_Go_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.Click_GoButton();

    }

    @Then("^I verify mail page is displayed$")
    public void i_verify_mail_page_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.verify_mailpage_displayed();

    }

    @And("^I Enter id as '(.*)'$")
    public void iEnterIdAsJpMailinatorCom(String value) throws IOException {
        MailinatorPage.Enter_mailaddress(value);
    }



    @Then("^I click on Email verification mail$")
    public void iClickOnEmailVerificationMail() {
        MailinatorPage.Click_mailpage();
    }

    @And("^I Read the verification code$")
    public void iReadTheVerificationCode() {
        MailinatorPage.wait_till_Verification_pin_get_readed();
    }

    @And("^I '(.*)' the mailinator$")
    public void iCloseTheMailinator(String value) {
        MailinatorPage.close_mailinator();
    }

    @Then("^I click on Link in Invite email$")
    public void iClickOnLinkInInviteEmail() {
        MailinatorPage.click_invitelink();
    }

    @Then("^I click on regsitration link$")
    public void iClickOnRegsitrationLink() {
        MailinatorPage.click_registrationlink();

    }

    @Then("^I Verify the Provider Registration page displayed$")
    public void iVerifyTheProviderRegistrationPageDisplayed() {
        MailinatorPage.Verify_InviteRegpage();

    }


    @And("^I click provider type as Doctor$")
    public void iClickProviderTypeAsDoctor() {
    }

    @And("^I Enter NPI in form as '(.*)'$")
    public void iEnterNPIInFormAs(String value) {
        MailinatorPage.EnterNPI(value);
    }

    @And("^I click \"([^\"]*)\" in the form as \"([^\"]*)\"$")
    public void iClickInTheFormAs(String drop,String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MailinatorPage.Click_DropDown(drop,value);

    }

    @And("^I click Mobile Number in form$")
    public void iClickMobileNumberInForm() {
        MailinatorPage.Click_Mobilenumber();
    }

    @And("^I click India in list$")
    public void iClickIndiaInList() {
        MailinatorPage.Click_India();
    }

    @And("^I Enter Mobile number in form as '(.*)'$")
    public void iEnterMobileNumberInFormAs(String value) {
        MailinatorPage.Enter_PhoneNumber(value);
    }

    @And("^I click \"([^\"]*)\" in form as \"([^\"]*)\"$")
    public void iClickInFormAs(String drop,String value) throws Throwable {
        MailinatorPage.Click_DropDown(drop,value);

    }

    @And("^I Enter address one as '(.*)' in form$")
    public void iEnterAddressOneAsAbcInForm(String value) {
        MailinatorPage.Enter_Addressoneform(value);
    }

    @And("^I Enter city as '(.*)' in form$")
    public void iEnterCityAsSeattleInForm(String value) {
        MailinatorPage.Enter_Cityform(value);
    }

    @And("^I Enter state as '(.*)' in form$")
    public void iEnterStateAsWashingtonInForm(String value) {
        MailinatorPage.Enter_stateform(value);
    }

    @And("^I Enter country as '(.*)' in form$")
    public void iEnterCountryAsUSInForm(String value) {
        MailinatorPage.Enter_Countryform(value);
    }

    @And("^I Enter zipcode as '(.*)' in form$")
    public void iEnterZipcodeAsInForm(String value) {
        MailinatorPage.Enter_zipcodeform(value);
    }

    @And("^I Enter DOB as \"([^\"]*)\" in the form$")
    public void iEnterDOBAsInTheForm(String value) throws Throwable {
        MailinatorPage.Click_DOB(value);

    }

    @And("^I upload the certificate in form$")
    public void iUploadTheCertificateInForm() {
        MailinatorPage.File_Upload();
    }

    @And("^I click Next Button in form$")
    public void iClickNextButtonInForm() {
        MailinatorPage.Click_NextButtonform();
    }

    @Then("^I verify Credntials page is displayed$")
    public void iVerifyCredntialsPageIsDisplayed() {
        MailinatorPage.verifyCredentialspage();
    }

    @And("^I Enter the password as '(.*)' in form$")
    public void iEnterThePasswordAsHelloInForm(String value) throws IOException {
        MailinatorPage.Enter_MAPasswordform(value);
    }

    @And("^I Enter the confirm password as '(.*)' in form$")
    public void iEnterTheConfirmPasswordAsHelloInForm(String value) {
        MailinatorPage.Enter_ConfirmPasswordform(value);
    }

    @And("^I click the Register Now button in form$")
    public void iClickTheRegisterNowButtonInForm() {
        MailinatorPage.Click_RegisterNowbutton();
    }

    @Then("^I verify the alert message as '(.*)'$")
    public void iVerifyTheAlertMessageAsRegistrationComplete(String value) {
        MailinatorPage.Verify_RegComplete();
    }

    @And("^I Enter the username as '(.*)' in form$")
    public void iEnterTheUsernameAsJohnInForm(String value) throws IOException {
        MailinatorPage.Enter_MAUsernameform(value);
    }


    @Then("^I Verify the MA Registration page displayed$")
    public void iVerifyTheMARegistrationPageDisplayed() {
        MailinatorPage.Verify_MAInviteRegpage();
    }

    @And("^I Enter the Provider username as '(.*)' in form$")
    public void iEnterTheProviderUsernameAsNehaproInForm(String value) throws IOException {
        MailinatorPage.Enter_ProUsernameform(value);
    }

    @And("^I Enter the Provider password as '(.*)' in form$")
    public void iEnterTheProviderPasswordAsHelloInForm(String value) throws IOException {
        MailinatorPage.Enter_ProPasswordform(value);

    }


    @And("^I Enter MA id as '(.*)'$")
    public void iEnterMAIdAsTestMAMailinatorCom(String value) throws IOException {
        MailinatorPage.Enter_MA_mailaddress(value);

    }
}
