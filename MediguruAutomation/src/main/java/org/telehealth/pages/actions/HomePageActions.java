package org.telehealth.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.telehealth.utils.SeleniumDriver;

public class HomePageActions {
    By appointmentTableSection = By.xpath("//div[@class='appointment-table card']");

    public void isHomePageDisplayed() {
        SeleniumDriver.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(appointmentTableSection));
    }
}
