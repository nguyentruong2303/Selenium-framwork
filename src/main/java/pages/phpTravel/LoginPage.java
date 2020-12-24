package pages.phpTravel;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")
    WebElement myAccount;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[1]")
    WebElement startLogin;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/label[1]/input[1]")
    WebElement emailTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[2]/label[1]/input[1]")
    WebElement passwordTxt;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btnLogin;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Login(String email, String password) {
        click(myAccount);
        click(startLogin);
        sendKey(emailTxt,email);
        sendKey(passwordTxt,password);
        click(btnLogin);
    }
}
