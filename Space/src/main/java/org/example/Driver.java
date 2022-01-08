package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public abstract class Driver{
    public WebDriver webDriver;

    public Driver(WebDriver webDriver){
        PageFactory.initElements(webDriver,this);
        this.webDriver = webDriver;
    }
    protected WebDriver getDriver(){

        return this.webDriver;
    }


}
