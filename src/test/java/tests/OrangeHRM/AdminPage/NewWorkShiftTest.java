package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewWorkShiftsPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewWorkShiftTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewWorkShiftsPage newWorkShiftsPage;
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
        newWorkShiftsPage = new NewWorkShiftsPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Job();
    }

    @Test(priority = 0, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void invalidName() {
        newWorkShiftsPage.NewWordShift(props.getProperty("invalidName"), props.getProperty("StartTime"), props.getProperty("EndTime") );
        Assert.assertTrue(true);
    }

    @Test(priority = 1, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void invalidName1() {
        newWorkShiftsPage.NewWordShift("", props.getProperty("StartTime"), props.getProperty("EndTime") );
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void invalidStartTime() {
        newWorkShiftsPage.NewWordShift(props.getProperty("Name"), props.getProperty("invalidStartTime"), props.getProperty("EndTime") );
        Assert.assertTrue(false);
    }
    @Test(priority = 3, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void invalidStartTime1() {
        newWorkShiftsPage.NewWordShift(props.getProperty("Name"), "", props.getProperty("EndTime") );
        Assert.assertTrue(false);
    }
    @Test(priority = 4, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void invalidEndTime() {
        newWorkShiftsPage.NewWordShift(props.getProperty("Name"), props.getProperty("StartTime"), props.getProperty("invalidEndTime") );
        Assert.assertTrue(false);
    }
    @Test(priority = 5, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void invalidEndTime1() {
        newWorkShiftsPage.NewWordShift(props.getProperty("Name"), props.getProperty("StartTime"), "");
        Assert.assertTrue(false);
    }
    @Test(priority = 6, description = "New WorkShift on Website")
    @Description("Testcase description : Verify New WorkShift on Website")
    public void SuccessfulNewWorkShift() {
        newWorkShiftsPage.NewWordShift(props.getProperty("Name"), props.getProperty("StartTime"), props.getProperty("EndTime") );
        Assert.assertTrue(true);
    }
}
