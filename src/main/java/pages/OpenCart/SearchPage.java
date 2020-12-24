package pages.OpenCart;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/input[1]")
    WebElement formSearchTxt;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
    WebElement btnSearch;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void Search(String keyword) {
        sendKey(formSearchTxt, keyword);
        click(btnSearch);
    }
}
