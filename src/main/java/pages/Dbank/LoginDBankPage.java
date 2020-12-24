package pages.Dbank;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginDBankPage extends BasePage {

    @FindBy(xpath = "//input[@id='username']")
    WebElement xUsername;

    @FindBy(xpath = "//input[@id='password']")
    WebElement xPassword;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement loginButton;

    @FindBy(xpath = "//a[contains(text(),'Sign Up Here')]")
    WebElement signUpLink;

    public LoginDBankPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @Step("login with username: {0} and password : {1} step...")
    public void LoginDBank(String strUsername, String strPassword) {
        xUsername.sendKeys(strUsername);
        xPassword.sendKeys(strPassword);
        loginButton.click();
    }

}
