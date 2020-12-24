package tests.Amazon;

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
import pages.Amazon.LoginPage;

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
        driver.get(props.getProperty("urlAmazon"));
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 0, description = "Login in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login with InvalidEmail")
    public void invalidEmailLogin() {
        loginPage.Login(props.getProperty("invalidEmail"), props.getProperty("password"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Login in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login with InvalidEmail")
    public void invalidPassword() {
        loginPage.Login(props.getProperty("email"), props.getProperty("invalidPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Login in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login ")
    public void SuccessfulLogin() {
        loginPage.Login(props.getProperty("email"), props.getProperty("password"));
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
