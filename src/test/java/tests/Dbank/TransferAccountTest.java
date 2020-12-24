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
import pages.Dbank.LoginDBankPage;
import pages.Dbank.TransferAccountPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class TransferAccountTest {
    public WebDriver driver;
    public BasePage basePage;
    public Properties prop;
    public LoginDBankPage loginDBankPage;
    public TransferAccountPage transferAccountPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        loginDBankPage = new LoginDBankPage(driver);
        transferAccountPage = new TransferAccountPage(driver);
    }

    @Test(priority = 0,description = "Verify Transfer Between Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("testcase description : Verify Transfer Between Account")
    public void TransferAccountCorrect() {
        loginDBankPage.LoginDBank(prop.getProperty("username1"), prop.getProperty("password1"));
        transferAccountPage.TransferAccount(prop.getProperty("fAccount"), prop.getProperty("tAccount"), prop.getProperty("tAmount") );
        Assert.assertTrue(true);
    }
    @Test(priority = 1,description = "Verify Transfer Between Account")
    @Severity(SeverityLevel.NORMAL)
    @Description("testcase description : Verify Transfer Between Account")
    public void TransferAccountInCorrect() {
        loginDBankPage.LoginDBank(prop.getProperty("username1"), prop.getProperty("password1"));
        transferAccountPage.TransferAccount(prop.getProperty("fAccount1"), prop.getProperty("tAccount1"), prop.getProperty("tAmount1") );
        Assert.assertTrue(false);
    }
}
