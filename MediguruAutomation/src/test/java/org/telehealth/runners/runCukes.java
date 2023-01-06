package org.telehealth.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"html:target/cucumber-html-report1/report.html", "json:target/jsonReports/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        glue = "org.telehealth.steps")
@RunWith(Cucumber.class)
public class runCukes {
}
