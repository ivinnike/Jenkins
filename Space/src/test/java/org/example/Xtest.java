package org.example;

import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;

import javax.swing.*;

class Xtest {

    public static WebDriver driver;
    private static Object Authorization;


    //Authorization getAuthorization = new Authorization();


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
        Authorization = new Authorization(driver);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    @Test
    public void navigateComputers(){
        new Authorization(getWebDriver()).navigateComputers();
}




    @Test
  public void authorization() {
        Authorization.inputEmail.getProperty(email);
    Authorization.inputPassword.findElement(password);
     Authorization.clickLoginBtn.click();

  }

 }

    //  @Test
  //  void test() {
        //input[@name="customer[email]"]
        //input[@name="customer[password]"]

