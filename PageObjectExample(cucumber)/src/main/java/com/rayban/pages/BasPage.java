package com.rayban.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasPage extends AbstractPage {

    private static final By SIGN_IN_SIGN_UP_BUTTON = By.cssSelector(".user-icon");

    public BasPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignInSignUpButton() {
        return driver.findElement(SIGN_IN_SIGN_UP_BUTTON);
    }
}
