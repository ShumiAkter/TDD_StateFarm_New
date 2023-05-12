package object;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static common.CommonWaits.*;
import static common.CommonAction.*;

public class Vehicles {

	WebDriver driver;

	public Vehicles(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		init(driver);

	}

	@FindBy(xpath = "//h1[text()='Vehicles']")
	WebElement vehiclestitle;

	@FindBy(id = "h3Title")
	WebElement title;

	@FindBy(id = "addVehicleButton")
	WebElement addAVehicle;

	@FindBy(id = "btnContinue")
	WebElement nextDrivers;

	@FindBy(xpath = "//select[@id='sfx_vehicles[0].motorVehicle.ymmb.year_input']")
	WebElement year;

	@FindBy(xpath = "//*[text()='Please provide make, model and body style, or Vehicle Identification Number (VIN).']")
	WebElement vinTitl;

	@FindBy(xpath = "//select[@id='sfx_vehicles[0].motorVehicle.ymmb.make_input']")
	WebElement make;

	@FindBy(xpath = "//select[@id='sfx_vehicles[0].motorVehicle.ymmb.model_input']")
	WebElement model;

	@FindBy(xpath = "//select[@id='sfx_vehicles[0].motorVehicle.ymmb.bodyStyle_input']")
	WebElement bodyStyle;

	@FindBy(id = "sfx_add-veh-step[0]_Add_btn_input")
	WebElement addButton;

	public void validationvehiclestitle(String expected) {
		assertEquals(getInnerHTML(vehiclestitle), expected);
	}

	public void validationTitle(String expected) {
		waitUntilVisible(title);
		assertEquals(getText(title), expected);
	}

	public void clickaddAVehicleBtn() {
		waitUntilClickable(addAVehicle);
		click(addAVehicle);

	}

	public void clickNextDriverBtn() {
		click(nextDrivers);
	}

	public void selectYear(String yearvalue) {
		dropdown(year, yearvalue);
	}

	public void validationVinTitle(String expected) {
		waitUntilVisible(vinTitl);
		assertEquals(getInnerHTML(vinTitl), expected);

	}

	public void selectMake(String makervalue) {
		dropdown(make, makervalue);
	}

	public void selectmodel(String modelvalue) {
		waitUntilVisible(model);
		dropdown(model, modelvalue);
	}

	public void selectbodyStyle(String bodyStylevalue) {
		waitUntilVisible(bodyStyle);
		dropdown(bodyStyle, bodyStylevalue);
	}

	public void clickAddButton(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		waitUntilClickable(addButton);
		js.executeScript("arguments[0].click()", addButton);

	}
}
