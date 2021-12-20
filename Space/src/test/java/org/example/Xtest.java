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
    private By email;
    private By password;


    Authorization getAuthorization = new Authorization(driver);


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

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
   // @Test
   // public void navigateComputers(){
      //  new Authorization(getWebDriver()).navigateComputers();
//}




    @Test
  public void authorization() {
        Authorization.inputEmail.findElement(email);
    Authorization.inputPassword.findElement(password);
     Authorization.clickLoginBtn.click();

  }

 }

    //  @Test
  //  void test() {
        //input[@name="customer[email]"]
        //input[@name="customer[password]"]

