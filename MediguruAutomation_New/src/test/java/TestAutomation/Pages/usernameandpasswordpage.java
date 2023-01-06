package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static Utils.ConfigReader.*;

public class usernameandpasswordpage {

    public static By email = By.name("email");
    public static By enter_verification_pin = By.xpath("//input[@class='form-control otp-box ']");
    public static By Menu_Identifier = By.xpath("//div[@class='text-center']");
    public static By firstname = By.name("firstName");
    public static By lastname = By.name("lastName");
    public static By clickmobile = By.xpath("//div[@class='selected-flag']");
    public static By clickindia = By.xpath("//span[contains(.,'India')]");
    public static By enternumber = By.xpath("//input[@type='tel']");
    public static By upload = By.xpath("//input[@id='certificates-upload']");

    public static void Enter_Email(String value) throws IOException {
        Hooks.driver2.findElement(email).sendKeys(patientemailid());
    }

    public static void enter_Verification_pin(String value) {

        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(enter_verification_pin));
        String i = value.substring(value.length() - 6);
        Hooks.driver2.findElement(enter_verification_pin).click();
        Hooks.driver2.findElement(enter_verification_pin).sendKeys(i);
    }

    public static void verify_Thirdpage() {
        try {
            Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(Menu_Identifier));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_firstname(String value) throws IOException {
        Hooks.driver2.findElement(firstname).sendKeys(value);
    }

    public static void Enter_firstnames() throws IOException {
        Hooks.driver2.findElement(firstname).sendKeys(patientname());
    }

    public static void Enter_lastname(String value) throws IOException {
        Hooks.driver2.findElement(lastname).sendKeys(patientlastname());
    }

    public static void Click_mobilenumber() {
        try {
            Hooks.driver2.findElement(clickmobile).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_India() {
        try {
            Hooks.driver2.findElement(clickindia).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_phonenumber(String value) throws IOException {
        Hooks.driver2.findElement(enternumber).sendKeys(patientno());
    }

    public static void Upload_File() {
        Hooks.driver2.findElement(upload).sendKeys("C:\\Users\\Spare User-4\\Desktop\\Architecting.pdf");

    }

}

