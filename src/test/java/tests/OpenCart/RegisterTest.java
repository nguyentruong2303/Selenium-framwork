package tests.OpenCart;

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
import pages.OpenCart.RegisterPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class RegisterTest {
    BasePage basePage;
    RegisterPage registerPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCart"));
        registerPage = new RegisterPage(driver);
    }

    @Test(priority = 0, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void InvalidFirstName(){
        registerPage.Register(props.getProperty("invalidFirstName"), props.getProperty("lastName"), props.getProperty("email"),
                props.getProperty("phone"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void InvalidLastName() {
        registerPage.Register(props.getProperty("firstName"), props.getProperty("invalidLastName"), props.getProperty("email"),
                props.getProperty("phone"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void InvalidEmail() {
        registerPage.Register(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("invalidEmail"),
                props.getProperty("phone"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 3, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void InvalidPhone() {
        registerPage.Register(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("email"),
                props.getProperty("invalidPhone"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void InvalidPassword() {
        registerPage.Register(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("email"),
                props.getProperty("phone"), props.getProperty("invalidPassword"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 5, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void InvalidConfirmPassword() {
        registerPage.Register(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("email"),
                props.getProperty("phone"), props.getProperty("password"), props.getProperty("invalidConfirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 6, description = "Register Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Register Website")
    public void SuccessfulRegister() {
        registerPage.Register(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("email"),
                props.getProperty("phone"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(true);
    }
//
//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }

}
