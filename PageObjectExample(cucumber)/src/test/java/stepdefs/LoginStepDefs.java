package stepdefs;

import com.rayban.flows.LoginFlow;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.junit.jupiter.api.Assertions;

import static com.rayban.utils.Helpers.closePopUp;
import static stepdefs.AbstractSetpDefs.*;

public class LoginStepDefs {

    private LoginFlow loginFlow;

    @Given("I open login page")
    public void i_open_login_page() {
        loginFlow = new LoginFlow(driver);
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22564&langId=-43&storeId=25653");
    }

    @When("I fill login {string}")
    public void i_fill_login(String login) {
        loginFlow.setLogin(login);
    }

    @When("I fill password {string}")
    public void i_fill_password(String pass) {
        loginFlow.setPassword(pass);
    }

    @When("I click submit")
    public void i_click_submit() {
        loginFlow.submit();
    }

    @When("I pass int {int}")
    public void iPassInt(int a) {
        System.out.println(a);
    }


    @Then("I see login field")
    public void i_see_login_field(){
        Assertions.assertTrue(loginFlow.isLoginFieldDisplayed());
    }

    @Then("I see all is good")
    public void i_see_all_is_good() {
        Assertions.assertTrue(true);
    }

}
