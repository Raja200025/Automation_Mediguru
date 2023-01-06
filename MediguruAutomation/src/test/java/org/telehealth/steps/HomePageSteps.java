package org.telehealth.steps;

import io.cucumber.java8.En;
import org.telehealth.pages.actions.HomePageActions;

public class HomePageSteps implements En {

    HomePageActions homePage = new HomePageActions();

    public HomePageSteps() {
        Then("^I am on the Home Page$", () -> homePage.isHomePageDisplayed());
    }
}
