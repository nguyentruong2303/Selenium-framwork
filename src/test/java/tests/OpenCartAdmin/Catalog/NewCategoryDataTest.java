package tests.OpenCartAdmin.Catalog;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpenCartAdmin.Catalog.CategoryPage;
import pages.OpenCartAdmin.Catalog.NewCategoryDataPage;
import pages.OpenCartAdmin.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewCategoryDataTest {
    BasePage basePage;
    LoginPage loginPage;
    NewCategoryDataPage newCategoryDataPage;
    CategoryPage categoryPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCartAdmin"));
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
        newCategoryDataPage = new NewCategoryDataPage(driver);
        loginPage.Login(props.getProperty("username"), props.getProperty("password"));
        categoryPage.Category();
    }
    @Test(priority = 0, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidParent1() {
        newCategoryDataPage.NewCategoryData(props.getProperty("invalidParent"),
                props.getProperty("Filter"),
                props.getProperty("column"),
                props.getProperty("sortOrder"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidParent2() {
        newCategoryDataPage.NewCategoryData("",
                props.getProperty("Filter"),
                props.getProperty("column"),
                props.getProperty("sortOrder"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidFilter1() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                props.getProperty("invalidFilter"),
                props.getProperty("column"),
                props.getProperty("sortOrder"));
        Assert.assertTrue(false);
    }

    @Test(priority = 3, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidFilter2() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                "",
                props.getProperty("column"),
                props.getProperty("sortOrder"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidColumn1() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                props.getProperty("Filter"),
            "",
                props.getProperty("sortOrder"));
        Assert.assertTrue(false);
    }
    @Test(priority = 5, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidColumn2() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                props.getProperty("Filter"),
                props.getProperty("invalidColumn"),
                props.getProperty("sortOrder"));
        Assert.assertTrue(false);
    }

    @Test(priority = 6, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidSortOrder1() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                props.getProperty("Filter"),
                props.getProperty("column"),
                props.getProperty("invalidSortOrder"));
        Assert.assertTrue(false);
    }

    @Test(priority = 7, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void invalidSortOrder2() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                props.getProperty("Filter"),
                props.getProperty("column"),
                "");
        Assert.assertTrue(false);
    }


    @Test(priority = 8, description = "New Category Data On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new CategoryDate on Website")
    public void SuccessfulNewCategoryData() {
        newCategoryDataPage.NewCategoryData(props.getProperty("Parent"),
                props.getProperty("Filter"),
                props.getProperty("column"),
                props.getProperty("sortOrder"));
        Assert.assertTrue(true);
    }

}
