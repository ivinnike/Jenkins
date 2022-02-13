package org.example;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

public class CookieTests extends SiteTest {
    @Test
    @Epic("Вход")
    public void testAddCookie(){
        Cookie cookie = new Cookie("email", "password");
        webDriver.manage().addCookie(cookie);
        Assertions.assertEquals(cookie.getValue(),webDriver.manage().getCookieNamed(cookie.getName()).getValue());
    }
    @Test
    @Epic("Смена параля")
    public void thenCookiesExist() {
        webDriver.navigate().to("http://demowebshop.tricentis.com/customer/changepassword");
        webDriver.findElement(By.xpath("//input[@id='OldPassword']")).click();
        new Authorization(getWebDriver()).setOldpassword("test11").setNewpassword("test10").setConfirmpassword("test10").changeBtn();
        Assertions.assertEquals("Password was changed", webDriver.findElement(By.xpath("//div[@class='result']")).getText());
    }
    @AfterAll
    static void exit() {

        webDriver.quit();
    }

}



