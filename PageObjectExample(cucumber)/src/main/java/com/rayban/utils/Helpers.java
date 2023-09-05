package com.rayban.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Helpers {
    private static final By closeButtonSelector = By.xpath("//button[@class='rb-modal-close']");

    public static void closePopUp(WebDriver driver) {
        driver.findElement(closeButtonSelector).click();
    }
}
