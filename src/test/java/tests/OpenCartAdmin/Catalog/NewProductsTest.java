package tests.OpenCartAdmin.Catalog;

import base.BasePage;
import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.OpenCartAdmin.Catalog.NewProductsPage;
import pages.OpenCartAdmin.Catalog.ProductsPage;
import pages.OpenCartAdmin.LoginPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewProductsTest {
    BasePage basePage;
    LoginPage loginPage;
    NewProductsPage newProductsPage;
    Properties props;
    WebDriver driver;
    ProductsPage productsPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlOpenCartAdmin"));
        loginPage = new LoginPage(driver);
        productsPage = new ProductsPage(driver);
        newProductsPage = new NewProductsPage(driver);
        loginPage.Login(props.getProperty("username"), props.getProperty("password") );
        productsPage.GoProducts();
    }

    @Test(priority = 0, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidProductName1() {
        newProductsPage.NewProducts(props.getProperty("invalidProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }

    @Test(priority = 1, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidProductName2() {
        newProductsPage.NewProducts("",
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 2, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidDescription1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("invalidDescription"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 3, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidDescription2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                "",
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }

    @Test(priority = 4, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidTagTitle1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("invalidTagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 5, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidTagTitle2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                "",
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 6, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidTagDescription1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("invalidTagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 7, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidTagDescription2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                "",
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 8, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidTTagKeyWord1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("invalidTagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 9, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidTTagKeyWord2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                "",
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 10, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidProductTag1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("invalidProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 11, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidProductTag2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                "",
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 12, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidModel1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("invalidModel"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 13, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidModel2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                "",
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 14, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidLocation1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("invalidLocation"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 15, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidLocation2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                "",
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 16, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidPrice1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("invalidPrice"),
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 17, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidPrice2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                "",
                props.getProperty("Quantity"));
        Assert.assertTrue(false);
    }

    @Test(priority = 18, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidQuantity1() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("invalidQuantity"));
        Assert.assertTrue(false);
    }
    @Test(priority = 19, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void invalidQuantity2() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                "");
        Assert.assertTrue(false);
    }
    @Test(priority = 20, description = "New Product On Website")
    @Description("Testcase description : Verify new product")
    public void SuccessfulNewProduct() {
        newProductsPage.NewProducts(props.getProperty("ProductName"),
                props.getProperty("Description"),
                props.getProperty("TagTitle"),
                props.getProperty("TagDescription"),
                props.getProperty("TagKeyWord"),
                props.getProperty("ProductTag"),
                props.getProperty("Model"),
                props.getProperty("Location"),
                props.getProperty("Price"),
                props.getProperty("Quantity"));
        Assert.assertTrue(true);
    }

}
