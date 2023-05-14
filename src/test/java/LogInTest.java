import org.testng.annotations.Test;

import base.TestBase;

public class LogInTest extends TestBase{


	@Test
	public void logInTest() {
		logIn.clickLogInbt();
		logIn.clickCreatAccount();
		logIn.validationtitle("Good evening!");
		logIn.insertPhoneNumber("1234567788");
		logIn.insertBirthday("10202000");
		logIn.insertEmailAddress("ShumiA1235@gmail.com");
		logIn. clickContinue();
	}
}
