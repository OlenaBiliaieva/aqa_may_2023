package com.rayban.flows;

import com.rayban.pages.MyAccount;
import org.openqa.selenium.WebDriver;

public class LoginSignUpFlow extends BaseFlow {

    private MyAccount myAccount;

    public LoginSignUpFlow(WebDriver driver) {
        super(driver);
        myAccount = new MyAccount(driver);
    }

    public void navigateToSignUpPage(){
        basPage.getSignInSignUpButton().click();
        myAccount.getSignUpButton().click();
    }


}
