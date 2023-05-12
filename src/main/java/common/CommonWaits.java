package common;

//import static util.Key.explicitWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static utils.Key_Constant.*;
import utils.Configuration;

public class CommonWaits {

	static WebDriverWait wait;
	static Configuration configu = new Configuration();

	public static void init(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(configu.getPropN(explicitWait.name())));
	}

	public static void waitUntilVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitUntilClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
