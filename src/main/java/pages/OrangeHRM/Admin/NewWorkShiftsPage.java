package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewWorkShiftsPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_workShift']")
    WebElement goWorkShift;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='name']")
    WebElement nameTxt;

    @FindBy(xpath = "//input[@id='start_time']")
    WebElement startTimeTxt;

    @FindBy(xpath = "//input[@id='end_time']")
    WebElement endTimeTxt;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;

    public NewWorkShiftsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void NewWordShift(String name, String startTime, String endTime) {
        click(goWorkShift);
        click(btnAdd);
        sendKey(nameTxt,name);
        clear(startTimeTxt);
        sendKey(startTimeTxt,startTime);
        clear(endTimeTxt);
        sendKey(endTimeTxt,endTime);
        click(btnSave);
    }
}
