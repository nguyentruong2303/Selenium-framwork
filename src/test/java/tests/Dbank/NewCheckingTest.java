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
import pages.Dbank.NewCheckingPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class NewCheckingTest {
    //String account = "Nguyen Van Truong";
    public BasePage basePage;
    public WebDriver driver;
    public NewCheckingPage newCheckingPage;
    public Properties prop;
    public LoginDBankPage loginDBankPage;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        newCheckingPage = new NewCheckingPage(driver);
        loginDBankPage = new LoginDBankPage(driver);

    }

    @Test(priority = 0,description = "Verify New Checking in Checking")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description : Verify New Checking")
    public void NewCheckingCorrectTest() {
        loginDBankPage.LoginDBank("truong922946@gmail.com","Truong922946");
        newCheckingPage.NewChecking("Nguyen Van Truong","250000");
        //String title = driver.findElement(By.xpath("//body/div[@id='right-panel']/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]")).getText();
        Assert.assertTrue(true);
    }

    @Test(priority = 0,description = "Verify New Checking in Checking")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test Case Description : Verify New Checking")
    public void NewCheckingInCorrectTest() {
        loginDBankPage.LoginDBank("truong922946@gmail.com","Truong922946");
        newCheckingPage.NewChecking("Nguyen Van Truong","20");
        Assert.assertTrue(false);
    }


}
