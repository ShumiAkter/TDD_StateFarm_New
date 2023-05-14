package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class Claims  {
	
	WebDriver driver;

	public Claims(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "(//span[text()='Claims'])[2]")
	WebElement claims;
	
	@FindBy(xpath = "//a[text()='Roadside Assistance']")
	//((//*[@class='-oneX-link--block '])[3]
	 
	WebElement rodesideA;
	@FindBy(xpath = "//a[@class='-oneX-btn-primary__anchor']")
	WebElement assistance;
	
	
	public void clickClaim() {
		click(claims);
	}
	public void clickRoadside() {
		click(rodesideA);
}
	public void clickAssistance() {
		waitUntilClickable(assistance);
		click(assistance);
}
}