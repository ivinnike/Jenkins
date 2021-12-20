package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Authorization {
    public static WebElement inputEmail;
    public static WebElement inputPassword;
    public static WebElement clickLoginBtn;
    private static WebElement computer;
    public String email = "iravinnike@gmail.com";
    public String password = "1gnomik0";
    public WebDriver driver;



    public Authorization(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
        WebDriver getWebDriver;
    }

    @FindBy
            (xpath = "//a[@class='hover']")
    private static WebElement computers;
    @FindBy
            (xpath = "//input[@class='email']")
    private static WebElement emailField;

    @FindBy
            (xpath = "//input[@class='password']")
    private static WebElement passwordField;
    @FindBy
            (xpath = "//input[@class='button-1 login-button']")
    private static WebElement Login;


    public static void navigateComputers (){

        computer.click();
    }

    public static void inputEmail(String email) {

        emailField.sendKeys(email);
    }
    public static void inputPassword(String password) {

        passwordField.sendKeys(password);
    }
    public static void clickLoginBtn() {
        Login.click(); }

    void quit() {

    }


}
