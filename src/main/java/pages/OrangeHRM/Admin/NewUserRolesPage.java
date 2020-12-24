package pages.OrangeHRM.Admin;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUserRolesPage extends BasePage {

    @FindBy(xpath = "//a[@id='menu_admin_viewUserRoles']")
    WebElement goUserRoles;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement btnAdd;

    @FindBy(xpath = "//input[@id='user_role_name']")
    WebElement userRoleNameTxt;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[3]/div[1]/label[1]")
    WebElement AddEmployee;

    @FindBy(xpath = "//label[contains(text(),'Terminate Employment')]")
    WebElement terminateEmployment;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[1]/label[1]")
    WebElement leave;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[2]/label[1]")
    WebElement time;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[3]/label[1]")
    WebElement attendance;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[4]/label[1]")
    WebElement candidate;

    @FindBy(xpath = "//label[contains(text(),'Vacancy')]")
    WebElement vacancy;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[6]/label[1]")
    WebElement onBoardingTask;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[7]/label[1]")
    WebElement onBoardingEvent;

    @FindBy(xpath = "//label[contains(text(),'Performance - Appraisals')]")
    WebElement appraisals;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[9]/label[1]")
    WebElement goals;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[10]/label[1]")
    WebElement discipline;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[11]/label[1]")
    WebElement asset;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[12]/label[1]")
    WebElement expenseClaim;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[4]/div[13]/label[1]")
    WebElement travelRequest;

    @FindBy(xpath = "//label[contains(text(),'Succession and Development - Individual Developmen')]")
    WebElement succession;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[1]/div[1]/p[1]/label[1]")
    WebElement acceptAdmin;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[2]/div[1]/p[1]/label[1]")
    WebElement advancedTrain;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[3]/div[1]/p[1]/label[1]")
    WebElement checkAsset;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[4]/div[1]/p[1]/label[1]")
    WebElement checkDiscipline;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[5]/div[1]/p[1]/label[1]")
    WebElement checkLeave;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[6]/div[1]/p[1]/label[1]")
    WebElement checkMaintenance;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[7]/div[1]/p[1]/label[1]")
    WebElement checkOnboarding;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[8]/div[1]/p[1]/label[1]")
    WebElement checkPerformance;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[9]/div[1]/p[1]/label[1]")
    WebElement PIM;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[10]/div[1]/p[1]/label[1]")
    WebElement recruitment;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[11]/div[1]/p[1]/label[1]")
    WebElement reportCatalog;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[12]/div[1]/p[1]/label[1]")
    WebElement successionDevelopment;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[13]/div[1]/p[1]/label[1]")
    WebElement checkTime;

    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/div[1]/div[2]/section[1]/div[2]/ui-view[1]/div[1]/div[1]/form[1]/div[5]/ul[1]/li[14]/div[1]/p[1]/label[1]")
    WebElement travelAndExpense;

    @FindBy(xpath = "//a[contains(text(),'Save')]")
    WebElement btnSave;


    public NewUserRolesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void NewUserRole(String userRoleName) {
        click(goUserRoles);
        click(btnAdd);
        sendKey(userRoleNameTxt,userRoleName);
        click(AddEmployee);
        click(terminateEmployment);
        click(leave);
        click(time);
        click(attendance);
        click(candidate);
        click(vacancy);
        click(onBoardingTask);
        click(onBoardingEvent);
        click(appraisals);
        click(goals);
        click(discipline);
        click(asset);
        click(expenseClaim);
        click(travelAndExpense);
        click(travelRequest);
        click(succession);
        click(acceptAdmin);
        click(advancedTrain);
        click(checkAsset); click(checkDiscipline); click(checkLeave); click(checkMaintenance); click(checkPerformance);
        click(checkOnboarding); click(PIM); click(recruitment); click(reportCatalog); click(successionDevelopment);
        click(checkTime); click(btnSave);
    }
}
