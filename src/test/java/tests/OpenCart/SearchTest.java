package tests.OpenCart;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpenCart.SearchPage;

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
        driver.get(props.getProperty("urlOpenCart"));
        searchPage = new SearchPage(driver);
    }

    @Test(priority = 0, description = "Search On Website")
    @Description("Testcase description : Verify search on Website")
    public void InvalidSearch() {
        searchPage.Search(props.getProperty(""));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = " Search On Website")
    @Description("Testcase desription : Verify search on Website")
    public void SuccessfulSearch() {
        searchPage.Search(props.getProperty("keyWord"));
        Assert.assertTrue(true);
    }
}
