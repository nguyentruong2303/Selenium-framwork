package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.TestUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

	public WebDriver driver;
	public Properties prop;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	TestUtil util = new TestUtil();
	public WebDriver initialize_driver() {

		System.setProperty("webdriver.chrome.driver", "/Users/baemin/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		tdriver.set(driver);
		return getDriver();
	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}
	
	public Properties initialize_Properties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("/Users/baemin/Downloads/Selenium-framwork/"
					+ "src/main/java/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return prop;
	}

	public String getScreenshot() {
		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
		String path = System.getProperty("user.dir") + "/screenshots/" + System.currentTimeMillis() + ".png";
		File destination = new File(path);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			System.out.println("Capture Failed " + e.getMessage());
		}
		return path;
	}
	public void waitForVisibility(WebElement e) {
		WebDriverWait wait = new WebDriverWait(getDriver(),util.WAIT);
		wait.until(ExpectedConditions.visibilityOf(e));
	}
	public void hoverandclick(WebDriver driver, WebElement elementToHover, WebElement elementToClick) {
		waitForVisibility(elementToHover);
		Actions actions = new Actions(driver);
		actions.moveToElement(elementToHover).moveToElement(elementToClick).click().perform();
	}

	public void clear(WebElement e) {
		waitForVisibility(e);
		e.clear();
	}
	public void click(WebElement e) {
		waitForVisibility(e);
		e.click();
	}
	public void sendKey(WebElement e, String txt) {
		waitForVisibility(e);
		e.sendKeys(txt);
	}
	public void scrollToElement() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void closeApp(){
		getDriver().close();
	}


}
