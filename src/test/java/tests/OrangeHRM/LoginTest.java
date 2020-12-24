package tests.OrangeHRM;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.LoginPage;

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
        driver.get(props.getProperty("urlOrangeHRM"));
        loginPage = new LoginPage(driver);
    }

    @Test(priority = 0, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Login in Website")
    public void invalidUsername() {
        loginPage.Login(props.getProperty("invalidUsername"), props.getProperty("Password"));
        Assert.assertTrue(false);
    }
    @Test(priority = 1, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Login in Website")
    public void invalidUsername1() {
        loginPage.Login("", props.getProperty("Password"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Login in Website")
    public void invalidPassword() {
        loginPage.Login(props.getProperty("Username"), props.getProperty("invalidPassword"));
        Assert.assertTrue(false);
    }
    @Test(priority = 3, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Login in Website")
    public void invalidPassword1() {
        loginPage.Login(props.getProperty("Username"), "");
        Assert.assertTrue(false);
    }
    @Test(priority = 4, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Login in Website")
    public void SuccessfulLogin() {
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        Assert.assertTrue(true);
    }

}
