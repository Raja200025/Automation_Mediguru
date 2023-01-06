package TestAutomation.Pages;

import TestAutomation.SeleniumConfig.Driver;
import TestAutomation.glue.Hooks;
//import jdk.internal.org.objectweb.asm.Handle;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static Utils.ConfigReader.*;


public class MailinatorPage {

    public static String value;


    public static void launch() {
        Driver driver1class = new Driver();
        Hooks.driver1 = driver1class.Launch("chrome");
        Hooks.wait1 = new WebDriverWait(Hooks.driver1, 60);
    }


    public static void Terminate() {
        Hooks.driver1.close();
    }

    public static void load() {
        launch();
        Hooks.driver1.navigate().to("https://www.mailinator.com/");
    }

    public static By EmailAddress = By.xpath("//input[@type='text']");
    public static By Go_Button = By.xpath("//button[contains(text(),'GO')]");
    public static By menu_identifier = By.xpath("//div[@class='d-flex flex-wrap justify-content-between']");
    public static By mailpage = By.xpath("//td[contains(text(),'Invitation for registration')]");
    public static By invitelink = By.xpath("//td[contains(text(),'support@mediguruonline.co')]");
    public static By registrationlink = By.xpath("//a[contains(text(),'link')]");
    public static By Pin_Identifier = By.xpath("//strong");
    public static By proinvitereg = By.xpath("//span[@class='text-capitalize']//span[contains(text(),'Provider')]");
    public static By Title = By.xpath("//select[@id='title']");
    public static By providertype = By.xpath("//select[@id='providerType']");
    public static By gender = By.xpath("//select[@id='gender']");
    public static By NPI = By.name("npiId");
    public static By SS = By.xpath("//select[@id='speciality']");
    public static By clickmobile = By.xpath("//div[@class='selected-flag']");
    public static By clickindia = By.xpath("//span[contains(text(),'India')]");
    public static By enternumber = By.xpath("//input[@type='tel']");
    public static By ClickDOB = By.xpath("//div[@class='rdt']//input[@type='text']");
    public static By addressone = By.name("addressOne");
    public static By city = By.name("city");
    public static By state = By.name("state");
    public static By country = By.name("country");
    public static By zipcode = By.name("zipCode");
    public static By upload = By.xpath("//input[@id='certificates-upload']");
    public static By button = By.xpath("//span[contains(text(),'Next')]");
    public static By Credentialpage = By.xpath("//a[@class='navbar-brand mr-0']");
    public static By Username = By.name("username");
    public static By Password = By.name("password");
    public static By ConfirmPassword = By.name("confirmPassword");
    public static By Registerbutton = By.xpath("//button[@class='mt-3 float-right btn btn-primary']");
    public static By verifyInviteReg = By.xpath("//span[contains(text(),'Registration Complete')]");
    public static By MAinvitereg = By.xpath("//span[contains(text(),'Medical Assistant')]");


    public static void Enter_mailaddress(String value) throws IOException {
        Hooks.driver1.findElement(EmailAddress).sendKeys(provideremailid());
    }

    public static void Enter_MA_mailaddress(String value) throws IOException {
        Hooks.driver1.findElement(EmailAddress).sendKeys(maemailid());
    }

    public static void Click_GoButton() {
        try {
            Hooks.driver1.findElement(Go_Button).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_mailpage_displayed() {
        try {
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(menu_identifier));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_mailpage() {
        try {
            Hooks.driver1.findElement(mailpage).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click_invitelink() {
        try {
            Hooks.driver1.findElement(invitelink).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void click_registrationlink() {
        try {
            Hooks.driver1.switchTo().frame("html_msg_body");
            Hooks.driver1.findElement(registrationlink).click();
            ArrayList<String> tabs = new ArrayList<>(Hooks.driver1.getWindowHandles());
            Hooks.driver1.switchTo().window(tabs.get(1));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Verify_InviteRegpage() {

        try {
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(proinvitereg));
            Hooks.driver1.findElement(proinvitereg).isDisplayed();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public static void wait_till_Verification_pin_get_readed() {

        try {
            Thread.sleep(2000);
            Hooks.driver1.switchTo().frame("html_msg_body");
            value = Hooks.driver1.findElement(Pin_Identifier).getText();
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(Pin_Identifier));
            System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void Click_DropDown(String drop, String value) throws InterruptedException, IOException {
        if (drop.equals("title")) {
            Select title = new Select(Hooks.driver1.findElement(Title));
            Thread.sleep(3000);
            title.selectByVisibleText(value);
        }
        else if (drop.equals("providertype")) {
            Thread.sleep(3000);
            Select Providertype = new Select(Hooks.driver1.findElement(providertype));
            Providertype.selectByVisibleText(value);
        }
        else if (drop.equals("gender")) {
            Thread.sleep(2000);
            Select Gender = new Select(Hooks.driver1.findElement(gender));
            Gender.selectByVisibleText(value);
        }
        else if (drop.equals("Speciality and Services")) {
            Thread.sleep(4000);
            Select Gender = new Select(Hooks.driver1.findElement(SS));
            Gender.selectByVisibleText(getSpecialityandService());
        }

    }

    public static void EnterNPI (String value){
        Hooks.driver1.findElement(NPI).sendKeys(value);
    }

    public static void Click_Mobilenumber () {
        try {
            Hooks.driver1.findElement(clickmobile).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_India () {
        try {
            Hooks.driver1.findElement(clickindia).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_PhoneNumber (String value){
        Hooks.driver1.findElement(enternumber).sendKeys(value);
    }
    public static void Click_DOB(String value) {
        try {
            Hooks.driver1.findElement(ClickDOB).sendKeys(value);
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Enter_Addressoneform (String value){
        Hooks.driver1.findElement(addressone).sendKeys(value);
    }

    public static void Enter_Cityform (String value){
        Hooks.driver1.findElement(city).sendKeys(value);
    }

    public static void Enter_stateform (String value){
        Hooks.driver1.findElement(state).sendKeys(value);
    }

    public static void Enter_Countryform (String value){
        Hooks.driver1.findElement(country).sendKeys(value);
    }

    public static void Enter_zipcodeform (String value){
        Hooks.driver1.findElement(zipcode).sendKeys(value);
    }
    public static void File_Upload () {
        Hooks.driver1.findElement(upload).sendKeys("D:\\Single Flow\\TestAutomation\\MediguruAutomation_New\\src\\test\\resources\\Architecting.pdf");
    }
    public static void Click_NextButtonform () {
        try {
            Hooks.driver1.findElement(button).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void verifyCredentialspage () {
        try {
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(Credentialpage));
            Hooks.driver1.findElement(Credentialpage).isDisplayed();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Enter_ProUsernameform (String value) throws IOException {
        Hooks.driver1.findElement(Username).sendKeys(getUsername2());
    }

    public static void Enter_MAUsernameform (String value) throws IOException {
        Hooks.driver1.findElement(Username).sendKeys(getUsername());
    }

    public static void Enter_MAPasswordform (String value) throws IOException {
        Hooks.driver1.findElement(Password).sendKeys(getPassword());
    }

    public static void Enter_ProPasswordform (String value) throws IOException {
        Hooks.driver1.findElement(Password).sendKeys(getPassword2());
    }

    public static void Enter_ConfirmPasswordform (String value){
        Hooks.driver1.findElement(ConfirmPassword).sendKeys(value);

    }

    public static void Click_RegisterNowbutton () {
        try {
            Hooks.wait1.until(ExpectedConditions.elementToBeClickable(Registerbutton));
            Hooks.driver1.findElement(Registerbutton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Verify_RegComplete () {
        try {
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(verifyInviteReg));
            Thread.sleep(2000);
            Hooks.driver1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Verify_MAInviteRegpage() {

        try {
            Hooks.wait1.until(ExpectedConditions.visibilityOfElementLocated(MAinvitereg));
            Hooks.driver1.findElement(MAinvitereg).isDisplayed();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }



    public static void close_mailinator() {
        Terminate();
        Hooks.driver1.close();
    }


}
