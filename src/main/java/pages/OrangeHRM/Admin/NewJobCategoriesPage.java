package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewJobCategoriesPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_jobCategory']")
    WebElement goJobCategory;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public NewJobCategoriesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewJobCategories(String name) {
        click(goJobCategory);
        click(btnAdd);
        sendKey(nameTxt,name);
        click(btnSave);
    }
}
