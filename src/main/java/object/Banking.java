package object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class Banking {
	
	WebDriver driver;

	public Banking(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//span[text()='Banking']")
	WebElement banking;
	
	@FindBy(xpath = "//a[text()='Checking']")
WebElement check;
	
	@FindBy(css  = ".-oneX-typography-variant4.-w_mb-16.-w_mb-xl-24.-w_pr-xl-30")
	WebElement title;
	
	@FindBy(xpath = "(//a[@class='-oneX-btn-secondary__anchor'])[1]")
	WebElement usBank;
	
	@FindBy(xpath = "(//button[@id='submit'])[1]")
	WebElement continueAG;
	
	public void clickBankinf() {
		click(banking);
	}
	public void clickChecking() {
		waitUntilClickable(check);
		click(check);
		
	}
	public void validitionTitle(String expected) {
		Assert.assertEquals(getInnerHTML(title), expected);
	}
		public void clickUSBank(WebDriver driver) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", usBank);
		}
		
		public void clickContinueAsAGuest() {
			click(continueAG);
		}
}
