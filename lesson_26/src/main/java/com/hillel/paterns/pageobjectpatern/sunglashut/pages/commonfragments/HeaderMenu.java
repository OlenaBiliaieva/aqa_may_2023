package com.hillel.paterns.pageobjectpatern.sunglashut.pages.commonfragments;

import com.hillel.paterns.pageobjectpatern.sunglashut.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HeaderMenu extends AbstractPage {
    private static final By LOGIN_ICON = By.xpath("//span[@title='My Account User Icon']");

    public HeaderMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginIcon() {
        return driver.findElement(LOGIN_ICON);
    }

}
