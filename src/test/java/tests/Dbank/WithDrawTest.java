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
import pages.Dbank.WithdrawPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class WithDrawTest {
    public WebDriver driver;
    public BasePage basePage;
    public Properties prop;
    public WithdrawPage withdrawPage;
    public LoginDBankPage loginDBankPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        loginDBankPage = new LoginDBankPage(driver);
        withdrawPage = new WithdrawPage(driver);
    }

    @Test(priority = 0,description = "Verify WithDraw in Transaction")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify WithDraw in Transactions")
    public void WithDrawCorrect() {
        loginDBankPage.LoginDBank(prop.getProperty("username1"), prop.getProperty("password1"));
        withdrawPage.WithDraw(prop.getProperty("accountWithdraw"), prop.getProperty("amountWithdraw") );
        Assert.assertTrue(true);
    }

    @Test(priority = 0,description = "Verify WithDraw in Transaction")
    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase Description : Verify WithDraw in Transactions")
    public void WithDrawInCorrect() {
        loginDBankPage.LoginDBank(prop.getProperty("username1"), prop.getProperty("password1"));
        withdrawPage.WithDraw(prop.getProperty("accountWithdraw1"), prop.getProperty("amountWithdraw1") );
        Assert.assertTrue(false);
    }
}
