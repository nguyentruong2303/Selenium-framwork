package pages.Amazon;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
    WebElement startRegister;

    @FindBy(xpath = "//header/div[@id='navbar']/div[@id='nav-flyout-anchor']/div[@id='nav-flyout-accountList']/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnSignUp;

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    WebElement yourNametxt;

    @FindBy(xpath = "//input[@id='ap_email']")
    WebElement emailTxt;

    @FindBy(xpath = "//input[@id='ap_password']")
    WebElement passwordTxt;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    WebElement repasswordTxt;

    @FindBy(xpath = "//input[@id='continue']")
    WebElement btnCreateAccount;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void Register(String yourName, String email, String password, String rePassword) {
        hoverandclick(driver,startRegister,btnSignUp);
        sendKey(yourNametxt,yourName);
        sendKey(emailTxt,email);
        sendKey(passwordTxt,password);
        sendKey(repasswordTxt,rePassword);
        click(btnCreateAccount);
    }

}
