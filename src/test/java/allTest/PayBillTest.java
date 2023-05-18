package allTest;

import org.testng.annotations.Test;

import base.TestBase;

public class PayBillTest extends TestBase {
	@Test
	public void getBillTest() {
		payBill.clickPayBill();
		payBill.selectPayUsing("Phone Number");
		payBill.insertPhoneNUmber("6462507944");
		payBill.insertBirthday("10202020");
		payBill.clickPayNow();

	}

}
