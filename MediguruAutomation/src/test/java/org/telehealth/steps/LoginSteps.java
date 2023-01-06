package org.telehealth.steps;

import io.cucumber.java8.En;
import org.telehealth.pages.actions.LoginPageActions;

public class LoginSteps implements En {
    LoginPageActions loginPage = new LoginPageActions();

    public LoginSteps() {
        Given("^I am on Login Page$", () -> loginPage.isLoginPageDisplayed());
        When("^I enter the Username as \"([^\"]*)\"$", (String username) -> loginPage.enterUsername(username));
        And("^I enter the password as \"([^\"]*)\"$", (String password) -> loginPage.enterPassword(password));
        And("^I click the \"([^\"]*)\" Button$", (String arg0) -> loginPage.clickLogin());


    }
}
