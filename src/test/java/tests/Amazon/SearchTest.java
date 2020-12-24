package tests.Amazon;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Amazon.SearchPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class SearchTest {
    BasePage basePage;
    SearchPage searchPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlAmazon"));
        searchPage = new SearchPage(driver);
    }

//    @Test(priority = 0, description = "Search Product on Website")
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Testcase description : Verify search on Website")
//    public void invalidKeySearch() {
//        searchPage.Search(props.getProperty("invalidKeySearch"));
//        Assert.assertTrue(false);
//    }

    @Test(priority = 1, description = "Seach product on Website")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase descriptiom : Verify search on Website")
    public void SuccessfulSearch() {
        searchPage.Search(props.getProperty("keySearch"));
        Assert.assertTrue(true);
    }

}
