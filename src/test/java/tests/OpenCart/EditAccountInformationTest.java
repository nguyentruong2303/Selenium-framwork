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
import pages.OpenCart.EditAccountInformationPage;
import pages.OpenCart.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class EditAccountInformationTest {
    BasePage basePage;
    LoginPage loginPage;
    Properties props;
    EditAccountInformationPage editAccountInformationPage;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCart"));
        loginPage = new LoginPage(driver);
        editAccountInformationPage = new EditAccountInformationPage(driver);
        loginPage.Login(props.getProperty("email"), props.getProperty("password"));
    }

    @Test(priority = 0, description = "Edit your account information")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify first name in  Edit account information")
    public void InvalidFirstNameInEditAccount() {
        editAccountInformationPage.EditAccountInformation(props.getProperty(""), props.getProperty("lastName"),
                props.getProperty("email"), props.getProperty("phone"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Edit your account information")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify last name in  Edit account information")
    public void InvalidLastNameInEditAccount() {
        editAccountInformationPage.EditAccountInformation(props.getProperty("firstName"), props.getProperty(""),
                props.getProperty("email"), props.getProperty("phone"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Edit your account information")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify email in Edit account information")
    public void InvalidEmailInEditAccount1() {
        editAccountInformationPage.EditAccountInformation(props.getProperty("firstName"), props.getProperty("lastName"),
                props.getProperty(""), props.getProperty("phone"));
        Assert.assertTrue(false);
    }
    @Test(priority = 3, description = "Edit your account information")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify email in Edit account information")
    public void InvalidEmailInEditAccount2() {
        editAccountInformationPage.EditAccountInformation(props.getProperty("firstName"), props.getProperty("lastName"),
                props.getProperty("invalidEmail"), props.getProperty("phone"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4, description = "Edit your account information")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify email in Edit account information")
    public void InvalidPhoneInEditAccount() {
        editAccountInformationPage.EditAccountInformation(props.getProperty("firstName"), props.getProperty("lastName"),
                props.getProperty("email"), props.getProperty(""));
        Assert.assertTrue(false);
    }

    @Test(priority = 5, description = "Edit your account information")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase Description : Verify email in Edit account information")
    public void SuccessfulEditAccountInformation() {
        editAccountInformationPage.EditAccountInformation(props.getProperty("firstName"), props.getProperty("lastName"),
                props.getProperty("email"), props.getProperty("phone"));
        Assert.assertTrue(true);
    }



}
