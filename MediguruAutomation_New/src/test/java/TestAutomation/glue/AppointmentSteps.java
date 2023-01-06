package TestAutomation.glue;

import TestAutomation.Pages.AppointmentPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.io.IOException;

public class AppointmentSteps {

    @Then("^I click the New Appointment$")
    public void i_click_the_New_Appointment() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Click_NewAppointment();

    }

    @Then("^I click Create Button$")
    public void i_click_Create_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Click_Create();

    }

    @And("^I Enter the Reason for Visit as '(.*)'$")
    public void iEnterTheReasonForVisitAsGeneralCheckup(String value) throws IOException {
        AppointmentPage.Enter_Reason(value);
    }

    @Then("^I verify message as Appointment created successfully$")
    public void iVerifyMessageAsAppointmentCreatedSuccessfully() {
        AppointmentPage.verify_AppoitmentSuccess();
    }


    @And("^I Enter Date as \"([^\"]*)\"$")
    public void iEnterDateOfBirthAs(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Enter_Date_of_Birth(value);

    }

    @And("^I Enter the Time as \"([^\"]*)\"$")
    public void iEnterTheTimeAs(String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Enter_Time(value);

    }

    @And("^I Select \"([^\"]*)\" as \"([^\"]*)\"$")
    public void iSelectAs(String drop, String value) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        AppointmentPage.Appoinmentdropdown(drop, value);

    }

    @Then("^I click the New CheckIn$")
    public void iClickTheNewCheckIn() {
        AppointmentPage.Click_NewCheckin();
    }


    @And("^I Pick a Slot$")
    public void iPickASlot() {
        AppointmentPage.pick_the_slot();

    }

    @And("^I click on the schdule page$")
    public void iClickOnTheSchdulePage() {
        AppointmentPage.Click_the_schedule();
    }

    @And("^I click to open the appointment details page$")
    public void iClickToOpenTheAppointmentDetailsPage() {
        AppointmentPage.select_the_appointment();
    }

    @And("^I Click on the Resend confirmation button$")
    public void iClickOnTheResendConfirmationButton() {
        AppointmentPage.Click_the_resendconfirmation();
    }

    @And("^I verify Appointment details page displayed$")
    public void iVerifyAppointmentDetailsPageDisplayed() {
        AppointmentPage.Appointment_details_Page();
    }

    @Then("^I Verify message as Resend confirmation send successfully$")
    public void iVerifyMessageAsResendConfirmationSendSuccessfully() {
        AppointmentPage.Resend_confirmation_message();
    }

    @And("^I click the cancel button$")
    public void iClickTheCancelButton() {
        AppointmentPage.Click_the_cancelbutton();
    }

    @And("^I verify Pop-up screen displayed$")
    public void iVerifyPopUpScreenDisplayed() {
        AppointmentPage.Verify_pop_up_screen();
    }

    @And("^I Click on Confirmation yes button$")
    public void iClickOnConfirmationYesButton() {
        AppointmentPage.Click_the_yes_button();
    }

    @Then("^I verify message displayed as Appointment Cancel successfully$")
    public void iVerifyMessageDisplayedAsAppointmentCancelSuccessfully() {
        AppointmentPage.Verify_the_success_message();
    }

    @And("^I navigate home page$")
    public void iNavigateHomePage() {
        AppointmentPage.navigate_to_homepage();
    }


    @And("^I Select the \"([^\"]*)\" in appointment dropdown list$")
    public void iSelectTheInAppointmentDropdownList(String drop) throws Throwable {
        AppointmentPage.Durationdropdown(drop);

    }


    @And("^I select the appointmenttypes as \"([^\"]*)\"$")
    public void iSelectTheAppointmenttypesAs(String value) throws Throwable {
        AppointmentPage.Appointmenttype(value);
    }
}

