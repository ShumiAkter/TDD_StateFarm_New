package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import object.HomePage;
import utils.Browser;
import utils.Configuration;
import utils.Key_Constant;
import static utils.Key_Constant.*;
import static utils.Browser.*;

public class TestBase {

	protected WebDriver driver;
	protected HomePage homePage;
	
	Configuration configuration = new Configuration();

	@BeforeMethod
	public void beforeEachTest() {
		String browserName = configuration.getProp(getValue(Key_Constant.browser));
		initiatDriver(browserName);
		initObject();
		driver.manage().window().maximize();
		int pageLoadTime  = configuration.getPropN(getValue(pageLoad));
		int implicitLoadTime = configuration.getPropN(getValue(implicitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // It will take time to load to open Url Page.														
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // It will take time load to find the webelement ( by it self)																		
		String url =configuration.getProp("url");
		driver.get(url);
	}

	public void initiatDriver(String browser) {
		switch (browser) {
		case FIREFOX:
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case SAFARI:
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();
			break;
		case CHROME:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case EDGE:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		}
		
	}
	public void initObject() {
		homePage = new HomePage(driver);
	}
		@AfterMethod
		public void closingBrower() {
			driver.quit();
		
	}
		public String getValue(Key_Constant key_Constant){
			return key_Constant.name();
			
		}
		public String getbrowser(Browser browser_Constant){
			return browser.name();
			
		
		}
}
