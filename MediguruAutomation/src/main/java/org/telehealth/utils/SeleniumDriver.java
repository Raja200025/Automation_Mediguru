package org.telehealth.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;

    //initialize webdriver
    private static WebDriver driver;

    //initialize timeouts
    private static WebDriverWait waitDriver;


    public SeleniumDriver(String Browser) {

        switch (Browser.toUpperCase()) {
            case "IE":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        waitDriver = new WebDriverWait(driver, ConstantVariables.DriverWaitTIMEOUT);
        driver.manage().timeouts().implicitlyWait(ConstantVariables.TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(ConstantVariables.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

        String window = driver.getWindowHandle();
        System.out.println("Window ->" + window);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openPage(String url) {
        System.out.println(url);
        System.out.println(driver);
        driver.get(url);
    }

    public static void setUpDriver(String browser) {
        if (seleniumDriver == null)
            seleniumDriver = new SeleniumDriver(browser);
    }

    public static WebDriverWait getDriverWait() {
        return waitDriver;
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }
}
