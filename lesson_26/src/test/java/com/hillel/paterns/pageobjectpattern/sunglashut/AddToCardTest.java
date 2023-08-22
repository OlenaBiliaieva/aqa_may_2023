package com.hillel.paterns.pageobjectpattern.sunglashut;

import com.hillel.paterns.factory.BrowserName;
import com.hillel.paterns.factory.WebDriverFactory;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.login.LoginFlow;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class AddToCardTest {

    private static LoginFlow loginFlow;
    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        driver = WebDriverFactory.getByName(BrowserName.EDGE);
        loginFlow = new LoginFlow(driver);
        driver.manage().window().maximize();
//        loginFlow.login("");
    }
}
