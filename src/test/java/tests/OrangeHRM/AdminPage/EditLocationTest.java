package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.EditLocationPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners({listeners.TestAllureListener.class})
public class EditLocationTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    EditLocationPage editLocationPage;
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
        editLocationPage = new EditLocationPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Organization();
    }
    @Test(priority = 0, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidName() {
        editLocationPage.EditLocation(props.getProperty("invalidName"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }

    @Test(priority = 1, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidName1() {
        editLocationPage.EditLocation("",
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidProvince() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("invalidProvince"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
    @Test(priority = 3, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidProvince1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                "",
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 4, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidCity() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("invalidCity"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
    @Test(priority = 5, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidCity1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                "",
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 6, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidZipCode() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("invalidZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
    @Test(priority = 7, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidZipCode1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                "",
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 8, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidPhone() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("invalidPhone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
    @Test(priority = 9, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidPhone1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                "",
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 10, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidFax() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("invalidFax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
    @Test(priority = 11, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidFax1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                "",
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 12, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidAddress() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("invalidAddress"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
    @Test(priority = 13, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidAddress1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                "",
                props.getProperty("Note"));
        Assert.assertTrue(false);
    }
    @Test(priority = 14, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidNote() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("invalidNote"));
        Assert.assertTrue(true);
    }
    @Test(priority = 15, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void invalidNote1() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                "");
        Assert.assertTrue(false);
    }
    @Test(priority = 16, description = "New Location On Website ")
    @Description("Testcase description : Verify new location on Website")
    public void SuccessfulNewLocation() {
        editLocationPage.EditLocation(props.getProperty("Name"),
                props.getProperty("Province"),
                props.getProperty("City"),
                props.getProperty("ZipCode"),
                props.getProperty("Phone"),
                props.getProperty("Fax"),
                props.getProperty("Address"),
                props.getProperty("Note"));
        Assert.assertTrue(true);
    }
}
