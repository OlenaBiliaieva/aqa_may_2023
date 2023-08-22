package com.hillel.paterns.pageobjectpatern.sunglashut.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PopUpUtils {

    private static final By COUNTRYPOPUP = By.xpath("//span[@class='common__icon common__icon--ma-close-black']");

    private PopUpUtils() {
    }


    public static void closePopUp(WebDriver driver) {
        driver.findElement(COUNTRYPOPUP).click();
    }
}
