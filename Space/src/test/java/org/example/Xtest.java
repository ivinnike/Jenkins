package org.example;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Xtest {

    public static WebDriver driver;


    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.get("http://demowebshop.tricentis.com/login");
        driver.manage().window().maximize();

    }

    @BeforeClass
    public static void setup() {

        driver = new ChromeDriver();
    }


    @Test
    void login() {

        WebElement inputEmail = driver.findElement(By.cssSelector("#Email"));
        inputEmail.sendKeys("iravinnike@gmail.com");
        WebElement inputPassword = driver.findElement(By.cssSelector("#Password"));
        inputPassword.sendKeys("1gnomik0");
        WebElement clickLoginBtn = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
        clickLoginBtn.click();
    }
    @Test
    void Search(){
        WebElement search = driver.findElement(By.cssSelector("#small-searchterms"));
        search.sendKeys("Fiction");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.search-box > form > input.button-1.search-box-button"));
        searchButton.click();
    }
    @Test
    void computer(){
        WebElement computerButton = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header-menu > ul.top-menu > li:nth-child(2) > a"));
       computerButton.click();
    }
    void quit() {

    }
}
