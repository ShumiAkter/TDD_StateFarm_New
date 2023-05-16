package allTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class FailedTest extends TestBase {
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
		
		Assert.fail();
	}

}
