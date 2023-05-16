package allTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;

public class ParameterizedLogINTest extends TestBase {
	@Parameters({ "title", "phoneNumber", " dayOfBirth", "email" })
	@Test
	public void getLogInTest(String title, String phoneNumber, String dateOfBirth, String email) {

		logIn.clickCreatAccount();
		logIn.validationtitle(title); // Title getting chnage base on the time.For  example Good morning,Good eveing,  Good
										// night
		logIn.insertPhoneNumber(phoneNumber);
		logIn.insertBirthday(dateOfBirth);
		logIn.insertEmailAddress(email);
		logIn.clickContinue();

	}

}
