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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Dbank.SignUpPage;
import testdata.JsonDataReader;

import java.io.IOException;
import java.util.Properties;

@Listeners(listeners.TestAllureListener.class)
public class SignUpTest {
    public WebDriver driver;
    public BasePage basePage;
    public SignUpPage signUpPage;
    public Properties prop;

    @BeforeMethod
    public void setup() {
        basePage = new BasePage();
        prop = basePage.initialize_Properties();
        driver = basePage.initialize_driver();
        driver.get(prop.getProperty("url"));
        signUpPage = new SignUpPage(driver);
    }

    @Test(priority = 0,description = "verify sign up test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test case description : Verify sign up ")
    public void SignUpCorrect() throws IOException, ParseException {
        JsonDataReader jsonDataReader = new JsonDataReader();
        jsonDataReader.JsonReader();
        signUpPage.Register(jsonDataReader.Title, jsonDataReader.FirstName, jsonDataReader.FirstName, jsonDataReader.Dob,
                jsonDataReader.Ssn, jsonDataReader.Email, jsonDataReader.Password, jsonDataReader.ConfirmPW, jsonDataReader.Address,
                jsonDataReader.Locality, jsonDataReader.Region, jsonDataReader.PostalCode, jsonDataReader.Country, jsonDataReader.HomePhone, jsonDataReader.MobilePhone,
                jsonDataReader.WorkPhone);
        String title = driver.findElement(By.xpath("//span[contains(text(),'Registration Successful. Please Login.')]")).getText();
        Assert.assertEquals(title, Constants.SIGNUP_SUCCESSFULLY);
    }
    @Test(priority = 1,description = "verify sign up test")
    @Severity(SeverityLevel.NORMAL)
    @Description("Test case description : Verify sign up ")
    public void SignUpInCorrect() throws IOException, ParseException {
        JsonDataReader jsonDataReader = new JsonDataReader();
        jsonDataReader.JsonReader();
        signUpPage.Register(prop.getProperty("Title"), prop.getProperty("FirstName"), prop.getProperty("FirstName"),
                prop.getProperty("Dob"), prop.getProperty("Ssn"), prop.getProperty("Email"), prop.getProperty("Password"),
                prop.getProperty("ConfirmPW"), prop.getProperty("Address"), prop.getProperty("Locality"), prop.getProperty("Region"),
                prop.getProperty("PostalCode"), prop.getProperty("Country"), prop.getProperty("HomePhone"),
                prop.getProperty("MobilePhone"), prop.getProperty("WorkPhone"));
        String title = driver.findElement(By.xpath("//span[contains(text(),'Registration Successful. Please Login.')]")).getText();
        Assert.assertEquals(title, Constants.SIGNUP_SUCCESSFULLY);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
