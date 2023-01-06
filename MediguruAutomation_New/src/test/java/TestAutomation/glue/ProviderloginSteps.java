package TestAutomation.glue;

import TestAutomation.Pages.ProviderLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class ProviderloginSteps {
    @Then("^I verify the loginpage is displayed$")
    public void iVerifyTheLoginpageIsDisplayed() {
        ProviderLoginPage.verify_login_details_displayed();
    }

    @And("^I enter the username as '(.*)'$")
    public void iEnterTheUsernameAsJaddu(String value) throws IOException {
        ProviderLoginPage.Enter_username(value);
    }

    @And("^I enter the password as '(.*)'$")
    public void iEnterThePasswordAsHello(String value) throws IOException {
        ProviderLoginPage.Enter_password(value);
    }

    @Then("^I click the Login button$")
    public void iClickTheLoginButton() {
        ProviderLoginPage.Click_login();
    }

    @Then("^I verify the application page has been loggedin$")
    public void iVerifyTheApplicationPageHasBeenLoggedin() {
        ProviderLoginPage.verify_application_loggedin();
    }


    @Given("^I navigate to '(.*)'$")
    public void iNavigateToHttpsTesttelehealthMediguruComLogin(String value) {
        ProviderLoginPage.load();

    }

    @Then("^I click profile button$")
    public void iClickProfileButton() {
        ProviderLoginPage.Click_profileimage();

    }

    @And("^I click logout$")
    public void iClickLogout() {
        ProviderLoginPage.Click_logout();

    }

    @Then("^I verify application has been loggedoff$")
    public void iVerifyApplicationHasBeenLoggedoff() {
        ProviderLoginPage.verify_logoff();

    }

    @And("^I click the Forgot username link$")
    public void iClickTheForgotUsernameLink() {
        ProviderLoginPage.Click_ForgotUsername();
    }

    @And("^I click Get username button$")
    public void iClickGetUsernameButton() {
        ProviderLoginPage.Click_GetUsername();
    }

    @Then("^I verify the Alert message as '(.*)'$")
    public void iVerifyTheAlertMessageAsYourUsernameHasBeenSentToTheEmail(String value) {
        ProviderLoginPage.verify_AlertMsg();
    }

    @And("^I click Return to Login$")
    public void iClickReturnToLogin() {
        ProviderLoginPage.Click_ReturntoLogin();
    }

    @And("^I click Reset Password button$")
    public void iClickResetPasswordButton() {
        ProviderLoginPage.Click_ResetPassword();
    }

    @And("^I Enter the New password as '(.*)'$")
    public void iEnterTheNewPasswordAsHello(String value) {
        ProviderLoginPage.Enter_NewPassword(value);
    }

    @And("^I Enter the confirm password '(.*)'$")
    public void iEnterTheConfirmPasswordHello(String value) {
        ProviderLoginPage.Enter_ConfirmPassword(value);
    }

    @And("^I click Save Button$")
    public void iClickSaveButton() {
        ProviderLoginPage.Click_SaveButton();
    }

    @Then("^I verify the popup as Password Reset successfully$")
    public void iVerifyThePopupAsPasswordResetSuccessfully() {
        ProviderLoginPage.verify_PswdAlert();
    }


    @Then("^I click New Invite button$")
    public void iClickNewInviteButton() {
        ProviderLoginPage.ClickNewInviteButton();
    }

    @And("^I Enter MA Email as '(.*)'$")
    public void iEnterMAEmailAsMduMailinatorCom(String value) {
        ProviderLoginPage.Enter_MAemail(value);
    }

    @And("^I click send button$")
    public void iClickSendButton() {
        ProviderLoginPage.ClickSendButton();

    }

    @Then("^I verify Invite mail has been sent to MA$")
    public void iVerifyInviteMailHasBeenSentToMA() {
        ProviderLoginPage.verify_InvitePopupAlert();
    }

    @And("^I click Accept Button$")
    public void iClickAcceptButton() {
        ProviderLoginPage.ClickAcceptButton();
    }

    @Then("^I verify the Popup Alert as Invite Accepted$")
    public void iVerifyThePopupAlertAsInviteAccepted() {
        ProviderLoginPage.verify_InviteAcceptedPopup();
    }


    @Then("^I click MA Profile Button$")
    public void iClickMAProfileButton() {
        ProviderLoginPage.ClickMA_ProfileButton();
    }

    @And("^I click Assistants tab$")
    public void iClickAssistantsTab() {
        ProviderLoginPage.Click_Assistants();
    }

    @Then("^I verify the assistants screen is displayed$")
    public void iVerifyTheAssistantsScreenIsDisplayed() {
        ProviderLoginPage.verifyMenuAssistants();
    }

    @And("^I click the MA$")
    public void iClickTheMA() {
        ProviderLoginPage.ClickMA_Assistants();
    }

    @And("^I click the Revoke Assistance$")
    public void iClickTheRevokeAssistance() {
        ProviderLoginPage.ClickRevokeAssistance();
    }

    @Then("^I verify the Alert as Removed MA$")
    public void iVerifyTheAlertAsRemovedMA() {
        ProviderLoginPage.verifyRejectedMAPopup();
    }

    @And("^I click Dashboard$")
    public void iClickDashboard() {
        ProviderLoginPage.ClickDashboard();
    }

    @Then("^I verify Invite mail has been sent to Provider$")
    public void iVerifyInviteMailHasBeenSentToProvider() {
        ProviderLoginPage.verify_ProInvitePopupAlert();
    }

    @And("^I Enter Provider Email as '(.*)'$")
    public void iEnterProviderEmailAsKsMailinatorCom(String value) {
        ProviderLoginPage.Enter_Provideremail(value);
    }

    @And("^I click Providers tab$")
    public void iClickProvidersTab() {
        ProviderLoginPage.Click_ProvidersLink();
    }

    @Then("^I verify the providers screen is displayed$")
    public void iVerifyTheProvidersScreenIsDisplayed() {
        ProviderLoginPage.verifymenuProviders();
    }

    @And("^I click the provider$")
    public void iClickTheProvider() {
        ProviderLoginPage.ClickProvidersName();
    }

    @Then("^I verify the Alert as Removed Provider$")
    public void iVerifyTheAlertAsRemovedProvider() {
        ProviderLoginPage.verifyProviders_RejectedPopup();
    }

}
