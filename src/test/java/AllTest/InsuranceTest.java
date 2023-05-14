package AllTest;

import org.testng.annotations.Test;

import base.TestBase;

public class InsuranceTest extends TestBase {

	@Test
	public void insuranceTest() {
		insurance.clickInsurance("Insurance");
		insurance.clickMotorcycle();
		//insurance.validationTitle("Motorcycle insurance");
		insurance.insertZipcode("19082");
		insurance.clickFindAAgent();
		insurance.validationTitleFind("Find a State Farm Agent Near You");
		insurance.clickSearchButton();
	
	}
}
