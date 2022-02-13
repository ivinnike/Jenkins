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
        new Authorization(getWebDriver()).setEmail("iravinnike@gmail.com").setPassword("test11").clickLoginBtn();
    }
}