package AllTest;

import org.testng.annotations.Test;

import base.TestBase;

public class GetAQuoteTest extends TestBase{
	@Test
	public void getAQuote() {
		
		getAQuote.clickGetAQuote();
		getAQuote.selectProduct("Life");
		getAQuote.selectState("NJ");
		getAQuote.clickStartAQuote();
		getAQuote.clickStartAQuoteNew(driver);
		getAQuote.validationTitle("Is this quote to insure you?");
		getAQuote.selectIsInsureYou("Yes");
		getAQuote.insertDOB("10202000");
		getAQuote.clickNextButton();
		getAQuote.clickNextGender();
	
	
		
		
	}

}
