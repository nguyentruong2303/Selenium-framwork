package pages.Amazon;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class AddCartPage extends BasePage {

    @FindBy(xpath = "//span[contains(text(),'New Apple Watch Series 6 (GPS, 40mm) - Blue Alumin')]")
    WebElement selectProduct;

    @FindBy(xpath = "//a[@id='buybox-see-all-buying-choices-announce']")
    WebElement seeAllBuyingBtn;

    @FindBy(xpath = "//*[@id='a-autoid-2']/span/input")
    WebElement AddToCartBtn;

    public AddCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void AddToCart() {
        click(selectProduct);
        click(seeAllBuyingBtn);
        click(AddToCartBtn);
    }
}
