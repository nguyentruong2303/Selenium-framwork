package tests.Dbank;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Dbank.DepositPage;
import pages.Dbank.LoginDBankPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class DepositTest {
    public WebDriver driver;
    public BasePage basePage;
    public LoginDBankPage loginDBankPage;
    public DepositPage depositPage;
    public Properties prop;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        loginDBankPage = new LoginDBankPage(driver);
        depositPage = new DepositPage(driver);
    }
    @Test(priority = 0,description = "Verify Test Deposit in Transaction")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Deposit in Transaction")
    public void DepositCorrect() {
        loginDBankPage.LoginDBank(prop.getProperty("username1"),prop.getProperty("password1"));
        depositPage.Deposit(prop.getProperty("account"),prop.getProperty("amount"));
        Assert.assertTrue(true);
    }
    @Test(priority = 0,description = "Verify Test Deposit in Transaction")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify Deposit in Transaction")
    public void DepositInCorrect() {
        loginDBankPage.LoginDBank(prop.getProperty("username1"),prop.getProperty("password1"));
        depositPage.Deposit(prop.getProperty("account1"),prop.getProperty("amount1"));
        Assert.assertTrue(false);
    }
}
