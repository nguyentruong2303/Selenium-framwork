package pages.Dbank;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DepositPage extends BasePage {

    @FindBy(xpath = "//body/aside[@id='left-panel']/nav[1]/div[2]/ul[1]/li[4]/a[1]")
    WebElement transactions;

    @FindBy(xpath = "//a[contains(text(),'Deposit')]")
    WebElement deposit;

    @FindBy(xpath = "//select[@id='id']")
    WebElement xAccount;

    @FindBy(xpath = "//input[@id='amount']")
    WebElement xAmount;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement btnSubmit;

    @FindBy(xpath = "//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
    WebElement btnReset;

    public DepositPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void Deposit(String account, String amount) {
        transactions.click();
        deposit.click();
        Select select = new Select(xAccount);
        select.selectByVisibleText(account);
        xAmount.sendKeys(amount);
        btnSubmit.click();
    }

}
