package tests.Dbank;

import base.BasePage;
import contants.Constants;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Dbank.LoginDBankPage;
import pages.Dbank.NewSavingsPage;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
@Listeners(listeners.TestAllureListener.class)
public class NewSavingsTest {
    public WebDriver driver;
    public BasePage basePage;
    public LoginDBankPage loginDBankPage;
    public Properties prop;
    public NewSavingsPage newSavingsPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();

        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        loginDBankPage = new LoginDBankPage(driver);
        newSavingsPage = new NewSavingsPage(driver);
    }

    @Test(priority = 0, description = "Verify New Savings")
    @Severity(SeverityLevel.NORMAL)
    @Description("TestCase Description : Verify New Savings ")
    public void NewSavingsCorrect() throws IOException, ParseException {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        loginDBankPage.LoginDBank("truong922946@gmail.com", "Truong922946");
        newSavingsPage.NewSavings("Nguyen Van Truong","2500");
       Assert.assertTrue(true);
    }
    @Test(priority = 0, description = "Verify New Savings")
    @Severity(SeverityLevel.NORMAL)
    @Description("TestCase Description : Verify New Savings ")
    public void NewSavingsInCorrect() throws IOException, ParseException {
        loginDBankPage.LoginDBank("truong922946@gmail.com", "Truong922946");
        newSavingsPage.NewSavings("Nguyen Van Truong","21");
        String title = driver.findElement(By.xpath("//strong[contains(text(),'New Savings Account')]")).getText();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(Constants.NEWSAVINGS_UNSUCCESSFULLY, title);
        Assert.assertTrue(false);
    }
}
