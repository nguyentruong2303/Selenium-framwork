package tests.OpenCart;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpenCart.ChangePasswordPage;
import pages.OpenCart.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class ChangePasswordTest {
    BasePage basePage;
    LoginPage loginPage;
    Properties props;
    WebDriver driver;
    ChangePasswordPage changePasswordPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCart"));
        loginPage = new LoginPage(driver);
        changePasswordPage = new ChangePasswordPage(driver);
        loginPage.Login(props.getProperty("email"), props.getProperty("password"));
    }

    @Test(priority = 0, description = "Change Password Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify password in change password")
    public void InvalidPassword1() {
        changePasswordPage.ChangePassword(props.getProperty(""), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Change Password Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify password in change password")
    public void InvalidPassword2() {
        changePasswordPage.ChangePassword(props.getProperty("invalidPassword"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Change Password Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify confirmPassword in change password")
    public void InvalidConfirmPassword1() {
        changePasswordPage.ChangePassword(props.getProperty("password"), props.getProperty(""));
        Assert.assertTrue(false);
    }

    @Test(priority = 3, description = "Change Password Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify confirmPassword in change password")
    public void InvalidConfirmPassword2() {
        changePasswordPage.ChangePassword(props.getProperty("password"), props.getProperty("invalidConfirmPassword"));
        Assert.assertTrue(false);
    }

}
