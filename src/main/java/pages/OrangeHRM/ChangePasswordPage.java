package pages.OrangeHRM;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePasswordPage extends BasePage {

    @FindBy(xpath = "//a[@id='user-dropdown']")
    WebElement linkAccount;

    @FindBy(xpath = "//a[contains(text(),'Change Password')]")
    WebElement linkChangePassword;

    @FindBy(xpath = "//input[@id='currentPassword']")
    WebElement currentPWTxt;

    @FindBy(xpath = "//input[@id='newPassword']")
    WebElement newPWTxt;

    @FindBy(xpath = "//input[@id='confirmNewPassword']")
    WebElement confirmNewPWTxt;

    @FindBy(xpath = "//a[@id='systemUserSaveBtn']")
    WebElement SaveBtn;


    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ChangePassword(String currentPW, String newPW, String confirmPW) {
        click(linkAccount);
        click(linkChangePassword);
        sendKey(currentPWTxt,currentPW);
        sendKey(newPWTxt,newPW);
        sendKey(confirmNewPWTxt,confirmPW);
        click(SaveBtn);
    }
}
