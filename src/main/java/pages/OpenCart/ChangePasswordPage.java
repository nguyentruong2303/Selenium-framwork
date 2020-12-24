package pages.OpenCart;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Change your password')]")
    WebElement changePasswordLink;

    @FindBy(xpath = "//input[@id='input-password']")
    WebElement passwordTxt;

    @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement confirmPasswordTxt;

    @FindBy(xpath = "//body/div[@id='account-password']/div[1]/div[1]/form[1]/div[1]/div[2]/input[1]")
    WebElement btnContinue;


    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ChangePassword(String password, String confirmPassword) {
        click(changePasswordLink);
        sendKey(passwordTxt,password);
        sendKey(confirmPasswordTxt,confirmPassword);
        click(btnContinue);
    }
}
