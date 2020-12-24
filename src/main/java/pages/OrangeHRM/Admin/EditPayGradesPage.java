package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPayGradesPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewPayGrades']")
    WebElement goPayGrade;

    @FindBy(xpath = "//tbody/tr[4]/td[4]")
    WebElement goEdit;

    @FindBy(xpath = "//button[contains(text(),'Assign currency')]")
    WebElement assignCurrency;

    @FindBy(xpath = "//body/div[@id='modal1']/form[1]/div[1]/div[1]/materializecss-decorator[1]/div[1]/sf-decorator[1]/div[1]/div[1]/input[1]")
    WebElement currency;

    @FindBy(xpath = "//span[contains(text(),'EUR - Euro')]")
    WebElement selectEuro;

    @FindBy(xpath = "//input[@id='minSalary']")
    WebElement minSalaryTxt;

    @FindBy(xpath = "//input[@id='maxSalary']")
    WebElement maxSalaryTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public EditPayGradesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void EditPayGrade(String minSalary, String maxSalary) {
        click(goPayGrade);
        click(goEdit);
        click(assignCurrency);
        click(currency);
        click(selectEuro);
        sendKey(minSalaryTxt,minSalary);
        sendKey(maxSalaryTxt,maxSalary);
        click(btnSave);
    }

}
