package object;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class GetAQuote {

	WebDriver driver;

	public GetAQuote(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "(//button[@class='-oneX-header-top-menu-btn '] )//span[text()='Get a Quote']")
	WebElement getquote;

	@FindBy(id = "getaquote-select-product")
	WebElement product;

	@FindBy(id = "getaquote-state-select")
	WebElement state;

	@FindBy(id = "getaQuoteButton")
	WebElement startAQuote;

	@FindBy(css = ".-oneX-btn-primary.-oneX-btn-large.startQuoteNow")
	WebElement startAQuoteNew;

	@FindBy(css = ".-oneX-heading--h5.insureQuestion")
	WebElement titlEle;

	@FindBy(id = "userBirthDate")
	WebElement dob;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextbutton;

	@FindBy(xpath = "(//button[@class='-oneX-btn-auto-advance-selector'] )[2]")
	WebElement gender;

	public void clickGetAQuote() {
		click(getquote);
	}

	public void selectProduct(String expected) {
		dropdown(product, expected);
	}

	public void selectState(String expected) {
		dropdown(state, expected);
	}

	public void clickStartAQuote() {
		click(startAQuote);

	}

	public void clickStartAQuoteNew(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitUntilClickable(startAQuoteNew);
		js.executeScript("arguments[0].click()", startAQuoteNew);

	}

	public void validationTitle(String titlevalue) {
		Assert.assertEquals(getInnerHTML(titlEle), titlevalue);
	}

	public void selectIsInsureYou(String ensureYou) {
		if (ensureYou.equalsIgnoreCase("Yes")) {
			driver.findElement(By.xpath("(//button[@class='-oneX-btn-auto-advance-selector'])[1]")).click();
		}

	}

	public void insertDOB(String DOB) {
		insert(dob, DOB);

	}

	public void clickNextButton() {
		click(nextbutton);
	}

	public void clickNextGender() {
		waitUntilVisible(gender);
		click(gender);
		/*
		 * public void selectGender(String Gender) { if (Gender.
		 * equalsIgnoreCase("Female")) { driver.findElement(By.
		 * xpath("(//button[@class='-oneX-btn-auto-advance-selector'] )[2]")).click(); }
		 * }
		 */
	}
}
