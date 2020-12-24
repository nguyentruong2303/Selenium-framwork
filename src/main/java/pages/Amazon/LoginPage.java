package pages.Amazon;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//a[@id='nav-link-accountList']")
     WebElement startLogin;

    @FindBy(xpath = "//input[@id='ap_email']")
     WebElement EmailTxt;

    @FindBy(xpath = "//input[@id='continue']")
     WebElement btnContinue;

    @FindBy(xpath = "//input[@id='ap_password']")
     WebElement PasswordTxt;

    @FindBy(xpath = "//input[@id='signInSubmit']")
     WebElement btnSignIn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @Step()
    public void Login(String email, String password) {
        click(startLogin);
        sendKey(EmailTxt,email);
        click(btnContinue);
        sendKey(PasswordTxt,password);
        click(btnSignIn);
    }
}
