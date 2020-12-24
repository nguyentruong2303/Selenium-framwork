package pages.OpenCartAdmin.Catalog;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCategoryGeneralPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[1]")
    WebElement btnNewCategory;

    @FindBy(xpath = "//input[@id='input-name1']")
    WebElement categoryNameTxt;

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]")
    WebElement descriptionTxt;

    @FindBy(xpath = "//input[@id='input-meta-title1']")
    WebElement tagTitleTxt;

    @FindBy(xpath = "//textarea[@id='input-meta-description1']")
    WebElement tagDescriptionTxt;

    @FindBy(xpath = "//textarea[@id='input-meta-keyword1']")
    WebElement tagKeyWordTxt;

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/button[1]")
    WebElement btnSave;

    public NewCategoryGeneralPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewCateGoryGeneral(String name, String description, String title,String tagDescription,String keyWord) {
        click(btnNewCategory);
        sendKey(categoryNameTxt,name);
        sendKey(descriptionTxt,description);
        sendKey(tagTitleTxt,title);
        sendKey(tagDescriptionTxt,tagDescription);
        sendKey(tagKeyWordTxt,keyWord);
        click(btnSave);
    }
}
