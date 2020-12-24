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
import pages.Amazon.RegisterPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class RegisterTest {
    RegisterPage registerPage;
    Properties props;
    BasePage basePage;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlAmazon"));
        registerPage = new RegisterPage(driver);
    }
    @Test(priority = 0,description = "Register in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify Register")
    public void InvalidYourNameRegister() {
        registerPage.Register(props.getProperty("invalidYourName"), props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("rePassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1,description = "Register in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register")
    public void InvalidEmailRegister() {
        registerPage.Register(props.getProperty("yourName"), props.getProperty("invalidEmail"), props.getProperty("password"), props.getProperty("rePassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2,description = "Register in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register")
    public void InvalidPasswordRegister() {
        registerPage.Register(props.getProperty("yourName"), props.getProperty("newEmail"), props.getProperty("invalidPassword"), props.getProperty("rePassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 3, description = "Register in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register")
    public void InvalidReEnterPassword() {
        registerPage.Register(props.getProperty("yourName"), props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("invalidRePassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4, description = "Register in Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register")
    public void SuccessfulRegister() {
        registerPage.Register(props.getProperty("yourName"), props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("rePassword"));
        Assert.assertTrue(true);
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }


}
