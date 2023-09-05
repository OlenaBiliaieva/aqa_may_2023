package com.rayban.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount extends AbstractPage {

    private static final By SIGN_UP_BUTTON = By.xpath("//a[@class='link _link-underlined']");

    public MyAccount(WebDriver driver) {
        super(driver);
    }

    public WebElement getSignUpButton(){
       return driver.findElement(SIGN_UP_BUTTON);
    }
}
