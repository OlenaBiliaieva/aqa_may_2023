package com.singlashut.login;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.stream.Collectors;

public class LoginTest {

    private static WebDriver driver;

    @BeforeAll
    public static void init() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriwer/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.sunglasshut.com/uk");
        WebElement closePopUpButton = driver.findElement(By.xpath("//span[@class='common__icon common__icon--ma-close-black']"));
        closePopUpButton.click();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.sunglasshut.com/uk");
        WebElement loginIcon = driver.findElement(By.xpath("//span[@class='common__icon common__icon--medium common__icon--account-icon']"));
        loginIcon.click();
        Thread.sleep(3000);
        String link = driver.getCurrentUrl();
        Assertions.assertTrue(link.contains("login"));

        WebElement inputLogin = driver.findElement(By.xpath("//input[@id='login-input-email']"));
        inputLogin.sendKeys("mylogin@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='login-input-password']"));
    //    inputPassword.sendKeys("somePassword");
        WebElement loginButton = driver.findElement(By.xpath("//button[@data-element-id='X_X_Login_Login']"));
//        loginButton.click();
        Thread.sleep(5000);
//        inputPassword.click();
        inputPassword.clear();
        loginButton.click();
        WebElement errorPasswordMessege = driver.findElement(By.xpath("//div[@class='eAForm-input-name_error font-sans text-red-berry2 text-tiny font-normal mt-3']/span"));

        Assertions.assertTrue(errorPasswordMessege.isDisplayed());
        Assertions.assertEquals("This field is required", errorPasswordMessege.getText());
    }


    @Test
    public void testProduct() {
        driver.get("https://www.sunglasshut.com/uk/womens-sunglasses?facet=ads_f70083_ntk_cs%253A%2522Ray-Ban%2522");

        List<WebElement> webElement = driver.findElements(By.xpath("//div[@class='flex flex-col']/span"));
        Assertions.assertTrue(webElement.stream().map(WebElement::getText)
                .allMatch(p -> p.contains("£")));
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }
}
