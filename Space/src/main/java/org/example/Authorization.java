package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authorization {

    public WebDriver driver;

    public Authorization(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        WebDriver getWebDriver;
    }

    @FindBy
            (xpath = "//input[@class='email']")
    static WebElement inputEmail;

    @FindBy
            (xpath = "//input[@class='password']")
     static WebElement inputPassword;

    @FindBy
            (xpath = "//input[@class='button-1 login-button']")
    static WebElement clickLoginBtn;

    @FindBy
            (xpath = "//input[@id='small-searchterms']")
    static WebElement search;

    @FindBy
            (xpath = "//input[@class='button-1 search-box-button']")
    static WebElement searchButton;

   @FindBy
       (xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a")
  static WebElement computerButton;


    }

