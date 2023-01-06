package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static TestAutomation.glue.Hooks.*;
import static Utils.ConfigReader.*;

public class AppointmentPage {

    public static WebDriver driver;
    public static By NewAppointment = By.xpath("//body/div[@id='app']/section[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]");
    public static By Newcheckin = By.xpath("//body/div[@id='app']/section[1]/section[1]/main[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]");
    public static By Time = By.xpath("//div[@class='form-group']//label[contains(.,'Time')]/following-sibling::div//div//input");
    public static By Reason = By.name("reasonForVisit");
    public static By Create = By.xpath("//button[contains(.,'Create')]");
    //    public static By AppointmentPopup = By.xpath("//h5[@class='mb-1']");
    public static By Date_of_Birth = By.xpath("//div[@class='form-group']//label[contains(.,'Date')]/following-sibling::div//div//input");
    public static By Appointmenttype = By.xpath("//div[@name='appointmentType']");
    public static By appointmenttypes = By.xpath("//div[@aria-label='General']");
    public static By notificationMessage = By.cssSelector("div.notification-message");
    public static By Pick_a_slot=By.xpath("//button[@class='m-2 btn btn-primary btn-sm'][1]");
    public static By Schedule = By.xpath ("//li[@class='nav-icon' and @title='Schedule']");
    public static String Click_to_open = "//div[contains(text(),'%value%')]";
    public static By Appointment_details = By.xpath("//span[contains(text(),'Session')]");
    public static By Click_on_Resend= By.xpath("//Span[contains(.,'Re-send Confirmation')]");
    public static By Cancel = By.xpath("//Span[contains(.,'Cancel')]");
    public static By Verify_the_pop_up_screen =By.xpath("//Span[@class='f_600']");
    public static By Confirmation_button = By.xpath("//button[@class='btn btn-primary']");
    public static By Dashboard =By.xpath("//li[@class='nav-icon' and @title='Dashboard']");
    public static By loadingIcon = By.cssSelector("div.spinner-grow");
    public static By Duration = By.id("duration");

/*
    public AppointmentPage() {
        driver = Hooks.driver;
    }
*/

    public static void Click_NewAppointment() {
        try {
            Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
            Hooks.driver2.findElement(NewAppointment).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Click_NewCheckin() {
        try {
            Hooks.driver2.findElement(Newcheckin).click();
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Time(String value) {
        Hooks.driver2.findElement(Time).sendKeys(value);
    }

    public static void Enter_Reason(String value) throws IOException {
        Hooks.driver2.findElement(Reason).sendKeys(vreason());
    }

    public static void Click_Create() {
        try {
            Hooks.driver2.findElement(Create).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_AppoitmentSuccess() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Date_of_Birth(String value) {
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        Hooks.driver2.findElement(Date_of_Birth).sendKeys(dtf.format(now));

    }

    public static void Appoinmentdropdown(String drop, String value) {
        if (drop.equals("appointmentType")) {

            Select title = new Select(Hooks.driver2.findElement(Appointmenttype));
            title.selectByVisibleText("General");
            Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        }

    }
    public static void Appointmenttype(String value) throws InterruptedException {
        WebElement element = driver2.findElement(Appointmenttype);
        JavascriptExecutor executor = (JavascriptExecutor)driver2;
        executor.executeScript("arguments[0].click();", element);
        Thread.sleep(5000);
         //Hooks.driver2.findElement(Appointmenttype).click();
         System.out.println(value);

         Hooks.driver2.findElement(appointmenttypes).sendKeys(value);

    }
    public static void Durationdropdown(String drop) {

            Select title = new Select(Hooks.driver2.findElement(Duration));
            title.selectByValue("10");
        }



    public static void pick_the_slot(){
        try{
            Hooks.driver2.findElement(Pick_a_slot).click();
            Thread.sleep(3000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void Click_the_schedule(){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.driver2.findElement(Schedule).click();
    }

    public static void select_the_appointment(){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        String patientnames = patientfirstname1.concat(" ").concat(patientlastname1);
        System.out.println(patientnames);
        String tab_val=Click_to_open.replace("%value%",patientnames);
        Hooks.driver2.findElement(By.xpath(tab_val)).click();
    }

    public static void Appointment_details_Page(){
        Hooks.driver2.findElement(Appointment_details);
    }

    public static void Click_the_resendconfirmation(){
        Hooks.driver2.findElement(Click_on_Resend).click();
    }

    public static void Resend_confirmation_message(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage));
    }

    public static void Click_the_cancelbutton(){
        Hooks.driver2.findElement(Cancel).click();
    }

    public static void Verify_pop_up_screen(){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.driver2.findElement(Verify_the_pop_up_screen);
    }

    public static void Click_the_yes_button(){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.driver2.findElement(Confirmation_button).click();
    }

    public static void Verify_the_success_message(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(notificationMessage));
    }

    public static void navigate_to_homepage(){
        Hooks.driver2.findElement(Dashboard).click();
    }

}
