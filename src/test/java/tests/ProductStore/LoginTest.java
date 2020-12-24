package tests.ProductStore;

import base.BasePage;
import data.ReadFromCSV;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ProductStore.LoginPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

@Listeners(listeners.TestAllureListener.class)
public class LoginTest {
    BasePage basePage;
    Properties props;
    LoginPage loginPage;
    WebDriver driver;
    int i;
    static String ROOT = System.getProperty("user.dir");
    String fileLocation = ROOT + "/src/test/java/data/data.csv";

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlProductStore"));
        loginPage = new LoginPage(driver);

    }

    @Test(priority = 1, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login")
    public void invalidUserNameLogin() {
        loginPage.Login(ReadFromCSV.readFromCsv(fileLocation,1,i),ReadFromCSV.readFromCsv(fileLocation,1,i));
        Assert.assertTrue(false);
    }

    @Test(priority = 0, description = "Login Website")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Verify login")
    public void SuccessfulLogin() {
        loginPage.Login(ReadFromCSV.readFromCsv(fileLocation,0,i),ReadFromCSV.readFromCsv(fileLocation,1,i));
        Assert.assertTrue(true);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
//    @AfterMethod
//    public void afterMethod() {
//        driver.quit();
//    }
}
