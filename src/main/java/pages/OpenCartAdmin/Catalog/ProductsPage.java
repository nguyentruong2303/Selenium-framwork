package pages.OpenCartAdmin.Catalog;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='container']/nav[@id='column-left']/ul[@id='menu']/li[@id='menu-catalog']/a[1]")
    WebElement linkCatalog;

    @FindBy(xpath = "//a[contains(text(),'Products')]")
    WebElement goProducts;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void GoProducts() {
        click(linkCatalog);
        click(goProducts);
    }
}
