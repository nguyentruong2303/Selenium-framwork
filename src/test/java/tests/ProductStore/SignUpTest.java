package tests.ProductStore;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ProductStore.SignUpPage;

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
        driver.get(props.getProperty("urlProductStore"));
        signUpPage = new SignUpPage(driver);
    }

    @Test(priority = 0, description = "Sign Up Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Sign Up")
    public void InvalidUserNameSignUp() {
        signUpPage.SignUp(props.getProperty("invalidUserName"), props.getProperty("password"));
        Assert.assertTrue(false);
    }


    @Test(priority = 2, description = "Sign Up Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify Sign Up")
    public void SuccessfulSignUp() {
        signUpPage.SignUp(props.getProperty("newUserName"), props.getProperty("newPassword"));
        Assert.assertTrue(true);
    }
}
