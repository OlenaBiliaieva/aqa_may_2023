package com.hillel.paterns.pageobjectpatern.sunglashut.flows.registerflow;

import com.hillel.paterns.pageobjectpatern.sunglashut.pages.register.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFlow {

    private RegistrationPage registrationPage;

    public RegistrationFlow(WebDriver driver) {
        this.registrationPage = new RegistrationPage(driver);
    }

    public String getTitlePage(){
        return registrationPage.getPAGE_TILE().getText();
    }
}
