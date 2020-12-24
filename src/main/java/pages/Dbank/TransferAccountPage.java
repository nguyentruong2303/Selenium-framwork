package pages.Dbank;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferAccountPage extends BasePage {

    @FindBy(xpath = "//body/aside[@id='left-panel']/nav[1]/div[2]/ul[1]/li[6]/a[1]")
    WebElement transfer;

    @FindBy(xpath = "//a[contains(text(),'Between Accounts')]")
    WebElement betweenAccount;

    @FindBy(xpath = "//select[@id='fromAccount']")
    WebElement xFromAccount;

    @FindBy(xpath = "//select[@id='toAccount']")
    WebElement xToAccount;

    @FindBy(xpath = "//input[@id='amount']")
    WebElement xAmount;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[1]")
    WebElement btnSubmit;

    @FindBy(xpath = "//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/button[2]")
    WebElement btnReset;
    public TransferAccountPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void TransferAccount(String fAccount, String tAccount, String amount) {
        transfer.click();
        betweenAccount.click();
        Select select = new Select(xFromAccount);
        select.selectByVisibleText(fAccount);
        Select select1 = new Select(xToAccount);
        select1.selectByVisibleText(tAccount);
        xAmount.sendKeys(amount);
        btnSubmit.click();
    }
}
