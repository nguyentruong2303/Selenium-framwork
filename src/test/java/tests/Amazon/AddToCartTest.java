package tests.Amazon;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Amazon.AddCartPage;
import pages.Amazon.LoginPage;
import pages.Amazon.SearchPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class AddToCartTest {
    BasePage basePage;
    LoginPage loginPage;
    SearchPage searchPage;
    AddCartPage addCartPage;
    Properties props;
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlAmazon"));
        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        addCartPage = new AddCartPage(driver);
        loginPage.Login(props.getProperty("email"),props.getProperty("password"));
        searchPage.Search(props.getProperty("keySearch"));
    }

    @Test(description = "Add to Cart")
    @Description("Testcase description")
    public void SuccessfulAddToCart() {
        addCartPage.AddToCart();
    }

}
