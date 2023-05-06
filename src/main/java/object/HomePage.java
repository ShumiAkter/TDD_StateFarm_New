package object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonAction;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[text() = 'Get care from a provider']")
	WebElement textFromElement;

	public void getProvidertextvalidation() {
		String getProvider = CommonAction.getInnerHTML(textFromElement);
		System.out.println(getProvider);

	}

}
