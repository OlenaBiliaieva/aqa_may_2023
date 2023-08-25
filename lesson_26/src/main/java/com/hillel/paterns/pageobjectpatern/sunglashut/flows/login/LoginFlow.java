package com.hillel.paterns.pageobjectpatern.sunglashut.flows.login;

import com.hillel.paterns.pageobjectpatern.sunglashut.flows.abstractflow.AbstractFlow;
import com.hillel.paterns.pageobjectpatern.sunglashut.pages.login.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow extends AbstractFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver webDriver) {
        super(webDriver);
        this.loginPage = new LoginPage(webDriver);
    }

    public void fillEmail(String email) {
        loginPage.getEMAIL_FILED().clear();
        loginPage.getEMAIL_FILED().sendKeys(email);
    }

    public void fillPasword(String password) {
        loginPage.getPASSWORD_FILED().sendKeys(password);
    }

    public void submit() {
        loginPage.getLOGIN_BUTTON().click();
    }

    public String getPaswordErrorText() {
        return loginPage.getPASSWORD_ERROR().getText();
    }

    public void login(String email, String password) {
        fillEmail(email);
        fillPasword(password);
        submit();
    }
}
