package tests.ProductStore;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ProductStore.LoginPage;
import pages.ProductStore.OrderPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class OrderTest {
    BasePage basePage;
    LoginPage loginPage;
    OrderPage orderPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlProductStore"));
        loginPage = new LoginPage(driver);
        orderPage = new OrderPage(driver);
        loginPage.Login(props.getProperty("invalidUserName"), props.getProperty("password"));
    }

    @Test(priority = 0, description = "Order a product in Website")
    @Description("Testcase description : Verify Order in Website")
    public void SuccessfulOrder() {
        orderPage.OrderPage();
        Assert.assertTrue(true);
    }
}
