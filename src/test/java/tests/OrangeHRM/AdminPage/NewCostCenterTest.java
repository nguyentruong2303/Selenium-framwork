package tests.OrangeHRM.AdminPage;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OrangeHRM.Admin.AdminPage;
import pages.OrangeHRM.Admin.NewCostCentersPage;
import pages.OrangeHRM.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewCostCenterTest {
    BasePage basePage;
    LoginPage loginPage;
    AdminPage adminPage;
    NewCostCentersPage newCostCentersPage;
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
        newCostCentersPage = new NewCostCentersPage(driver);
        loginPage.Login(props.getProperty("Username"), props.getProperty("Password"));
        adminPage.Organization();
    }

    @Test(priority = 0, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void invalidCostID() {
        newCostCentersPage.NewCostCenter(props.getProperty("invalidCostID"),
                props.getProperty("CostName"),
                props.getProperty("Description"));
        Assert.assertTrue(true);
    }
    @Test(priority = 1, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void invalidCostID1() {
        newCostCentersPage.NewCostCenter("",
                props.getProperty("CostName"),
                props.getProperty("Description"));
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void invalidCostName() {
        newCostCentersPage.NewCostCenter(props.getProperty("CostID"),
                props.getProperty("invalidCostName"),
                props.getProperty("Description"));
        Assert.assertTrue(true);
    }
    @Test(priority = 3, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void invalidCostName1() {
        newCostCentersPage.NewCostCenter(props.getProperty("CostID"),
                "",
                props.getProperty("Description"));
        Assert.assertTrue(false);
    }
    @Test(priority = 4, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void invalidDescription() {
        newCostCentersPage.NewCostCenter(props.getProperty("CostID"),
                props.getProperty("CostName"),
                props.getProperty("invalidDescription"));
        Assert.assertTrue(true);
    }
    @Test(priority = 5, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void invalidDescription1() {
        newCostCentersPage.NewCostCenter(props.getProperty("CostID"),
                props.getProperty("CostName"),
                "");
        Assert.assertTrue(false);
    }
    @Test(priority = 6, description = "New Cost Centers On Website")
    @Description("Testcase description : Verify new cost center on website")
    public void SuccessfulNewCostCenter() {
        newCostCentersPage.NewCostCenter(props.getProperty("CostID"),
                props.getProperty("CostName"),
                props.getProperty("Description"));
        Assert.assertTrue(true);
    }
}
