package pages.OpenCart;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement slProduct;

    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantityTxt;

    @FindBy(xpath = "//button[@id='button-cart']")
    WebElement btnAddCart;

    public OrderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void AddToCart(String quantity) {
        click(slProduct);
        clear(quantityTxt );
        sendKey(quantityTxt,quantity);
        click(btnAddCart);
    }
}
