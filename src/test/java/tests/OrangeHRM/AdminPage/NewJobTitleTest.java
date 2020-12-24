package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewJobTitlePage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewJobTitleTest {
    BasePage basePage;
    LoginPage loginPage;
    NewJobTitlePage newJobTitlePage;
    AdminPage adminPage;
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
        newJobTitlePage = new NewJobTitlePage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();
    }

    @Test(priority = 0, description = "Add New Job Title On Website")
    @Description("Testcase description : Verify Add new job title on website")
    public void invalidJobTitle() {
        newJobTitlePage.NewJobTitle(props.getProperty("invalidJobTitle"), props.getProperty("JobDescription"));
        Assert.assertTrue(false);
    }
    @Test(priority = 1, description = "Add New Job Title On Website")
    @Description("Testcase description : Verify Add new job title on website")
    public void invalidJobTitle1() {
        newJobTitlePage.NewJobTitle("", props.getProperty("JobDescription"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Add New Job Title On Website")
    @Description("Testcase description : Verify Add new job title on website")
    public void invalidJobDescription() {
        newJobTitlePage.NewJobTitle(props.getProperty("JobTitle"), props.getProperty("invalidJobDescription"));
        Assert.assertTrue(false);
    }

    @Test(priority = 3, description = "Add New Job Title On Website")
    @Description("Testcase description : Verify Add new job title on website")
    public void invalidJobDescription1() {
        newJobTitlePage.NewJobTitle(props.getProperty("JobTitle"), "");
        Assert.assertTrue(false);
    }


    @Test(priority = 4, description = "Add New Job Title On Website")
    @Description("Testcase description : Verify Add new job title on website")
    public void SuccessfulAddNewJobTitle() {
        newJobTitlePage.NewJobTitle(props.getProperty("JobTitle"), props.getProperty("JobDescription"));
        Assert.assertTrue(true);
    }
}
