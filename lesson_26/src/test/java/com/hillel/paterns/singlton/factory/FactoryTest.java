package com.hillel.paterns.singlton.factory;

import com.hillel.paterns.factory.BrowserName;
import com.hillel.paterns.factory.WebDriverFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class FactoryTest {

    private WebDriver webDriver;

    @BeforeEach()
    public void init() {
        String browserName = System.getProperty("browserName");
        System.out.println("______" + browserName + "_______");
        webDriver = WebDriverFactory.getByName(BrowserName.valueOf(browserName));
    }

    @Test
    public void testCash() {
        webDriver.get("https://www.google.com.ua/");
    }

    @Test
    public void testCash2() {
        webDriver.get("https://www.google.com.ua/");
    }
}
