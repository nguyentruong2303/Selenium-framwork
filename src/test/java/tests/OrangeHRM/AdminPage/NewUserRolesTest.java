package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewUserRolesPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewUserRolesTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewUserRolesPage newUserRolesPage;
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
        newUserRolesPage = new NewUserRolesPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.UserManagement();
    }

    @Test(priority = 0, description = "Add New User Role On Website")
    @Description("Testcase description : Verify Add new user role on Website")
    public void InvalidUserRoleName() {
        newUserRolesPage.NewUserRole(props.getProperty("invalidUserRoleName"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "Add New User Role On Website")
    @Description("Testcase description : Verify Add new user role on Website")
    public void InvalidUserRoleName1() {
        newUserRolesPage.NewUserRole("");
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "Add New User Role On Website")
    @Description("Testcase description : Verify Add new user role on Website")
    public void SuccessfulAddNewUserRole() {
        newUserRolesPage.NewUserRole(props.getProperty("UserRoleName"));
        Assert.assertTrue(true);
    }

}
