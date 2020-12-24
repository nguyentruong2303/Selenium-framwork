package pages.Dbank;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewSavingsPage extends BasePage {

    @FindBy(xpath = "//a[@id='savings-menu']")
    WebElement savingMenu;

    @FindBy(xpath = "//a[@id='new-savings-menu-option']")
    WebElement newSavings;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/label[1]")
    WebElement savings;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/label[2]")
    WebElement moneyMarket;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/label[1]")
    WebElement individual;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/label[2]")
    WebElement joint;

    @FindBy(xpath = "//input[@id='name']")
    WebElement xAccountName;

    @FindBy(xpath = "//input[@id='openingBalance']")
    WebElement xBalance;

    @FindBy(xpath = "//button[@id='newSavingsSubmit']")
    WebElement btnSubmit;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
    WebElement btnReset;

    public NewSavingsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewSavings(String accountName, String balance) {
        savingMenu.click();
        newSavings.click();
        savings.click();
        individual.click();
        xAccountName.sendKeys(accountName);
        xBalance.sendKeys(balance);
        btnSubmit.click();
    }

}
