package com.hillel.paterns.pageobjectpattern.sunglashut.registertest;

import com.hillel.paterns.factory.BrowserName;
import com.hillel.paterns.factory.WebDriverFactory;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.login.LoginFlow;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.registerflow.RegistrationFlow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
    }

    @Test
    public void registerNavigateTest() {
        driver.get("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        WebElement loginIcon = driver.findElement(By.xpath("//span[@class='common__icon common__icon--ma-close-black']"));
        loginIcon.click();
        loginFlow.login("hello@gmail.com", "");
        loginFlow.navigateToRegistartionPage();
        String title = registrationFlow.getTitlePage();
        Assertions.assertEquals("Create an account", title);
    }

}
