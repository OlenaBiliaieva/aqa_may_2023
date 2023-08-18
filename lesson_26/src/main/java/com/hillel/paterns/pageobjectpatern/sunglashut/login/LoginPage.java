package com.hillel.paterns.pageobjectpatern.sunglashut.login;

import com.hillel.paterns.pageobjectpatern.sunglashut.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private static final By EMAIL_FILED = By.xpath("//input[@id='login-input-email']");
    private static final By PASSWORD_FILED = By.xpath("//input[@id='login-input-password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@data-element-id='X_X_Login_Login']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEMAIL_FILED() {
        return driver.findElement(EMAIL_FILED);
    }

    public WebElement getPASSWORD_FILED() {
        return driver.findElement(PASSWORD_FILED);
    }

    public WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }
}
