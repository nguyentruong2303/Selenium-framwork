package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage extends BasePage {

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/a[1]")
    WebElement linkAdmin;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement userManagement;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement linkJob;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement linkOrganization;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement linkCompetencies;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement linkQualifications;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement linkNationalities;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement linkAnnouncements;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[8]/a[1]")
    WebElement linkConfiguration;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/ul[1]/li[1]/div[1]/ul[1]/li[9]/a[1]")
    WebElement linkAudit;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void UserManagement() {
        click(linkAdmin);
        click(userManagement);
    }
    public void Job() {
        click(linkAdmin);
        click(linkJob);
    }
    public void Organization() {
        click(linkAdmin);
        click(linkOrganization);
    }
    public void Competencies() {
        click(linkAdmin);
        click(linkCompetencies);
    }
    public void Qualifications() {
        click(linkAdmin);
        click(linkQualifications);
    }
    public void Nationalities() {
        click(linkAdmin);
        click(linkNationalities);
    }
    public void Announcements() {
        click(linkAdmin);
        click(linkAnnouncements);
    }
    public void Configuration() {
        click(linkAdmin);
        click(linkConfiguration);
    }
    public void Audit() {
        click(linkAdmin);
        click(linkAudit);
    }
}
