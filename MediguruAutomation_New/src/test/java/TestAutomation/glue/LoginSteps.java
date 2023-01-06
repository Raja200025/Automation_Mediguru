package TestAutomation.glue;

import TestAutomation.Pages.Loginpage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

public class LoginSteps extends BaseStepClass {

    @Given("^I Navigate to \"([^\"]*)\"$")
    public void iNavigateTo(String url)  {
        Hooks.driver.get(url);
    }

    @Given("^I am on Login Page$")
    public void iAmOnLoginPage() {
        /*Loginpage.isLoginPageDisplayed();*/
    }

    @When("^I enter the Username as \"([^\"]*)\"$")
    public void iEnterTheUsernameAs(String username) throws IOException {
        Loginpage.sendUsername(username);
    }

    @When("^I enter the provider/Ma Username as \"([^\"]*)\"$")
    public void iEnterTheProviderMaUsernameAs(String val)  {
        Loginpage.send(val,Loginpage.username);
    }

    @And("^I enter the provider or Ma password as \"([^\"]*)\"$")
    public void iEnterTheProviderOrMaPasswordAs(String val1) throws Throwable {
        Loginpage.send(val1,Loginpage.password);
    }

    @And("^I enter the password as \"([^\"]*)\"$")
    public void iEnterThePasswordAs(String pass) throws IOException {
        Loginpage.sendPassword(pass);
    }

    @And("^I click the \"([^\"]*)\" Button$")
    public void iClickTheButton(String btn) {
        Loginpage.clickbtn(btn);
    }

    @Then("^I am Navigated to the Home Page$")
    public void iAmNavigatedToTheHomePage() {
        Loginpage.providerLoginVerify();
    }

    @And("^I log out of the application$")
    public void iLogOutOfTheApplication() {
        Loginpage.Img();
    }

}
