package com.hillel.paterns.pageobjectpatern.sunglashut.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaiterManager {

    private static final Duration TIMEOUT = Duration.ofMillis(10000);

    public static WebElement waitUntilElementIsVisible(WebDriver driver, By locator) {
        return new WebDriverWait(driver, TIMEOUT).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitUntilElementIsVisibleFluent(WebDriver driver, By locator) {
        return
                new FluentWait<>(driver)
                        .withTimeout(Duration.ofSeconds(5))
                        .pollingEvery(Duration.ofSeconds(6))
                        .ignoring(TimeoutException.class)
                        .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
