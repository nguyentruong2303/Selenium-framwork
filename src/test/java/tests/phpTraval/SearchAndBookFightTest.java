package tests.phpTraval;

import base.BasePage;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.phpTravel.LoginPage;
import pages.phpTravel.SearchAndBookFightPage;

import java.util.Properties;
@Listeners(listeners.TestAllureListener.class)
public class SearchAndBookFightTest {
    LoginPage loginPage;
    BasePage basePage;
    Properties props;
    WebDriver driver;
    SearchAndBookFightPage searchAndBookFightPage;

    @BeforeMethod
    public void beforeMethod() {
        basePage = new BasePage();
        props = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(props.getProperty("urlPhpTravel"));
        loginPage = new LoginPage(driver);
        searchAndBookFightPage = new SearchAndBookFightPage(driver);
        loginPage.Login(props.getProperty("Email"), props.getProperty("Password") );
    }

    @Test(priority = 0, description = "Search And Booking Fight on PhpTravel")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Testcase description : Search And Booking")
    public void SuccessfulSearchAndBooking() {
        searchAndBookFightPage.SearchAndBooking(props.getProperty("from"), props.getProperty("to"), props.getProperty("name"), props.getProperty("age"), props.getProperty("passport"));
        Assert.assertTrue(true);
    }
}
