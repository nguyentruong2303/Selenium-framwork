package pages.ProductStore;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//a[@id='signin2']")
    WebElement startSignUp;

    @FindBy(xpath = "//input[@id='sign-username']")
    WebElement usernameTxt;

    @FindBy(xpath = "//input[@id='sign-password']")
    WebElement passwordTxt;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    WebElement btnSignUp;


    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SignUp(String username, String password) {
        click(startSignUp);
        sendKey(usernameTxt,username);
        sendKey(passwordTxt,password);
        click(btnSignUp);
    }
}
