package pages.OrangeHRM;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='txtUsername']")
    WebElement usernameTxt;

    @FindBy(xpath = "//input[@id='txtPassword']")
    WebElement passwordTxt;

    @FindBy(xpath = "//input[@id='btnLogin']")
    WebElement btnLogin;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Login(String username, String password) {
        clear(usernameTxt);
        sendKey(usernameTxt,username);
        clear(passwordTxt);
        sendKey(passwordTxt,password);
        click(btnLogin);
    }
}
