package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Authorization extends Driver{

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

    @FindBy
            (xpath = "//input[@id='OldPassword']")
    private WebElement Oldpassword;

    @FindBy
            (xpath = "//input[@id='NewPassword']")
    private WebElement newpassword;

    @FindBy
            (xpath = "//input[@id='ConfirmNewPassword']")
    private WebElement confirmpassword;

    @FindBy
            (xpath = "//input[@value='Change password']")
    private WebElement changeBtn;


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

    public Authorization setOldpassword(String Oldpassword) {
        this.Oldpassword.sendKeys(Oldpassword);
        return this;
    }
    public Authorization setNewpassword(String newpassword) {
        this.newpassword.sendKeys(newpassword);
        return this;
    }
    public Authorization setConfirmpassword(String confirmpassword) {
        this.confirmpassword.sendKeys(confirmpassword);
        return this;
    }

    public void changeBtn() {

        this.changeBtn.click();
    }


}
