package com.hillel.paterns.pageobjectpatern.sunglashut.flows.registerflow;

import com.hillel.paterns.pageobjectpatern.sunglashut.flows.abstractflow.AbstractFlow;
import com.hillel.paterns.pageobjectpatern.sunglashut.pages.register.RegistrationPage;
import org.openqa.selenium.WebDriver;

public class RegistrationFlow extends AbstractFlow {

    private RegistrationPage registrationPage;

    public RegistrationFlow(WebDriver driver) {
        super(driver);
        this.registrationPage = new RegistrationPage(driver);
    }

    public String getTitlePage(){
        return registrationPage.getPAGE_TILE().getText();
    }

    public boolean isEmailFieldDisplayed(){
        return registrationPage.getEMAIL_FIELD().isDisplayed();
    }

    public RegistrationPage getRegistrationPage(){
        return registrationPage;
    }

}
