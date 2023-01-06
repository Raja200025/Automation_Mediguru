package TestAutomation.glue;

import TestAutomation.Pages.MailinatorPage;
import TestAutomation.Pages.usernameandpasswordpage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class usernameandpasswordsteps {

    @And("^I Enter Email id as '(.*)'$")
    public void iEnterEmailIdAsJpMailinatorCom(String value) throws IOException {
        usernameandpasswordpage.Enter_Email(value);
    }

    @And("^I Enter the verification code$")
    public void iEnterTheVerificationCode() {
        usernameandpasswordpage.enter_Verification_pin(MailinatorPage.value);
    }

    @Then("^I verify Third step page displayed$")
    public void iVerifyThirdStepPageDisplayed() {
        usernameandpasswordpage.verify_Thirdpage();
    }

    @Then("^I Enter first name as '(.*)'$")
    public void i_Enter_first_name_as_john(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        usernameandpasswordpage.Enter_firstname(value);

    }

    @Then("^I Enter last name as '(.*)'$")
    public void i_Enter_last_name_as_peter(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        usernameandpasswordpage.Enter_lastname(value);

    }

    @And("^I click Mobile Number$")
    public void iClickMobileNumber() {
        usernameandpasswordpage.Click_mobilenumber();

    }

    @And("^I click India$")
    public void iClickIndia() {
        usernameandpasswordpage.Click_India();

    }

    @And("^I Enter Mobile number as '(.*)'$")
    public void iEnterMobileNumberAs(String value) throws IOException {
        usernameandpasswordpage.Enter_phonenumber(value);
    }


    @And("^I upload the certificate file$")
    public void iUploadTheCertificateFile() {
        usernameandpasswordpage.Upload_File();

    }

    @And("^I Enter first name 'testpatientthres'$")
    public void iEnterFirstNameTestpatientthres() throws IOException {
        usernameandpasswordpage.Enter_firstnames();

    }
}
