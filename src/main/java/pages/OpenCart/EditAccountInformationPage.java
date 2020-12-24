package pages.OpenCart;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccountInformationPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Edit your account information')]")
    WebElement editLink;

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstNameTxt;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastNameTxt;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTxt;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement phoneTxt;

    @FindBy(xpath = "//body/div[@id='account-edit']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
    WebElement btnContinue;

    public EditAccountInformationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EditAccountInformation(String firstName, String lastName, String email, String phone) {
        click(editLink);
        clear(firstNameTxt);
        sendKey(firstNameTxt,firstName);
        clear(lastNameTxt);
        sendKey(lastNameTxt,lastName);
        clear(emailTxt);
        sendKey(emailTxt,email);
        clear(phoneTxt);
        sendKey(phoneTxt,phone);
        click(btnContinue);
    }
}
