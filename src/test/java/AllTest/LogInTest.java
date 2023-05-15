package AllTest;
import org.testng.annotations.Test;
import base.TestBase;

public class LogInTest extends TestBase{


	@Test
	public void logInTest() {
		logIn.clickLogInbt();
		logIn.clickCreatAccount();
	//	logIn.validationtitle("Good night!"); //it chnage base on the time. example Good morning!, Good afternoon!, Good eveing,  Good night 
		logIn.insertPhoneNumber("1234567788");
		logIn.insertBirthday("10202000");
		logIn.insertEmailAddress("ShumiA1235@gmail.com");
		logIn. clickContinue();
	}
	
}
