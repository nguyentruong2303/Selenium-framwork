package tests.phpTraval;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.phpTravel.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class LoginTest {
    BasePage basePage;
    LoginPage loginPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlPhpTravel"));
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 0, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login")
    public void invalidEmailLogin() {
        loginPage.Login(props.getProperty("invalidEmail"), props.getProperty("Password"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login")
    public void invalidPasswordLogin() {
        loginPage.Login(props.getProperty("Email"), props.getProperty("invalidPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login")
    public void SuccessfulLogin() {
        loginPage.Login(props.getProperty("Email"), props.getProperty("Password"));
        Assert.assertTrue(true);
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
