package object;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonWaits.*;
import static common.CommonAction.*;
import org.testng.Assert;

public class Claims  {
	
	WebDriver driver;

	public Claims(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//span[text()='Claims'])[2]")
	WebElement claims;
	
	
	@FindBy(xpath = "//a[text()='Roadside Assistance']") 
	WebElement rodesideA;
		
	@FindBy(xpath = "(//a[text()='Get Roadside Assistance'])[2]")
	WebElement assistance;
		
	
	@FindBy(id = "landing-main-heading")
	WebElement title;
	
	@FindBy(id = "tag-faq")
	WebElement question;
	

	
	public void clickClaim() {
		click(claims);
	}
	public void clickRoadsideA() {
		//waitUntilClickable(rodesideA);
		//click(rodesideA);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//waitUntilClickable(addButton);
		js.executeScript("arguments[0].click()", rodesideA);
}
	
	public void clickAssistance() {
		waitUntilClickable(assistance);
		click(assistance);
}
	public void getTitlevalidation(String titlevalue) {
		Assert. assertEquals(getInnerHTML(title), titlevalue);
	}
	public void clickQuestion() {
		click(question);
	}
}