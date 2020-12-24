package pages.ProductStore;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//a[@id='login2']")
    WebElement startLogin;
    @FindBy(xpath = "//input[@id='loginusername']")
    WebElement usernameTxt;
    @FindBy(xpath = "//input[@id='loginpassword']")
    WebElement passwordTxt;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Login(String username, String password) {
        click(startLogin);
        sendKey(usernameTxt,username);
        sendKey(passwordTxt,password);
        click(btnLogin);
    }
}
