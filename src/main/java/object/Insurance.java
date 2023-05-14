package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class Insurance {

	WebDriver driver;

	public Insurance(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//button[@data-for='insurance']//span[text()='Insurance']")
	WebElement insurace;

	@FindBy(xpath = "//a[text()='Motorcycle']")
	WebElement motorcycletile;

	@FindBy(xpath = "//h1[text()='Motorcycle insurance']")
	WebElement title;

	@FindBy(id = "callout-agent-zip-code-input1")
	WebElement zipcodFld;

	@FindBy(id = "quote-main-zip-code-button1")
	WebElement agent;

	@FindBy(className = "-oneX-heading--h1")
	WebElement titleFind;

	@FindBy(id = "search")
	WebElement searchButton;
	

	public void clickInsurance(String titleaValue) {
		click(insurace);
	}

	public void clickMotorcycle() {
		click(motorcycletile);
	}

	public void validationTitle(String expected) {
		Assert.assertEquals(getInnerHTML(insurace), expected);
	}

	public void insertZipcode(String zipcode) {
		insert(zipcodFld, zipcode);
	}

	public void clickFindAAgent() {
		click(agent);
	}

	public void validationTitleFind(String findtitle) {
		Assert.assertEquals(getInnerHTML(titleFind), findtitle);
	}

	public void clickSearchButton() {
		click(searchButton);
	}
}
