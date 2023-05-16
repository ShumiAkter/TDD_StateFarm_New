package allTest;

import org.testng.annotations.Test;
import base.TestBase;

public class ClaimsTest extends TestBase {

	@Test
	public void clamimsTest() {
		claims.clickClaim();
		claims.clickRoadsideA();
		claims.clickAssistance();
		claims.getTitlevalidation("ROADSIDE ASSISTANCE");
		claims.clickQuestion();

	}
}
