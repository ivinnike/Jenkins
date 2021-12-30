package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CookieTests extends Xtest {


    @Test
    public void testAddCookie(){
        Cookie cookie = new Cookie("email", "password");
        webDriver.manage().addCookie(cookie);
        assertEquals(cookie.getValue(),webDriver.manage().getCookieNamed(cookie.getName()).getValue());
    }
    @Test
  public void thenCookiesExist() {
        webDriver.navigate().to("http://demowebshop.tricentis.com/customer/addressadd");
        webDriver.findElement(By.xpath("//input[@id='Address_FirstName']")).click();

    }
    Set<Cookie> cookies = webDriver.manage().getCookies();
}


