package object;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class LogIn {
	
	WebDriver driver;

	public LogIn(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "//*[@class='-oneX-header-top-menu-btn']")
	WebElement loginbt;
	
	@FindBy(xpath = "(//*[@class='-oneX-link--block'])[3]")
	WebElement creatA;
	
	@FindBy(id = "TimeZoneGreeting")
	WebElement title;
	
	@FindBy(id = "inputphoneNumber")
	WebElement phoneN;
	
	@FindBy(id = "inputdateOfBirth")
	WebElement birthday;
	
	@FindBy(id = "inputemailAddress")
	WebElement emailA;
	
	@FindBy(id = "customer-search-submit")
	WebElement continuE;
	
	
	
	public void clickLogInbt() {
		click(loginbt);
}
	public void clickCreatAccount() {
		waitUntilClickable(creatA);
		click(creatA);
}
	public void validationtitle(String expected) {
		Assert. assertEquals(getInnerHTML(title), expected);
	}
	public void insertPhoneNumber(String PhoneNumber) {
		insert(phoneN, PhoneNumber);
	}
	public void insertBirthday(String DOB) {
		insert(birthday, DOB);
	}
	public void insertEmailAddress(String Email) {
		waitUntilVisible(emailA);
		insert(emailA, Email);
	}
	public void clickContinue() {
		waitUntilClickable(continuE);
		click(continuE);
}
}


