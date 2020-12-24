package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.EditPayGradesPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class EditPayGradesTest {
    BasePage basePage;
    LoginPage loginPage;
    EditPayGradesPage editPayGradesPage;
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
        editPayGradesPage = new EditPayGradesPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();

    }

    @Test(priority = 0, description = "Edit Pay grades on Website")
    @Description("Testcase description : Verify edit pay grade on website")
    public void invalidMinSalary() {
        editPayGradesPage.EditPayGrade(props.getProperty("invalidMinSalary"), props.getProperty("MaxSalary"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Edit Pay grades on Website")
    @Description("Testcase description : Verify edit pay grade on website")
    public void invalidMinSalary1() {
        editPayGradesPage.EditPayGrade("", props.getProperty("MaxSalary"));
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "Edit Pay grades on Website")
    @Description("Testcase description : Verify edit pay grade on website")
    public void invalidMaxSalary() {
        editPayGradesPage.EditPayGrade(props.getProperty("MinSalary"), props.getProperty("invalidMaxSalary"));
        Assert.assertTrue(false);
    }
    @Test(priority = 3, description = "Edit Pay grades on Website")
    @Description("Testcase description : Verify edit pay grade on website")
    public void invalidMaxSalary1() {
        editPayGradesPage.EditPayGrade(props.getProperty("MinSalary"), "");
        Assert.assertTrue(false);
    }
    @Test(priority = 4, description = "Edit Pay grades on Website")
    @Description("Testcase description : Verify edit pay grade on website")
    public void SuccessfulEditPayGrade() {
        editPayGradesPage.EditPayGrade(props.getProperty("MinSalary"), props.getProperty("MaxSalary"));
        Assert.assertTrue(true);
    }
}
