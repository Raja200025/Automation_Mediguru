package TestAutomation.glue;

import TestAutomation.SeleniumConfig.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static TestAutomation.Pages.ProviderLoginPage.closeBrowserInstance;

public class Hooks {

    public static WebDriver driver;
    public static WebDriver driver1;
    public static WebDriver driver2;

    public static WebDriverWait wait;
    public static WebDriverWait wait1;

    public static String orgnameH;

    public static String setOrgName(String value) throws IOException {

        orgnameH = value;
        System.out.println(orgnameH);
        return orgnameH;

    }

    public static String usernameh;
    public static String setUsername(String value) throws IOException {
        usernameh = value;
        System.out.println(usernameh);
        return usernameh;
    }


    public static String usernameh1;
    public static String setUsername1(String value) throws IOException {
        usernameh1 = value;
        System.out.println(usernameh1);
        return usernameh1;
    }

    public static String patientfirstname1;
    public static String setpatientname1(String value){
        patientfirstname1=value;
        return patientfirstname1;
    }
    public static String patientlastname1;
    public static String Setlastname1(String value){
        patientlastname1=value;
        return patientlastname1;

    }



    @Before
    public WebDriver Initialize(){
        Driver driverclass = new Driver();
        driver = driverclass.Launch("chrome");
        wait = new WebDriverWait(driver,20);
        return driver;
    }

    @After
    public void Terminate(Scenario scenario){
        if(scenario.isFailed())
        {

        }
        closeBrowserInstance();
    }

}
