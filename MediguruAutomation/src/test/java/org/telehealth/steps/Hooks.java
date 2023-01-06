package org.telehealth.steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.telehealth.utils.ConstantVariables;
import org.telehealth.utils.SeleniumDriver;

public class Hooks {

    @Before
    public void setUp() {
        SeleniumDriver.setUpDriver(ConstantVariables.Browser);
        SeleniumDriver.openPage(ConstantVariables.url);
    }

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = SeleniumDriver.getDriver();
        if (scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshotBytes, "image/png", "screenshot");
        }
        SeleniumDriver.tearDown();
    }
}
