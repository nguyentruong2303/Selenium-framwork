package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditLocationPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewLocations']")
    public WebElement goLocation;

    @FindBy(xpath = "//tbody/tr[1]/td[8]")
    WebElement btnEdit;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameTxt;

    @FindBy(xpath = "//input[@id='province']")
    WebElement provinceTxt;

    @FindBy(xpath = "//input[@id='city']")
    WebElement cityTxt;

    @FindBy(xpath = "//input[@id='zipCode']")
    WebElement zipCodeTxt;

    @FindBy(xpath = "//input[@id='phone']")
    WebElement phoneTxt;

    @FindBy(xpath = "//input[@id='fax']")
    WebElement faxTxt;

    @FindBy(xpath = "//textarea[@id='address']")
    WebElement addressTxt;

    @FindBy(xpath = "//textarea[@id='notes']")
    WebElement notesTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public EditLocationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EditLocation(String name, String province, String city, String zip, String phone ,String fax, String address, String notes) {
        click(goLocation);
        click(btnEdit);
        clear(nameTxt);
        sendKey(nameTxt,name);
        clear(provinceTxt);
        sendKey(provinceTxt,province);
        clear(cityTxt);
        sendKey(cityTxt,city);
        clear(zipCodeTxt);
        sendKey(zipCodeTxt,zip);
        clear(phoneTxt);
        sendKey(phoneTxt,phone);
        clear(faxTxt);
        sendKey(faxTxt,fax);
        clear(addressTxt);
        sendKey(addressTxt,address);
        clear(notesTxt);
        sendKey(notesTxt,notes);
        click(btnSave);
    }
}
