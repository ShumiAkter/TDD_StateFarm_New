package AllTest;

import org.testng.annotations.Test;
import base.TestBase;

public class AutoTest extends TestBase {

	@Test
	public void getA_Quote() throws InterruptedException {
		homePage.getTitlevalidation("Create an affordable price, just for you");
		homePage.productClick();
		homePage.insertZipcodeclick("19082");
		homePage.startAquoteClick();
		personalPricePlan.quoteTileValidation();
		personalPricePlan.insertFirstName("Shumi");
		personalPricePlan.insertMiddleName("R");
		personalPricePlan.insertLastName("Akter");
		personalPricePlan.selectSuffix("Jr");
		personalPricePlan.insertAddress("7120 sellers Ave");
		personalPricePlan.insertAparment("2nd");
		personalPricePlan.insertDateOfBirth("10201978");
		personalPricePlan.clickCheckBox(driver);
		personalPricePlan.clickContinueButon();
		vehicles.validationvehiclestitle("Vehicles");
		vehicles.validationTitle("Add up to 4 vehicles");
		vehicles.clickaddAVehicleBtn();
		vehicles.selectYear("2020");
		vehicles.validationVinTitle("Please provide make, model and body style, or Vehicle Identification Number (VIN).");
		vehicles.selectMake("BMW");
		vehicles.selectmodel("M2");
		vehicles.selectbodyStyle("COMPETITION 2D CPE GAS");
		vehicles.clickAddButton(driver);
		System.out.println("................. Auto Test Complete........................");
		
		

	}

}
