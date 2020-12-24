package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCostCentersPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewCostCentreList']")
    WebElement goCostCenter;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='cost_code']")
    WebElement costIdTxt;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameTxt;

    @FindBy(xpath = "//textarea[@id='description']")
    WebElement descriptionTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public NewCostCentersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewCostCenter(String costId, String name, String description) {
        click(goCostCenter);
        click(btnAdd);
        sendKey(costIdTxt,costId);
        sendKey(nameTxt,name);
        sendKey(descriptionTxt,description);
        click(btnSave);
    }

}
