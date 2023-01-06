package TestAutomation.Pages;

import TestAutomation.SeleniumConfig.Driver;
import TestAutomation.glue.Hooks;
import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static TestAutomation.glue.Hooks.wait;
import static Utils.ConfigReader.getPassword2;
import static Utils.ConfigReader.provideremailid;

public class ProviderLoginPage {

    public static WebDriver driver;
    public static By menu_identifier = By.xpath("//div[@class='pl-5 pr-5 pb-5 pt-4 card-body']");
    public static By username = By.xpath("//input[@type='text']");
    public static By password = By.xpath("//input[@type='password']");
    public static By login = By.xpath("//button[@class='ant-btn ant-btn-primary ant-btn-block f_600 d-sm-inline-block']");
    public static By Menu_identifier = By.xpath("//div[@class='ant-col mt-3 ant-col-xs-24']");
    public static By profileimage = By.xpath("//header/div[2]/div[2]/div[3]/span[@class='ant-avatar ant-avatar-lg ant-avatar-circle ant-dropdown-trigger cursor_p d-none d-md-block']");
    public static By logoutbutton = By.xpath("//button[contains(.,'Logout')]");
    public static By logoff = By.xpath("//div[@class='pl-5 pr-5 pb-5 pt-4 card-body']");
    public static By ForgotUsername = By.cssSelector("a[href*='/forgotusernamepassword']");
    public static By GetUsername = By.xpath("//button[contains(.,'Get Username')]");
    public static By Alertmsg = By.xpath("//h5[@class='mb-0']");
    public static By ReturntoLogin = By.cssSelector("a[href*='#']");
    public static By ResetPassword = By.xpath("//button[contains(.,'Reset Password')]");
    public static By NewPassword = By.name("newPassword");
    public static By ConfirmPassword = By.name("confirmPassword");
    public static By SaveButton = By.xpath("//button[contains(.,'Save')]");
    public static By PswdAlert = By.xpath("//div[@class='pl-5 pr-5 pb-5 pt-4 card-body']");
    public static By NewInviteButton = By.xpath("//button[contains(.,'New Invite')]");
    public static By MAEmail = By.name("medicalAssistantEmail");
    public static By SendButton = By.xpath("//button[contains(.,'Send')]");
    public static By InvitePopup = By.xpath("//h5[@class='mb-1']");
    public static By AcceptButton = By.xpath("//button[contains(.,'Accept')]");
    public static By InviteAcceptedPopup = By.xpath("//h5[@class='mb-1']");
    public static By MAprofileButton = By.xpath("//a[@class='p-1 nav-link']");
    public static By Assistants = By.xpath("//a[@class='nav-link text-center']//small[text()='Assistants']");
    public static By MenuAssistants = By.xpath("//div[@class='card-body']");
    public static By clickMA = By.xpath("//h5[@class='mb-2 text-truncate text-capitalize']");
    public static By RevokeButton = By.xpath("//button[contains(.,'Revoke Assistance')]");
    public static By RejectedMenuPopup = By.xpath("//h5[@class='mb-0 text-muted f_600']");
    public static By Dashboard = By.xpath("//a[@class='nav-link text-center']//small[text()='Dashboard']");
    public static By ProInvitePopup = By.xpath("//h5[@class='mb-1']");
    public static By ProviderEmail = By.name("providerEmail");
    public static By ProvidersLink = By.xpath("//a[@class='nav-link text-center']//small[text()='Providers']");
    public static By menuProviders = By.xpath("//div[@class='card-body']");
    public static By clickprovidername = By.xpath("//h5[@class='mb-2 text-truncate text-capitalize']");
    public static By prorejectedmenupopup = By.xpath("//h5[@class='mb-0 text-muted f_600']");




    public ProviderLoginPage() {
        driver = Hooks.driver;
    }

    public static void launch1(){
        Driver driver1class = new Driver();
        Hooks.driver2 = driver1class.Launch("chrome");
        Hooks.wait = new WebDriverWait(Hooks.driver2, 20);
    }

    public static void load() {
        launch1();
        Hooks.driver2.navigate().to("https://testtelehealth.mediguru.com/");

    }

    public static void verify_login_details_displayed() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(menu_identifier));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_username(String value) throws IOException {
        Hooks.driver2.findElement(username).sendKeys(value);
                //sendKeys(provideremailid());
    }

    public static void Enter_password(String value) throws IOException {
        Hooks.driver2.findElement(password).sendKeys(value);
    //.sendKeys(getPassword2());
    }

    public static void Click_login() {
        try {
            Hooks.driver2.findElement(login).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_application_loggedin() {
        try {
            Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(Menu_identifier));
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_profileimage() {
        try {
            Hooks.driver2.findElement(profileimage).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_logout() {
        try {
            Hooks.driver2.findElement(logoutbutton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_logoff() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(logoff));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_ForgotUsername() {
        try {
            Hooks.driver2.findElement(ForgotUsername).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_GetUsername() {
        try {
            Hooks.driver2.findElement(GetUsername).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_AlertMsg() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(Alertmsg));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_ReturntoLogin() {
        try {
            Hooks.driver2.findElement(ReturntoLogin).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_ResetPassword() {
        try {
            Hooks.driver2.findElement(ResetPassword).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_NewPassword(String value) {
        Hooks.driver2.findElement(NewPassword).sendKeys(value);
    }

    public static void Enter_ConfirmPassword(String value) {
        Hooks.driver2.findElement(ConfirmPassword).sendKeys(value);
    }

    public static void Click_SaveButton() {
        try {
            Hooks.driver2.findElement(SaveButton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void verify_PswdAlert() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PswdAlert));
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickNewInviteButton() {
        try {
            Hooks.driver2.findElement(NewInviteButton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_MAemail(String value){
        Hooks.driver2.findElement(MAEmail).sendKeys(value);
    }

    public static void ClickSendButton() {
        try {
            Hooks.driver2.findElement(SendButton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_InvitePopupAlert() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(InvitePopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickAcceptButton() {
        try {
            Hooks.driver2.findElement(AcceptButton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_InviteAcceptedPopup() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(InviteAcceptedPopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickMA_ProfileButton() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(MAprofileButton));
            Hooks.driver2.findElement(MAprofileButton).click();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Click_Assistants() {
        try {
            Hooks.driver2.findElement(Assistants).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifyMenuAssistants() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(MenuAssistants));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickMA_Assistants() {
        try {
            Hooks.driver2.findElement(clickMA).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickRevokeAssistance() {
        try {
            Hooks.driver2.findElement(RevokeButton).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifyRejectedMAPopup() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(RejectedMenuPopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickDashboard() {
        try {
            Hooks.driver2.findElement(Dashboard).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verify_ProInvitePopupAlert() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(ProInvitePopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Enter_Provideremail(String value){
        Hooks.driver2.findElement(ProviderEmail).sendKeys(value);
    }

    public static void Click_ProvidersLink() {
        try {
            Hooks.driver2.findElement(ProvidersLink).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifymenuProviders() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(menuProviders));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ClickProvidersName() {
        try {
            Hooks.driver2.findElement(clickprovidername).click();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void verifyProviders_RejectedPopup() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(prorejectedmenupopup));
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void closeBrowserInstance()
    {
        try {
            if(Hooks.driver2!=null) {
                Hooks.driver2.close();
                Hooks.driver2.quit();
            }
            Hooks.driver2=null;
        }
        catch (Throwable T)
        {
            System.out.println("Browser not closed..!!!");
            T.printStackTrace();
            System.out.println(T.getMessage());
        }
    }


}
