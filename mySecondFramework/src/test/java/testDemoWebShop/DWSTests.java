package testDemoWebShop;

import org.testng.annotations.Test;

import frameworkClasses.BasePage;
import pageObjectsDemoWebShop.DWSBasePage;
import pageObjectsDemoWebShop.DWSLandingPage;

public class DWSTests extends BasePage{
	DWSLandingPage DWSLP = new DWSLandingPage();
	DWSBasePage DWSBG = new DWSBasePage();
	
	@Test
	public void DWSBaseTest() throws InterruptedException {
		
		DWSBG.NavigateToHomePage();
		Thread.sleep(5000);
		DWSLP.clickBooks();
	}
}
