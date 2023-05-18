package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class Investments {
	
	WebDriver driver;

	public Investments(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//*[text()='Investments']")
	WebElement title;
	
	@FindBy(id = "oneX-0-investments")
	WebElement service;
	
	//@FindBy(className  = "-oneX-typography-variant4")
	//WebElement stateFarmTitle;
	
	@FindBy(id = "mf-account-login-dropdown")
	WebElement type;
	
	@FindBy(xpath = "(//*[@class='-oneX-btn-primary'])[3]")
	WebElement logIn;
	
	
	
	public void clicktitle() {
		click(title);
	}
	public void clickInvestmentsService() {
		click(service);
		
}
	/*
	public void validationTitle(String expected) {
		waitUntilVisible(stateFarmTitle);
		Assert.assertEquals(getInnerHTML(stateFarmTitle), expected);
	}
	*/
	public void selectAccountType(String typeValue) {
		waitUntilVisible(type);
		dropdown(type, typeValue);
	}
	public void clickLogInButton() {
		click(logIn);
	}

	}

