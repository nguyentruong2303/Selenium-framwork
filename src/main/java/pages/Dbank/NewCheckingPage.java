package pages.Dbank;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCheckingPage extends BasePage {

    @FindBy(xpath = "//body/aside[@id='left-panel']/nav[1]/div[2]/ul[1]/li[2]/a[1]")
    WebElement navigateChecking;

    @FindBy(xpath = "//a[contains(text(),'New Checking')]")
    WebElement navigateNewChecking;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/label[1]")
    WebElement standard;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/label[2]")
    WebElement interest;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/label[1]")
    WebElement individual;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/label[2]")
    WebElement joint;

    @FindBy(xpath = "//input[@id='name']")
    WebElement xAccount;

    @FindBy(xpath = "//input[@id='openingBalance']")
    WebElement xBalance;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement btnSubmit;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
    WebElement btnReset;

    public NewCheckingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void NewChecking(String account, String balance) {
        navigateChecking.click();
        navigateNewChecking.click();
        standard.click();
        individual.click();
        xAccount.sendKeys(account);
        xBalance.sendKeys(balance);
        btnReset.click();
    }
}
