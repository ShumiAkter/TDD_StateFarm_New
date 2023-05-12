package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;
import static common.CommonAction.*;

public class Insurance {
	
	WebDriver driver;
	public Insurance(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//button[@data-for=\"insurance\"]")
	WebElement  titlea;
	
	public void validationTitle(String titleaValue) {
		//Assert.assertEquals(titlea, titleaValue);
		click(titlea); 
		//getInnerHTML(titlea);	
	}
	
	
	
	
	

}
