package tests.Dbank;

import base.BasePage;
import contants.Constants;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Dbank.LoginDBankPage;

import java.io.IOException;
import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class LoginDBankTest {
    public BasePage basePage;
    public WebDriver driver;
    public Properties prop;
    public LoginDBankPage loginDBankPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        loginDBankPage = new LoginDBankPage(driver);
    }

//    @Test(priority = 0,description = "verifying title page login")
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test case Description : Verify title login on login page")
//    @Story("Story Name: To check title login page")
//    public void verifyTitlePageLogin() {
//        String title = driver.getTitle();
//        System.out.println("The login page title is :" + title);
//        Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
//
//      //  Assert.assertTrue(loginDBankPage.VerifySignUpLink());
//    }
//    @Test(priority = 1,description = "verifying sign up link test")
//    @Severity(SeverityLevel.NORMAL)
//    @Description("Test case Description : Verify sign up link test on login page")
//    @Story("Story Name: To check sign up link")
//    public void verifySignUpLinkText() {
//        Assert.assertTrue(loginDBankPage.VerifySignUpLink());
//    }

    @Test(priority = 0,description = "login into app test")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test case description : Verify login into application with correct credentials")
    @Story("Story Name : To check login functionality")
    public void loginCorrectCredentialTest() throws IOException, ParseException {
        loginDBankPage.LoginDBank(prop.getProperty("username1"),prop.getProperty("password1"));
        String title = driver.findElement(By.xpath("//li[contains(text(),'Welcome truong')]")).getText();
        Assert.assertEquals(title,Constants.LOGIN_SUCCESSFULLY);
    }

    @Test(priority = 1,description = "login into app test")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Test case description : Verify login into application with correct credentials")
    @Story("Story Name : To check login functionality")
    public void loginInCorrectCredentialTest() throws IOException, ParseException {

        loginDBankPage.LoginDBank(prop.getProperty("username"),prop.getProperty("password"));
        String title = driver.findElement(By.xpath("//li[contains(text(),'Welcome truong')]")).getText();
        Assert.assertEquals(title,Constants.LOGIN_SUCCESSFULLY);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
