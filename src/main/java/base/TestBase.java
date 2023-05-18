package base;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import com.aventstack.extentreports.Status;
import io.github.bonigarcia.wdm.WebDriverManager;
import object.Insurance;
import object.Investments;
import object.LogIn;
import object.PayBill;
import object.Banking;
import object.Claims;
import object.GetAQuote;
import object.HomePage;
import object.PersonalPricePlan;
import object.Vehicles;
import reporting.ExtentReport;
//import utils.Browser;
import utils.Configuration;
import utils.Key_Constant;
import static utils.Key_Constant.*;
import static utils.Browser.*;

public class TestBase  extends ExtentReportListner{

	protected WebDriver driver;
	protected HomePage homePage;
	protected PersonalPricePlan personalPricePlan;
	protected Vehicles vehicles;
	protected Insurance insurance;
	protected Banking branking;
	protected Investments investments;
	protected GetAQuote getAQuote;
	protected Claims claims;
	protected LogIn logIn;
	protected PayBill payBill;
	Configuration configuration = new Configuration();

	@Parameters("browser")
	@BeforeMethod
	public void beforeEachTest(@Optional("chrome") String browserName) {
		// String browserName = configuration.getProp(getValue(Key_Constant.browser));
		initiatDriver(browserName);
		initObject();
		driver.manage().window().maximize();
		int pageLoadTime = configuration.getPropN(getValue(pageLoad));
		int implicitLoadTime = configuration.getPropN(getValue(implicitLoad));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime)); // It will take time to load to open Url Page.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitLoadTime)); // It will take time load to find the webelement ( by it self)
		String url = configuration.getProp("url");
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

	protected void initObject() {
		homePage = new HomePage(driver);
		personalPricePlan = new PersonalPricePlan(driver);
		vehicles = new Vehicles(driver);
		insurance = new Insurance(driver);
		branking = new Banking(driver);
		investments = new Investments(driver);
		getAQuote = new GetAQuote(driver);
		claims = new Claims(driver);
		logIn = new LogIn(driver);
		payBill = new PayBill(driver);

	}
	private String getStackTrace(Throwable t) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		t.printStackTrace(pw);
		return sw.toString();
	}
	
	@AfterMethod
	public void aftereEachTest(ITestResult result, Method method) {
		for(String group : result.getMethod().getGroups()) {
			ExtentReport.getTest().assignCategory(group);
		}
		
		if(result.getStatus() == ITestResult.SUCCESS) {
			ExtentReport.getTest().log(Status.INFO, "Test Passed");
		}else if(result.getStatus() == ITestResult.SKIP) {
			ExtentReport.getTest().log(Status.SKIP, "Test Skipped");
		}else if(result.getStatus() == ITestResult.FAILURE) {
			ExtentReport.getTest().log(Status.FAIL, "Test Failed");
			ExtentReport.getTest().log(Status.FAIL, getStackTrace(result.getThrowable()));
			ExtentReport.getTest().addScreenCaptureFromPath(captureScreenShot(method, driver));
		}
	}

	@AfterMethod
	public void closingBrower() {
		driver.quit();
	}

	public String getValue(Key_Constant key_Constant) {
		return key_Constant.name();
	}

	/*
	 * public String getbrowser(Browser browser_Constant) { return browser.name(); }
	 */
}
