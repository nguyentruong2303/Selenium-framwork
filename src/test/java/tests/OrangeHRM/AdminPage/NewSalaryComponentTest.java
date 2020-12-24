package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewSalaryComponentsPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewSalaryComponentTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewSalaryComponentsPage newSalaryComponentsPage;
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
        newSalaryComponentsPage = new NewSalaryComponentsPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();
    }
    @Test(priority = 0, description = "New salary Components On Website")
    @Description("Testcase description : Verify new salary components on website")
    public void invalidComponentName() {
        newSalaryComponentsPage.NewSalaryComponents(props.getProperty("invalidComponentName"));
        Assert.assertTrue(true);
    }

    @Test(priority = 1, description = "New salary Components On Website")
    @Description("Testcase description : Verify new salary components on website")
    public void invalidComponentName1() {
        newSalaryComponentsPage.NewSalaryComponents("");
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "New salary Components On Website")
    @Description("Testcase description : Verify new salary components on website")
    public void SuccessfulNewSalaryComponent() {
        newSalaryComponentsPage.NewSalaryComponents(props.getProperty("ComponentName"));
        Assert.assertTrue(true);
    }
}
