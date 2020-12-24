package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewJobTitlePage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewJobTitleList']")
    WebElement goJobTitle;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='jobTitleName']")
    WebElement jobTitleNameTxt;

    @FindBy(xpath = "//textarea[@id='jobDescription']")
    WebElement jobDescriptionTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public NewJobTitlePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewJobTitle(String jobTitleName, String jobDescription) {
        click(goJobTitle);
        click(btnAdd);
        sendKey(jobTitleNameTxt,jobTitleName);
        sendKey(jobDescriptionTxt,jobDescription);
        click(btnSave);
    }
}
