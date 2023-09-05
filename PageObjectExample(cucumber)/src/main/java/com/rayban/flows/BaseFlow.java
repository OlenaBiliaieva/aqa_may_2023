package com.rayban.flows;

import com.rayban.pages.BasPage;
import org.openqa.selenium.WebDriver;

public class BaseFlow {

    protected WebDriver driver;
    protected BasPage basPage;

    public BaseFlow(WebDriver driver) {
        this.driver = driver;
        basPage = new BasPage(driver);
    }

    public BasPage getBasPage(){
        return basPage;
    }
}
