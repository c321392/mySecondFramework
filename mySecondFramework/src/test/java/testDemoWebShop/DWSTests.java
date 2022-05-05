package testDemoWebShop;

import org.testng.annotations.Test;

import frameworkClasses.BasePage;
import pageObjectsDemoWebShop.DWSBasePage;
import pageObjectsDemoWebShop.DWSLandingPage;
import pageObjectsDemoWebShop.DWSResultsPage;

public class DWSTests extends BasePage{
	DWSLandingPage DWSLP = new DWSLandingPage();
	DWSBasePage DWSBG = new DWSBasePage();
	DWSResultsPage DWSRP = new DWSResultsPage();
	
	@Test
	public void DWSBaseTest() throws InterruptedException {
		
		DWSBG.NavigateToHomePage();
		Thread.sleep(5000);
		DWSLP.clickBooks();
		DWSRP.clickAddToCart();
	}
}
