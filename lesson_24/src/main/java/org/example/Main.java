package org.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriwer/chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setLogLevel(ChromeDriverLogLevel.INFO);
        WebDriver driver = new ChromeDriver(chromeOptions);

        // driver.get("https://www.sunglasshut.com/uk");
        driver.navigate().to("https://www.sunglasshut.com/uk");
         driver.navigate().back();
         Thread.sleep(3000);
        driver.navigate().forward();
        driver.switchTo().newWindow(WindowType.WINDOW);
        Thread.sleep(3000);
        driver.navigate().to("https://www.selenium.dev/documentation/overview/");
        driver.switchTo().newWindow(WindowType.TAB);

        driver.close();
        driver.quit();

        driver.manage().window().fullscreen();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.manage().window().setSize(new Dimension(1200,1200));
        driver.navigate().to("https://www.sunglasshut.com/uk/myaccount/login?redirect=%2Fmyaccount");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
//        WebElement element = driver.findElement();
//        List<WebElement> elements = driver.findElements();
    }
}