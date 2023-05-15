package AllTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import base.TestBase;

public class ParameterizedTest extends TestBase {
	
@Parameters ({"title", "zipcode", "firstName",  "middleName",  "lastName", "suffix", "address",  "apartment", "dateOfBirth"}) 
	@Test
	public void getAutoTest(String title,  String zipcode,  String firstName,  String middleName, String lastName, String suffix, String address, String apartment, String dateOfBirth) {
		
		homePage.getTitlevalidation(title);
		homePage.productClick();
		homePage.insertZipcodeclick(zipcode);
		homePage.startAquoteClick();
		personalPricePlan.quoteTileValidation();
		personalPricePlan.insertFirstName(firstName);
		personalPricePlan.insertMiddleName(middleName);
		personalPricePlan.insertLastName(lastName);
		personalPricePlan.selectSuffix(suffix);
		personalPricePlan.insertAddress(address);
		personalPricePlan.insertAparment(apartment);
		personalPricePlan.insertDateOfBirth(dateOfBirth);
	
}
}
