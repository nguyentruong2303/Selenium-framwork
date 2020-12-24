package pages.OpenCartAdmin.Catalog;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewCategoryDataPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/a[1]")
    WebElement btnNewCategory;

    @FindBy(xpath = "//a[contains(text(),'Data')]")
    WebElement goData;

    @FindBy(xpath = "//input[@id='input-parent']")
    WebElement parentTxt;

    @FindBy(xpath = "//input[@id='input-filter']")
    WebElement filterTxt;

    @FindBy(xpath = "//input[@id='input-top']")
    WebElement topCheck;

    @FindBy(xpath = "//input[@id='input-column']")
    WebElement columnTxt;

    @FindBy(xpath = "//input[@id='input-sort-order']")
    WebElement sortOrderTxt;

    @FindBy(xpath = "//body/div[@id='container']/div[@id='content']/div[1]/div[1]/div[1]/button[1]")
    WebElement btnSave;

    public NewCategoryDataPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewCategoryData(String parent, String filter, String column, String sortOrder) {
        click(btnNewCategory);
        click(goData);
        sendKey(parentTxt,parent);
        sendKey(filterTxt,filter);
        click(topCheck);
        clear(columnTxt);
        sendKey(columnTxt,column);
        clear(sortOrderTxt);
        sendKey(sortOrderTxt,sortOrder);
        click(btnSave);
    }
}
