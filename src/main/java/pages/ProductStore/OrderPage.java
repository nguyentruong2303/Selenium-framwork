package pages.ProductStore;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Iphone 6 32gb')]")
    WebElement selectProduct;

    @FindBy(xpath = "//a[contains(text(),'Add to cart')]")
    WebElement addToCartBtn;




    public OrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void OrderPage() {
        scrollToElement();
        click(selectProduct);
        click(addToCartBtn);
    }
}
