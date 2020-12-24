package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditJobTitlePage extends BasePage {
    @FindBy(xpath = "//a[@id='menu_admin_viewJobTitleList']")
    WebElement goJobTitle;

    @FindBy(xpath = "//span[contains(text(),'COO')]")
    WebElement goCOO;

    @FindBy(xpath = "//input[@id='jobTitleName']")
    WebElement jobTitleNameTxt;

    @FindBy(xpath = "//textarea[@id='jobDescription']")
    WebElement jobDescriptionTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;


    public EditJobTitlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void EditJobTitle(String jobTitleName, String jobDescription) {
        click(goJobTitle);
        click(goCOO);
        clear(jobTitleNameTxt);
        sendKey(jobTitleNameTxt,jobTitleName);
        clear(jobDescriptionTxt);
        sendKey(jobDescriptionTxt,jobDescription);
        click(btnSave);
    }
}
