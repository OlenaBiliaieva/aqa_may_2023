package com.hillel.paterns.pageobjectpattern.sunglashut.registertest;

import com.hillel.paterns.factory.BrowserName;
import com.hillel.paterns.factory.WebDriverFactory;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.login.LoginFlow;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.registerflow.RegistrationFlow;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.hillel.paterns.pageobjectpatern.sunglashut.utils.PopUpUtils.closePopUp;

public class RegisterFlowTest {

    private static LoginFlow loginFlow;
    private static RegistrationFlow registrationFlow;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginFlow = new LoginFlow(driver);
        registrationFlow = new RegistrationFlow(driver);
        driver.manage().window().maximize();
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        closePopUp(driver);
    }

    @Test
    public void registerNavigateTest() {
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        loginFlow.login("hello@gmail.com", "");
        String title = registrationFlow.getTitlePage();
        Assertions.assertEquals("Create an account", title);
    }


    @Test
    public void registerFieldsCheck() {
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        Assertions.assertTrue(registrationFlow.isEmailFieldDisplayed());
    }

    @Test
    public void registerFieldsCheck1() {
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        Assertions.assertTrue(registrationFlow.getRegistrationPage().getEMAIL_FIELD().isDisplayed());
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
