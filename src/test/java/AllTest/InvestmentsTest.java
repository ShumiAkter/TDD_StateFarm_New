package AllTest;

import org.testng.annotations.Test;

import base.TestBase;

public class InvestmentsTest extends TestBase {
	@Test
	public void getInvestmentsTest() {
		investments.clicktitle();
		investments.clickInvestmentsService();
		//investments.validationTitle("State Farm Investment Services");
		investments.selectAccountType("State Farm Brokerage Account");
		investments.clickLogInButton();
		
	}

}
