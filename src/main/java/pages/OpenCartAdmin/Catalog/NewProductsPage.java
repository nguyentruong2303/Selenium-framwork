package pages.OpenCartAdmin.Catalog;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewProductsPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[1]")
    WebElement goNewProducts;

    @FindBy(xpath = "//input[@id='input-name1']")
    WebElement productNameTxt;

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]")
    WebElement descriptionTxt;

    @FindBy(xpath = "//input[@id='input-meta-title1']")
    WebElement tagTitleTxt;

    @FindBy(xpath = "//textarea[@id='input-meta-description1']")
    WebElement tagDescriptionTxt;

    @FindBy(xpath = "//textarea[@id='input-meta-keyword1']")
    WebElement tagKeyWordTxt;

    @FindBy(xpath = "//input[@id='input-tag1']")
    WebElement productTagTxt;

    @FindBy(xpath = "//a[contains(text(),'Data')]")
    WebElement goData;

    @FindBy(xpath = "//input[@id='input-model']")
    WebElement modelTxt;

    @FindBy(xpath = "//input[@id='input-location']")
    WebElement locationTxt;

    @FindBy(xpath = "//input[@id='input-price']")
    WebElement priceTxt;

    @FindBy(xpath = "//input[@id='input-quantity']")
    WebElement quantityTxt;

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/button[1]")
    WebElement btnSave;

    public NewProductsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void NewProducts(String productName, String description, String tagTitle, String tagDescription, String tagKeyWord,
                            String productTag, String model, String location, String price, String quantity) {
        click(goNewProducts);
        sendKey(productNameTxt,productName);
        sendKey(descriptionTxt,description);
        sendKey(tagTitleTxt,tagTitle);
        sendKey(tagDescriptionTxt,tagDescription);
        sendKey(tagKeyWordTxt,tagKeyWord);
        sendKey(productTagTxt,productTag);
        click(goData);
        sendKey(modelTxt,model);
        sendKey(locationTxt,location);
        sendKey(priceTxt,price);
        sendKey(quantityTxt,quantity);
        click(btnSave);

    }
}
