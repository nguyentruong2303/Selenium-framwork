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
import pages.OrangeHRM.ChangePasswordPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners({listeners.TestAllureListener.class})
public class ChangePasswordTest {
    BasePage basePage;
    LoginPage loginPage;
    ChangePasswordPage changePasswordPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOrangeHRM"));
        loginPage = new LoginPage(driver);
        changePasswordPage = new ChangePasswordPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
    }
    @Test(priority = 0, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void invalidCurrentPassword() {
        changePasswordPage.ChangePassword(props.getProperty("invalidCurrentPassword"),
                props.getProperty("NewPassword"),
                props.getProperty("ConfirmNewPassword"));
        Assert.assertTrue(false);
    }
    @Test(priority = 1, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void invalidCurrentPassword1() {
        changePasswordPage.ChangePassword("",
                props.getProperty("NewPassword"),
                props.getProperty("ConfirmNewPassword"));
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void invalidNewPassword() {
        changePasswordPage.ChangePassword(props.getProperty("CurrentPassword"),
                props.getProperty("invalidNewPassword"),
                props.getProperty("ConfirmNewPassword"));
        Assert.assertTrue(false);
    }
    @Test(priority = 3, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void invalidNewPassword1() {
        changePasswordPage.ChangePassword(props.getProperty("CurrentPassword"),
               "",
                props.getProperty("ConfirmNewPassword"));
        Assert.assertTrue(false);
    }
    @Test(priority = 4, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void invalidConfirmNewPassword() {
        changePasswordPage.ChangePassword(props.getProperty("CurrentPassword"),
                props.getProperty("NewPassword"),
                props.getProperty("invalidConfirmNewPassword"));
        Assert.assertTrue(false);
    }
    @Test(priority = 5, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void invalidConfirmNewPassword1() {
        changePasswordPage.ChangePassword(props.getProperty("CurrentPassword"),
                props.getProperty("NewPassword"),
                "");
        Assert.assertTrue(false);
    }
    @Test(priority = 6, description = "Change Password On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify change password on website")
    public void SuccessfulChangePassword() {
        changePasswordPage.ChangePassword(props.getProperty("CurrentPassword"),
                props.getProperty("NewPassword"),
                props.getProperty("ConfirmNewPassword"));
        Assert.assertTrue(true);
    }




}
