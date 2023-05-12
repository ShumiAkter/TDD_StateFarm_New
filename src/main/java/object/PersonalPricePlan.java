package object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import  static common.CommonWaits.*;
import static common.CommonAction.*;

public class PersonalPricePlan {

	public PersonalPricePlan(WebDriver driver) {
		PageFactory.initElements(driver, this);
		init(driver);
	}

	@FindBy(xpath = "//h1[@class='-oneX-heading--h1 -oneX-font--bold margin0']")
	WebElement title;

	@FindBy(id = "first_name")
	WebElement firstName;

	@FindBy(id = "middle_name")
	WebElement middleName;

	@FindBy(id = "last_name")
	WebElement lastNam;

	@FindBy(id = "suffix_name")
	WebElement suffix;

	@FindBy(id = "street1")
	WebElement address;

	@FindBy(id = "street2")
	WebElement apartment;

	@FindBy(id = "date_of_birth")
	WebElement birthday;

	@FindBy(xpath  = "//input[@id='termsIDCheckbox']")
	WebElement checkbox;

	@FindBy(id = "btnContinue")
	WebElement continueButton;

	public void quoteTileValidation() {
		getInnerHTML(title);
	}

	public void insertFirstName(String expected) {
		insert(firstName, expected);
	}

	public void insertMiddleName(String middleNameNvalue) {
		insert(middleName, middleNameNvalue);
	}

	public void insertLastName(String lastNameNvalue) {
		insert(lastNam, lastNameNvalue);
	}

	public void selectSuffix(String suffixValue) {
		dropdown(suffix, suffixValue);
	}

	public void insertAddress(String addressAvalue) {
		insert(address, addressAvalue);
	}

	public void insertAparment(String aptvalue) {
		insert(apartment, aptvalue);
	}

	public void insertDateOfBirth(String DOB) {
		insert(birthday, DOB);

	}

	public void clickCheckBox(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitUntilClickable(checkbox);
		js.executeScript("arguments[0].click()", checkbox);
	}

	public void clickContinueButon() {
		waitUntilClickable(continueButton);
		click(continueButton);
	}
}
