package tests.ProductStore;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ProductStore.LoginPage;
import pages.ProductStore.PaymentPage;

import java.util.Properties;

public class PaymentTest {
    BasePage basePage;
    Properties props;
    LoginPage loginPage;
    PaymentPage paymentPage;
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlProductStore"));
        loginPage = new LoginPage(driver);
        paymentPage = new PaymentPage(driver);
    }

    @Test
    public void SuccessfulPayment() {

    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
