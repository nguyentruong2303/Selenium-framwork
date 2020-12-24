package pages.OpenCart;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement myAccount;

    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[1]/a[1]")
    WebElement startRegister;

    @FindBy(xpath = "//input[@id='input-firstname']")
    WebElement firstNameTxt;

    @FindBy(xpath = "//input[@id='input-lastname']")
    WebElement lastNameTxt;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTxt;

    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement phoneTxt;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTxt;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPassWordTxt;

    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement yesRadio;

    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]")
    WebElement noRadio;

    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")
    WebElement agreeBox;

    @FindBy(xpath = "//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]")
    WebElement btnContinue;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Register(String firstName, String lastName, String email, String phone, String password, String confirmPassword) {
        click(myAccount);
        click(startRegister);
        sendKey(firstNameTxt,firstName);
        sendKey(lastNameTxt,lastName);
        sendKey(emailTxt,email);
        sendKey(phoneTxt,phone);
        sendKey(passwordTxt,password);
        sendKey(confirmPassWordTxt,confirmPassword);
        click(yesRadio);
        click(agreeBox);
        click(btnContinue);
    }
}
