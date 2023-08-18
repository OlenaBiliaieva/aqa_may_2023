package com.hillel.paterns.pageobjectpattern.sunglashut.logintest;

import com.hillel.paterns.factory.BrowserName;
import com.hillel.paterns.factory.WebDriverFactory;
import com.hillel.paterns.pageobjectpatern.sunglashut.login.LoginPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest {

    private static LoginPage loginPage;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest(){
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        WebElement loginIcon = driver.findElement(By.xpath("//span[@class='common__icon common__icon--medium common__icon--account-icon']"));
        loginIcon.click();
        loginPage.getEMAIL_FILED().sendKeys("hello");
    }
}
