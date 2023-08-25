package com.hillel.paterns.pageobjectpattern.sunglashut.logintest;

import com.hillel.paterns.factory.BrowserName;
import com.hillel.paterns.factory.WebDriverFactory;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.login.LoginFlow;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import static com.hillel.paterns.pageobjectpatern.sunglashut.utils.PopUpUtils.closePopUp;

public class LoginFlowTest {

    private static LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        closePopUp(driver);
    }

    @Test
    public void loginNavigationTest() {
        driver.get("https://www.sunglasshut.com/uk");
        loginFlow.getHeaderFlow().navigateToLogin();
        Assertions.assertTrue(driver.getCurrentUrl().contains("myaccount"));
    }

    @Test
    public void loginTest() {
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        loginFlow.fillEmail("hello@gamil.com");
        loginFlow.submit();
        String errorText = loginFlow.getPaswordErrorText();
        Assertions.assertEquals(errorText, "This field is required");
    }

    @Test
    public void loginTest2() {
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        loginFlow.login("hello@gmail.com", "");
        String errorText = loginFlow.getPaswordErrorText();
        Assertions.assertEquals(errorText, "This field is required");
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }
}
