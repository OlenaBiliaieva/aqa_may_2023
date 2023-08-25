package com.hillel.paterns.pageobjectpatern.sunglashut.adstract;

import com.hillel.paterns.pageobjectpatern.sunglashut.pages.commonfragments.HeaderMenu;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPage {

    private static final Duration TIMEOUT = Duration.ofMillis(10000);

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    private HeaderMenu headerMenu;

    protected AbstractPage(WebDriver driver) {
        this.driver = driver;
        headerMenu = new HeaderMenu(driver);
        driverWait = new WebDriverWait(driver, TIMEOUT);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HeaderMenu getHeaderMenu() {
        return headerMenu;
    }
}
