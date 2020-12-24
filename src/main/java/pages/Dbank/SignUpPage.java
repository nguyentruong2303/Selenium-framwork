package pages.Dbank;

import base.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Sign Up Here')]")
    WebElement navigateSignUp;

    @FindBy(xpath = "//select[@id='title']")
    WebElement xTitle;

    @FindBy(xpath = "//input[@id='firstName']")
    WebElement xFirstName;

    @FindBy(xpath = "//input[@id='lastName']")
    WebElement xLastName;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/label[1]/input[1]")
    WebElement xMale;

    @FindBy(xpath = "//body/div[1]/div[1]/div[1]/div[2]/form[1]/div[5]/label[2]/input[1]")
    WebElement xFemale;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement xDob;

    @FindBy(xpath = "//input[@id='ssn']")
    WebElement xSsn;

    @FindBy(xpath = "//input[@id='emailAddress']")
    WebElement xEmail;

    @FindBy(xpath = "//input[@id='password']")
    WebElement xPassword;

    @FindBy(xpath = "//input[@id='confirmPassword']")
    WebElement xConfirmPW;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    WebElement btnNext;

    @FindBy(xpath = "//input[@id='address']")
    WebElement xAddress;

    @FindBy(xpath = "//input[@id='locality']")
    WebElement xLocality;

    @FindBy(xpath = "//input[@id='region']")
    WebElement xRegion;

    @FindBy(xpath = "//input[@id='postalCode']")
    WebElement xPostalCode;

    @FindBy(xpath = "//input[@id='country']")
    WebElement xCountry;

    @FindBy(xpath = "//input[@id='homePhone']")
    WebElement xHomePhone;

    @FindBy(xpath = "//input[@id='mobilePhone']")
    WebElement xMobilePhone;

    @FindBy(xpath = "//input[@id='workPhone']")
    WebElement xWorkPhone;

    @FindBy(xpath = "//input[@id='agree-terms']")
    WebElement xAgreeTerm;

    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement btnRegister;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Step("Register step ....")
    public void Register(String Title, String FirstName, String LastName, String Dob, String Ssn,
                         String Email, String Password,String ConfirmPW, String Address,
                         String Locality, String Region, String PostalCode, String Country,
                         String HomePhone, String MobilePhone, String WorkPhone){
        navigateSignUp.click();
        Select select = new Select(xTitle);
        select.selectByVisibleText(Title);
        xFirstName.sendKeys(FirstName);
        xLastName.sendKeys(LastName);
        xMale.click();
        xDob.sendKeys(Dob);
        xSsn.sendKeys(Ssn);
        xEmail.sendKeys(Email);
        xPassword.sendKeys(Password);
        xConfirmPW.sendKeys(ConfirmPW);
        btnNext.click();
        xAddress.sendKeys(Address);
        xLocality.sendKeys(Locality);
        xRegion.sendKeys(Region);
        xPostalCode.sendKeys(PostalCode);
        xCountry.sendKeys(Country);
        xHomePhone.sendKeys(HomePhone);
        xMobilePhone.sendKeys(MobilePhone);
        xWorkPhone.sendKeys(WorkPhone);
        xAgreeTerm.click();
        btnRegister.click();
    }
}
