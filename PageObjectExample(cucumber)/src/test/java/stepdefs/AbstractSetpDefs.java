package stepdefs;

import com.rayban.driver.WebDriverUtils;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

import static com.rayban.utils.Helpers.closePopUp;

public class AbstractSetpDefs {

    public static WebDriver driver;

    @BeforeAll
    public static void initialization() {
        driver = WebDriverUtils.getDriver("edge");
        driver.manage().window().maximize();
        driver.get("https://www.ray-ban.com/LoginDisplayView?catalogId=22564&langId=-43&storeId=25653");
        closePopUp(driver);
    }


    @AfterAll
    public static void tearDown(){
        driver.quit();
    }
}
