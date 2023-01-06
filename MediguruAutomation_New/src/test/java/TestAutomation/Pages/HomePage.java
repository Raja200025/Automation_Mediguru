package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static Utils.ConfigReader.*;

public class HomePage {

    public static By loadingIcon = By.cssSelector("div.spinner-grow");
    //Invite, Add Location, Add speciality, Add canned message.
    public static By ClickBtn(String BtnName) { return By.xpath("//button//span[text()='" + BtnName + "']"); }
    public static By ClickManagementBtn(String BtnManagement){ return By.xpath("//li[@class='nav-icon' and @title='" +BtnManagement+ "']");}

    public static By Name = By.xpath("//input[@id='name']");  //Add org->Org name, Add speciality,Add Location
    public static By description = By.xpath("//textarea[@id='description']");
    public static By DetailedMsg = By.xpath("//textarea[@id='message']");

    public static By firstname = By.xpath("//input[@id='firstName']");
    public static By lastname = By.xpath("//input[@id='lastName']");
    public static By emailaddress = By.xpath("//input[@id='email']");
    //public static By Superadmin = By.xpath("// div [@class='py-2 card-body']");
    public static By Superadmin = By.xpath("//span[text()='Invite List']");
    //span[text()='Invite List']
    //AddOrg->"create"&Speciality,Location->"Save"
    public static By inviteClickBtn = By.xpath("//button[@type='submit']");

    public static By title = By.xpath("//input[@id='title']");
    public static By notifyMessage = By.cssSelector("div.notification-message");

    public static void Org(String value) throws IOException {
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.driver.findElement(Name).sendKeys(OrgName());
    }

    public static  void Superadmindashboard(){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(Superadmin));
    }

    public static void Pro_Enter_mailaddress(String arg0) throws IOException {
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(emailaddress));
        Hooks.driver.findElement(emailaddress).sendKeys(provideremailid());
    }

    public static void MA_Enter_mailaddress(String value) throws IOException {
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(emailaddress));
        Hooks.driver.findElement(emailaddress).sendKeys(maemailid());
    }
    public static void selectOrg() throws IOException {
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(By.id("organization")));
        Select dropdown = new Select(Hooks.driver.findElement(By.id("organization")));
        dropdown.selectByVisibleText(Hooks.orgnameH);
    }

    public static void selectRole(String role) {
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(By.id("invitedRole")));
        Select dropdown1 = new Select(Hooks.driver.findElement(By.id("invitedRole")));
        dropdown1.selectByVisibleText(role);
    }


    public static void selectLocation(String drop, String value) {
        if (drop.equals("Location")) {
            Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clinicLocation")));
            Select title = new Select(Hooks.driver.findElement(By.id("clinicLocation")));
            title.selectByVisibleText("Seattle");
        }
        else if(drop.equals("Role")){
            Hooks.wait.until(ExpectedConditions.elementToBeClickable(By.id("invitedRole")));
            Select dropdown1 = new Select(Hooks.driver.findElement(By.id("invitedRole")));
            dropdown1.selectByVisibleText(value);
        }

    }

    public static void submitBtn() {
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(inviteClickBtn));
        Hooks.driver.findElement(inviteClickBtn).click();
        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(notifyMessage));

    }

    public static void NavManagementBtn(String ManageBtn){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(ClickManagementBtn(ManageBtn)));
        Hooks.driver.findElement(ClickManagementBtn(ManageBtn)).click();
        // Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(loadingIcon));
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
    }

    public static void ClickAddBtn(String AddOrgBtn) {
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.wait.until(ExpectedConditions.presenceOfElementLocated(ClickBtn(AddOrgBtn)));
        Hooks.driver.findElement(ClickBtn(AddOrgBtn)).click();
    }

    public static void PreferredLanguage(String language) {

        Hooks.wait.until(ExpectedConditions.elementToBeClickable(By.id("languageCode")));
        Select dropdown3 = new Select(Hooks.driver.findElement(By.id("languageCode")));
        dropdown3.selectByVisibleText(language);
    }

    public static void selectCategory(String orgname) {
        Hooks.wait.until(ExpectedConditions.elementToBeClickable(By.id("category")));
        Select dropdown = new Select(Hooks.driver.findElement(By.id("category")));
        dropdown.selectByVisibleText(orgname);
    }

    public static void SelectSpecialityTo(String associate) {
        Hooks.driver.findElement(By.xpath("//input[@placeholder='Select Speciality']")).click();
        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), '" + associate + "')]")));
        Hooks.driver.findElement(By.xpath("//a[contains(text(), '" + associate + "')]")).click();
    }

    public static void roleAssociateTo(String roleassociate) {
        Hooks.driver.findElement(By.xpath("//input[@placeholder='Select Associate']")).click();
        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), '" + roleassociate + "')]")));
        Hooks.driver.findElement(By.xpath("//a[contains(text(), '" + roleassociate + "')]")).click();
    }

    public static void locationAssociateTo(String selectlocation) {
        Hooks.driver.findElement(By.xpath("//input[@placeholder='Select Location']")).click();
        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), '" + selectlocation + "')]")));
        Hooks.driver.findElement(By.xpath("//a[contains(text(), '" + selectlocation + "')]")).click();
    }
}

