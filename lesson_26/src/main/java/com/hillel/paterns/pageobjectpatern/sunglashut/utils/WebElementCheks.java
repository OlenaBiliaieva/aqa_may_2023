package com.hillel.paterns.pageobjectpatern.sunglashut.utils;

import org.openqa.selenium.WebElement;

public class WebElementCheks {

    public static boolean isElementDisplayed(WebElement webElement) {
        return webElement.isDisplayed();
    }
}
