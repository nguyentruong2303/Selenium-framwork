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
import pages.phpTravel.SignUpPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class SignUpTest {
    BasePage basePage;
    SignUpPage signUpPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlPhpTravel"));
        signUpPage = new SignUpPage(driver);
    }

    @Test(priority = 0, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase description : Verify Sign Up")
    public void InvalidFirstNameSignUp() {
        signUpPage.SignUp(props.getProperty("invalidFirstName"), props.getProperty("lastName"), props.getProperty("phone"),
                props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase description : Verify Sign Up")
    public void InvalidLastNameSignUp() {
        signUpPage.SignUp(props.getProperty("firstName"), props.getProperty("invalidLastName"), props.getProperty("phone"),
                props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Sign Up")
    public void InvalidPhone() {
        signUpPage.SignUp(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("invalidPhone"),
                props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 3, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Sign Up")
    public void InvalidEmail() {
        signUpPage.SignUp(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("phone"),
                props.getProperty("invalidEmail"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Sign Up")
    public void InvalidPassword() {
        signUpPage.SignUp(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("phone"),
                props.getProperty("newEmail"), props.getProperty("invalidPassword"), props.getProperty("confirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 5, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Sign Up")
    public void InvalidConfirmPassword() {
        signUpPage.SignUp(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("phone"),
                props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("invalidConfirmPassword"));
        Assert.assertTrue(false);
    }

    @Test(priority = 6, description = "Sign Up Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Sign Up")
    public void SuccessfulSignUp() {
        signUpPage.SignUp(props.getProperty("firstName"), props.getProperty("lastName"), props.getProperty("phone"),
                props.getProperty("newEmail"), props.getProperty("password"), props.getProperty("confirmPassword"));
        Assert.assertTrue(true);
    }
    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
