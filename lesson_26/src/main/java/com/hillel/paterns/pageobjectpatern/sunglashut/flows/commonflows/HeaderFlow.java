package com.hillel.paterns.pageobjectpatern.sunglashut.flows.commonflows;

import com.hillel.paterns.pageobjectpatern.sunglashut.pages.commonfragments.HeaderMenu;
import org.openqa.selenium.WebDriver;

public class HeaderFlow {
    private HeaderMenu headerMenu;

    public HeaderFlow(WebDriver driver) {
        this.headerMenu = new HeaderMenu(driver);
    }

    public void navigateToLogin() {
        headerMenu.getLoginIcon().click();
    }

    public boolean isLoginButtonDisplayed() {
        return headerMenu.getLoginIcon().isDisplayed();
    }
}
