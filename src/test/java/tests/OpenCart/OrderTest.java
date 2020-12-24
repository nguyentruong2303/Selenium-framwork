package tests.OpenCart;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpenCart.LoginPage;
import pages.OpenCart.OrderPage;
import pages.OpenCart.SearchPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class OrderTest {
    BasePage basePage;
    LoginPage loginPage;
    Properties props;
    SearchPage searchPage;
    OrderPage orderPage;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCart"));
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        orderPage = new OrderPage(driver);
        searchPage.Search(props.getProperty("keyWord"));
    }

    @Test(priority = 0, description = "Add to Cart On Website")
    @Description("Testcase description : Verify add to cart on website")
    public void SuccessfulAddToCart() {
        orderPage.AddToCart("2");

    }
}
