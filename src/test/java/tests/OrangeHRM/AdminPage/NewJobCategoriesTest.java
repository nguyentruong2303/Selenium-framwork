package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewJobCategoriesPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewJobCategoriesTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewJobCategoriesPage newJobCategoriesPage;
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
        newJobCategoriesPage = new NewJobCategoriesPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();
    }

    @Test(priority = 0, description = "Add new job categories on website")
    @Description("Testcase description : Verify add new job categories on website")
    public void invalidName() {
        newJobCategoriesPage.NewJobCategories(props.getProperty("invalidName"));
        Assert.assertTrue(true);
    }

    @Test(priority = 1, description = "Add new job categories on website")
    @Description("Testcase description : Verify add new job categories on website")
    public void invalidName1() {
        newJobCategoriesPage.NewJobCategories("");
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "Add new job categories on website")
    @Description("Testcase description : Verify add new job categories on website")
    public void SuccessfulNewJobCategories() {
        newJobCategoriesPage.NewJobCategories(props.getProperty("Name"));
        Assert.assertTrue(true);
    }

}
