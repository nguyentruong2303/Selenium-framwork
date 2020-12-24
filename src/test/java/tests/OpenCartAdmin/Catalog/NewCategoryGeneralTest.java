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
import pages.OpenCartAdmin.Catalog.NewCategoryGeneralPage;
import pages.OpenCartAdmin.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewCategoryGeneralTest {
    BasePage basePage;
    LoginPage loginPage;
    Properties props;
    NewCategoryGeneralPage newCategoryGeneralPage;
    WebDriver driver;
    CategoryPage categoryPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver= basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCartAdmin"));
        loginPage = new LoginPage(driver);
        categoryPage = new CategoryPage(driver);
        newCategoryGeneralPage = new NewCategoryGeneralPage(driver);
        loginPage.Login(props.getProperty("username"), props.getProperty("password"));
        categoryPage.Category();
    }

    @Test(priority = 0,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidCategoryName1() {
        newCategoryGeneralPage.NewCateGoryGeneral("", props.getProperty("Description"), props.getProperty("TagTitle"),
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidCategoryName2() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("invalidCategoryName"), props.getProperty("Description"), props.getProperty("TagTitle"),
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 2,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidDescription1() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"),"", props.getProperty("TagTitle"),
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 3,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidDescription2() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("invalidDescription"), props.getProperty("TagTitle"),
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidTagTitle1() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"),"",
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 5,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidTagTitle2() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"), props.getProperty("invalidTagTitle"),
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 6,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidTagDescription1() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"), props.getProperty("TagTitle"),
                "", props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 7,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidTagDescription2() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"), props.getProperty("TagTitle"),
                props.getProperty("invalidTagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(false);
    }

    @Test(priority = 8,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidTagKeyWord1() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"), props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),"");
        Assert.assertTrue(false);
    }

    @Test(priority = 9,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void InvalidTagKeyWord2() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"), props.getProperty("TagTitle"),
                props.getProperty("TagDescription"), props.getProperty("invalidTagKeyWord"));
        Assert.assertTrue(false);
    }


    @Test(priority = 10,description = "New Category General On Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify new Category General on Website")
    public void SuccessfulNewCategoryGeneral() {
        newCategoryGeneralPage.NewCateGoryGeneral(props.getProperty("CategoryName"), props.getProperty("Description"), props.getProperty("TagTitle"),
                props.getProperty("TagDescription"), props.getProperty("TagKeyWord"));
        Assert.assertTrue(true);
    }


}
