package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.testng.Assert.*;
import static org.openqa.selenium.support.PageFactory.*;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class HomePage {

	public HomePage(WebDriver driver) {
		initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//*[text()='Create an affordable price, just for you']")
	WebElement title;

	@FindBy(name = "productName")
	WebElement product;

	@FindBy(id = "quote-main-zip-code-input")
	WebElement zipCodeField;

	@FindBy(id = "quote-main-zip-btn")
	WebElement quote;

	public void getTitlevalidation(String expected) {
		assertEquals(getInnerHTML(title), expected);
	}

	public void productClick() {
		click(product);
	}

	public void insertZipcodeclick(String zip) {
		waitUntilVisible(zipCodeField);
		insert(zipCodeField, zip);
	}

	public void startAquoteClick() {
	waitUntilClickable(quote);
		click(quote);
	}

}
