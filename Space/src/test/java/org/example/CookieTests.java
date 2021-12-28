package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CookieTests extends Xtest {
    @BeforeEach
    public void launchApp(){
        webDriver.get("http://demowebshop.tricentis.com/login");
    }


    @Test
    public void testAddCookie(){
        Cookie cookie = new Cookie("email", "password");
        webDriver.manage().addCookie(cookie);
        assertEquals(cookie.getValue(),webDriver.manage().getCookieNamed(cookie.getName()).getValue());
    }
    @Test
  public void thenCookiesExist() {
        webDriver.navigate().to("http://demowebshop.tricentis.com/customer/info");
    }
    Set<Cookie> cookies = webDriver.manage().getCookies();
}


