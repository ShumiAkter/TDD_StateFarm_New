package AllTest;

import org.testng.annotations.Test;
import base.TestBase;

public class BankingTest extends TestBase {
	@Test
	public void bankingTest() {
		branking.clickBankinf();
		branking.clickChecking();
		branking.validitionTitle("Get set today with an easy to use checking account");
		branking.clickUSBank(driver);
		branking.clickContinueAsAGuest();

		
	}
}
