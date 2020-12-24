package pages.OpenCartAdmin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='input-username']")
    WebElement usernameTxt;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTxt;

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[3]/button[1]")
    WebElement btnLogin;

    @FindBy(xpath = "//a[contains(text(),'Forgotten Password')]")
    WebElement goForgottenPassword;

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
