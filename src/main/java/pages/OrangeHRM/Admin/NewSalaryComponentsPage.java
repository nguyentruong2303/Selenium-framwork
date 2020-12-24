package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewSalaryComponentsPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewSalaryComponentList']")
    WebElement goSalaryComponent;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='name']")
    WebElement componentNameTxt;

    @FindBy(xpath = "//label[contains(text(),'Earning')]")
    WebElement rdEarning;

    @FindBy(xpath = "//label[contains(text(),'Deduction')]")
    WebElement rdDeduction;

    @FindBy(xpath = "//label[contains(text(),'Total Payable')]")
    WebElement totalPayable;

    @FindBy(xpath = "//label[contains(text(),'Cost to Company')]")
    WebElement costToCompany;

    @FindBy(xpath = "//label[contains(text(),'Amount')]")
    WebElement amount;

    @FindBy(xpath = "//label[contains(text(),'Percentage')]")
    WebElement percentage;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public NewSalaryComponentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void NewSalaryComponents(String componentName){
        click(goSalaryComponent);
        click(btnAdd);
        sendKey(componentNameTxt,componentName);
        click(rdEarning);
        click(totalPayable);
        click(costToCompany);
        click(percentage);
        click(btnSave);


    }
}
