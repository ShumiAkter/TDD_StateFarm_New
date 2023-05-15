package misc;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LinearScripting {
	WebDriver driver;

	@BeforeMethod
	public void  beforeEachTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // It will take time to load to open Url Page.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // It will take time load to find the webelement ( by it self)


	}

	@Test

	public void testCvsClamOverview() {

	driver.get("https://www.cvs.com/");
	WebElement element = driver.findElement(By.id("sec1-link2"));
	String titleString = element.getAttribute("innerHTML");
	System.out.println(titleString);

	}
	@AfterMethod
	public void closingBrower() {
		driver.quit();
	}
}





