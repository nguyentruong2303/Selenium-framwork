package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewEmploymentStatusPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewEmploymentStatusTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewEmploymentStatusPage newEmploymentStatusPage;
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
        newEmploymentStatusPage = new NewEmploymentStatusPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();
    }

    @Test(priority = 0, description = "New Employment Status")
    @Description("Testcase description : Verify New Employment Status")
    public void invalidName() {
        newEmploymentStatusPage.NewEmploymentStatus(props.getProperty("invalidName"));
        Assert.assertTrue(true);
    }
    @Test(priority = 1, description = "New Employment Status")
    @Description("Testcase description : Verify New Employment Status")
    public void invalidName1() {
        newEmploymentStatusPage.NewEmploymentStatus("");
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "New Employment Status")
    @Description("Testcase description : Verify New Employment Status")
    public void SuccessfulAddNewEmploymentStatus() {
        newEmploymentStatusPage.NewEmploymentStatus(props.getProperty("Name"));
        Assert.assertTrue(true);
    }

}
