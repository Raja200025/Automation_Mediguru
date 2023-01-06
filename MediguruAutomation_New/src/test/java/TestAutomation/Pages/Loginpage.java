package TestAutomation.Pages;

import TestAutomation.glue.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

import static Utils.ConfigReader.*;

public class Loginpage {

    public static By username = By.xpath("//input[@name='username']");
    public static By password = By.xpath("//input[@name='password']");
    public static By loadingIcon = By.cssSelector("div.spinner-grow");

    public static By imageClick = By.xpath("//img[@class='user-image shadow cursor_p']");
    public static By image1 = By.xpath("//*[@id=\"app\"]/section/nav/div[2]/ul/li[6]/a/div/div");
    public static By LogoutBtn = By.xpath("//*[local-name()='svg' and @data-icon='sign-out-alt']");

    public static void send(String val, By path) {
        try {
            WebElement element = Hooks.driver.findElement(path);
            element.clear();
            element.sendKeys(val);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendUsername(String value) throws IOException {
        Hooks.driver.findElement(username).sendKeys(getSuperAdminUserName());
    }

    public static void sendPassword(String value) throws IOException {
        Hooks.driver.findElement(password).sendKeys(getSuperAdminPassword());
    }

    public static void clickbtn(String btn) {

        Hooks.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='" + btn + "']")));
        Hooks.driver.findElement(By.xpath("//button[@type='" + btn + "']")).click();
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));

    }

    public static void providerLoginVerify(){
        Hooks.wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        Hooks.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class= 'mt-3 col-12']")));
        Assert.assertTrue("yes", Hooks.driver.findElement(By.xpath("//div[@class= 'mt-3 col-12']")).isDisplayed());
    }

    public static void Img(){
        try {
            Hooks.driver.findElement(image1).click(); // imageclick

            Hooks.wait.until(ExpectedConditions.elementToBeClickable(LogoutBtn));
            Hooks.driver.findElement(LogoutBtn).click();

            Hooks.driver.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
