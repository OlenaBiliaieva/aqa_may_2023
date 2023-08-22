package com.hillel.paterns.pageobjectpatern.sunglashut.pages.register;

import com.hillel.paterns.pageobjectpatern.sunglashut.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends AbstractPage {

    private static final By PAGE_TILE = By.xpath("//div[@class='sgh-container-join']/div[1]");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPAGE_TILE() {
        return driver.findElement(PAGE_TILE);
    }

}
