package pages.OpenCart;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement myAccount;

    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement startLogin;

    @FindBy(xpath = "//input[@id='input-email']")
    WebElement emailTxt;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTxt;

    @FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @Step("login with username: {0} and password : {1} step...")
    public void Login(String email, String password) {
        click(myAccount);
        click(startLogin);
        sendKey(emailTxt,email);
        sendKey(passwordTxt,password);
        click(btnLogin);
    }
}
