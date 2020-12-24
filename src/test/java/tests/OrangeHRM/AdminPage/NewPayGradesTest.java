package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewPayGradesPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewPayGradesTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewPayGradesPage newPayGradesPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOrangeHRM"));
        loginPage = new LoginPage(driver);
        adminPage = new AdminPage(driver);
        newPayGradesPage = new NewPayGradesPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();
    }

    @Test(priority = 0, description = "New Pay Grades on Website")
    @Description("Testcase description : Verify new Pay Grades on Website")
    public void invalidName() {
        newPayGradesPage.PayGrades(props.getProperty("invalidName"));
        Assert.assertTrue(true);
    }
    @Test(priority = 0, description = "New Pay Grades on Website")
    @Description("Testcase description : Verify new Pay Grades on Website")
    public void SuccessfulNewPayGrades() {
        newPayGradesPage.PayGrades(props.getProperty("Name"));
        Assert.assertTrue(true);
    }

}
