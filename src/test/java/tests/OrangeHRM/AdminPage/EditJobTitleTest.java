package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.EditJobTitlePage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class EditJobTitleTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    EditJobTitlePage editJobTitlePage;
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
        editJobTitlePage = new EditJobTitlePage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();

    }

    @Test(priority = 0, description = "Edit Job Title on Website")
    @Description("Testcase description : Verify Edit job title on website")
    public void invalidJobTitle() {
        editJobTitlePage.EditJobTitle(props.getProperty("invalidJobTitle"), props.getProperty("JobDescription") );
        Assert.assertTrue(false);
    }
    @Test(priority = 1, description = "Edit Job Title on Website")
    @Description("Testcase description : Verify Edit job title on website")
    public void invalidJobTitle1() {
        editJobTitlePage.EditJobTitle("", props.getProperty("JobDescription") );
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "Edit Job Title on Website")
    @Description("Testcase description : Verify Edit job title on website")
    public void invalidJobDescription() {
        editJobTitlePage.EditJobTitle(props.getProperty("JobTitle"), "");
        Assert.assertTrue(true);
    }
    @Test(priority = 3, description = "Edit Job Title on Website")
    @Description("Testcase description : Verify Edit job title on website")
    public void SuccessfulEditJobTitle() {
        editJobTitlePage.EditJobTitle(props.getProperty("JobTitle"), props.getProperty("JobDescription"));
        Assert.assertTrue(true);
    }
}
