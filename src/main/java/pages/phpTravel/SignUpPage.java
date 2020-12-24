package pages.phpTravel;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/a[1]")
    WebElement myAccount;

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/a[2]")
    WebElement startSignUp;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[1]/div[1]/label[1]/input[1]")
    WebElement firstNameTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/label[1]/input[1]")
    WebElement lastNameTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/input[1]")
    WebElement phoneTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/input[1]")
    WebElement emailTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/input[1]")
    WebElement passWordTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[7]/label[1]/input[1]")
    WebElement confirmPWTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[8]/button[1]")
    WebElement btnSignUp;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void SignUp(String firstName, String lastName, String phone, String email, String passWord, String confirmPassword) {
        click(myAccount);
        click(startSignUp);
        sendKey(firstNameTxt,firstName);
        sendKey(lastNameTxt,lastName);
        sendKey(phoneTxt,phone);
        sendKey(emailTxt,email);
        sendKey(passWordTxt,passWord);
        sendKey(confirmPWTxt,confirmPassword);
        click(btnSignUp);
    }
}
