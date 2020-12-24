package pages.phpTravel;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAndBookFightPage extends BasePage {

    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement goHome;

    @FindBy(xpath = "//a[contains(text(),'Flights')]")
    WebElement goFlight;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
    WebElement fromTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]")
    WebElement toTxt;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[4]/button[1]")
    WebElement btnSearch;

    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/button[1]")
    WebElement btnBooking;

    @FindBy(xpath = "//input[@id='passenger_name_0']")
    WebElement passengerNameTxt;

    @FindBy(xpath = "//input[@id='passenger_age_0']")
    WebElement passengerAgeTxt;

    @FindBy(xpath = "//input[@id='passenger_passport_0']")
    WebElement passportTxt;

    @FindBy(xpath = "//button[contains(text(),'CONFIRM THIS BOOKING')]")
    WebElement btnConfirmBooking;


    public SearchAndBookFightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void SearchAndBooking(String from, String to,String name, String age, String passport) {
        click(goHome);
        click(goFlight);
        click(fromTxt);
        sendKey(fromTxt,from);
        click(toTxt);
        sendKey(toTxt,to);
        click(btnSearch);
        click(btnBooking);
        sendKey(passengerNameTxt,name);
        sendKey(passengerAgeTxt,age);
        sendKey(passportTxt,passport);
        click(btnConfirmBooking);
    }
}
