package com.hillel.paterns.pageobjectpatern.sunglashut.pages.login;

import com.hillel.paterns.pageobjectpatern.sunglashut.adstract.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.hillel.paterns.pageobjectpatern.sunglashut.utils.WaiterManager.waitUntilElementIsVisible;

public class LoginPage extends AbstractPage {

    private static final By EMAIL_FILED = By.xpath("//input[@id='login-input-email']");
    private static final By PASSWORD_FILED = By.xpath("//input[@id='login-input-password']");
    private static final By LOGIN_BUTTON = By.xpath("//button[@data-element-id='X_X_Login_Login']");
    private static final By PASSWORD_ERROR = By.xpath("//div[@class='flex flex-col field mb-6']//span");
    private static final By REGISTER_BUTTON = By.xpath("//div[@class='flex justify-center mt-4']//button[@class='primary']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEMAIL_FILED() {
        return driverWait.until(ExpectedConditions.visibilityOfElementLocated(EMAIL_FILED));
    }

    public WebElement getPASSWORD_FILED() {
        return waitUntilElementIsVisible(driver, PASSWORD_FILED);
    }

    public WebElement getLOGIN_BUTTON() {
        return driver.findElement(LOGIN_BUTTON);
    }

    public WebElement getPASSWORD_ERROR() {
        return driver.findElement(PASSWORD_ERROR);
    }

    public WebElement getREGISTER_BUTTON() {
        return driver.findElement(REGISTER_BUTTON);
    }
}
