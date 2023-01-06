package org.telehealth.pages.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.telehealth.utils.SeleniumDriver;

public class LoginPageActions {
    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By loginBtn = By.xpath("//button[@type='submit']");


    public void enterUsername(String value) {
        SeleniumDriver.getDriver().findElement(username).sendKeys(value);
    }

    public void isLoginPageDisplayed() {
        SeleniumDriver.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
    }

    public void enterPassword(String value) {
        SeleniumDriver.getDriver().findElement(password).sendKeys(value);
    }

    public void clickLogin() {
        SeleniumDriver.getDriver().findElement(loginBtn).click();
    }
}
