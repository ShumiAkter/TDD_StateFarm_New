package object;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonAction.*;
import static common.CommonWaits.*;

public class PayBill {

	WebDriver driver;

	public PayBill(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text()='Pay a Bill']")
	WebElement paybil;

	@FindBy(id = "pay-a-bill-paymentSelect")
	WebElement payUsing;

	@FindBy(id = "pay-a-bill-phoneNo")
	WebElement phoneNumber;

	@FindBy(id = "pay-a-bill-DOB")
	WebElement birthday;

	@FindBy(id = "pay-a-bill-submitButton")
	WebElement payNOw;
	
	

	public void clickPayBill() {
		click(paybil);

	}

	public void selectPayUsing(String value) {
		waitUntilVisible(payUsing);
		dropdown(payUsing, value);

	}
	
	public void insertPhoneNUmber(String Phone) {
		insert(phoneNumber, Phone);
	}

	public void insertBirthday(String Birthday) {
		insert(birthday, Birthday);
	}

	public void clickPayNow() {
		waitUntilClickable(payNOw);
		click(payNOw);
	}
}
