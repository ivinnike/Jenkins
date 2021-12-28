package org.example;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.util.Set;

public class Authorization extends Haed {

    @FindBy
            (xpath = "//input[@class='email']")
    private WebElement email;

    @FindBy
            (xpath = "//input[@class='password']")
    private WebElement password;
    @FindBy
            (xpath = "//input[@class='button-1 login-button']")
    private WebElement clickLoginBtn;

    @FindBy
            (xpath = "//input[@id='small-searchterms']")
    private WebElement search;

    @FindBy
            (xpath = "//input[@class='button-1 search-box-button']")
    private WebElement searchButton;


    public Authorization(WebDriver webDriver) {
        super(webDriver);
    }


    public Authorization setEmail(String email) {
        this.email.sendKeys(email);
        return this;
    }

    public Authorization setPassword(String password) {
        this.password.sendKeys(password);
        return this;
    }

    public void clickLoginBtn() {
        this.clickLoginBtn.click();
    }

    public void searchButton() {
        this.searchButton.click();
    }

    public Authorization search(String search) {
        this.search.sendKeys(search);
        return this;
    }

}
