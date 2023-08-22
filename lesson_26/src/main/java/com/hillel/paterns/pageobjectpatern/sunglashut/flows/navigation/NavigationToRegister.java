package com.hillel.paterns.pageobjectpatern.sunglashut.flows.navigation;

import com.hillel.paterns.pageobjectpatern.sunglashut.flows.login.LoginFlow;
import com.hillel.paterns.pageobjectpatern.sunglashut.flows.registerflow.RegistrationFlow;
import org.openqa.selenium.WebDriver;

public class NavigationToRegister {

    private LoginFlow loginFlow;
    private RegistrationFlow registrationFlow;

    public NavigationToRegister(WebDriver driver) {
        this.registrationFlow = new RegistrationFlow(driver);
        this.loginFlow = new LoginFlow(driver);
    }

    public void navigateToRegisterPageFromLoginPage() {
        loginFlow.navigateToRegistartionPage();
    }
}
