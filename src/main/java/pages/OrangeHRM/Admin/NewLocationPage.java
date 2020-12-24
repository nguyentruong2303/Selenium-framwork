package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewLocationPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewLocations']")
    public WebElement goLocation;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameTxt;

    @FindBy(xpath = "//body/div[@id='locationAddModal']/form[1]/div[1]/div[1]/materializecss-decorator[1]/div[1]/sf-decorator[2]/div[1]/div[1]/input[1]")
    WebElement country;

    @FindBy(xpath = "//span[contains(text(),'Viet Nam')]")
    WebElement selectVN;

    @FindBy(xpath = "//body/div[@id='locationAddModal']/form[1]/div[1]/div[1]/materializecss-decorator[2]/div[1]/sf-decorator[1]/div[1]/div[1]/input[1]")
    WebElement timeZone;

    @FindBy(xpath = "//span[contains(text(),'Asia/Saigon')]")
    WebElement slAsiaSG;

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
    WebElement noteTxt;


    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public NewLocationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void NewLocation(String name, String province, String city, String zipCode, String phone , String fax,String address, String note) {
        click(goLocation);
        click(btnAdd);
        sendKey(nameTxt, name);
        click(country);
        click(selectVN);
        click(timeZone);
        click(slAsiaSG);
        sendKey(provinceTxt,province);
        sendKey(cityTxt,city);
        sendKey(zipCodeTxt,zipCode);
        sendKey(phoneTxt,phone);
        sendKey(faxTxt,fax);
        sendKey(addressTxt,address);
        sendKey(noteTxt,note);
        click(btnSave);
    }

}
