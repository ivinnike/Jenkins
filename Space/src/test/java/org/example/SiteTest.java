package org.example;

import io.qameta.allure.Epic;
import org.junit.BeforeClass;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.AfterClass;

import javax.swing.*;
import java.io.*;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertThat;
import static org.testng.AssertJUnit.assertTrue;

public class SiteTest {

    static WebDriver webDriver;
   public Screenshot MyUtils;

    public WebDriver getWebDriver() {

        return webDriver;
    }

    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--icognito");
        options.addArguments("maximized");
        options.setPageLoadTimeout(Duration.ofSeconds(10));
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    @Epic("Поиск")

    void search() {
        webDriver.get("http://demowebshop.tricentis.com/login");
        new Authorization(getWebDriver()).search("Digital SLR Camera 12.2 Mpixel").searchButton();
        Assertions.assertTrue(webDriver.findElement(By.xpath("//h2[@class='product-title']")).getText().equals("Digital SLR Camera 12.2 Mpixel"));
    }
    @Test
    void login() {
        webDriver.get("http://demowebshop.tricentis.com/login");
        new Authorization(getWebDriver()).setEmail("iravinnike@gmail.com").setPassword("test10").clickLoginBtn();
    }
}









  /* @Test
    void add() {
   */
      /*  WebElement webElement = webDriver.findElement(By.xpath("//input[@id='Address_FirstName']"));
        webElement.click();
        webDriver.findElement(By.xpath("//input[@id='Address_FirstName']")).click();
        Actions actions = new Actions(webDriver);
        actions.sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_FirstName']")), "Kotikov").click(webElement)
                .sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_LastName']")), "Vasy").click()
                .sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_Email']")), "kot@y.dog").click()
                .sendKeys(webDriver.findElement(By.xpath("//select[@data-val-number='The field Country must be a number.']")), "Russia").click()
                .sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_City']")), "Moscow").click()
                .sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_Address1']")), "yl.Mays 15-1-30").click()
                .sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_ZipPostalCode']")), "117570").click()
                .sendKeys(webDriver.findElement(By.xpath("//input[@id='Address_PhoneNumber']")), "+7900789-09-00").sendKeys()
                .sendKeys(webDriver.findElement(By.xpath("//input[@value='Save']"))).click().build().perform();*/


      /* @AfterEach
        void exit () {
        LogEntries browserLogs = webDriver.manage().logs().get(LogType.BROWSER);
        List<LogEntry> allLogRows = browserLogs.getAll();
        if (allLogRows.size() > 0 ) {
        }
        webDriver.quit();
    }*/






//  WebElement inputEmail = webDriver.findElement(By.cssSelector("#Email"));
//  inputEmail.sendKeys("iravinnike@gmail.com");
//  WebElement inputPassword = webDriver.findElement(By.cssSelector("#Password"));
//  inputPassword.sendKeys("1gnomik0");
//  WebElement clickLoginBtn = webDriver.findElement(By.xpath("//input[@class='button-1 login-button']"));
//   clickLoginBtn.click();