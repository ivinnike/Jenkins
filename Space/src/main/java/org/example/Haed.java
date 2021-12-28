package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class Haed {
    private WebDriver webDriver;


    public Haed(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriver = webDriver;
    }
    protected WebDriver getDriver(){
        return this.webDriver;
    }


}
