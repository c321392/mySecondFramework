package testsTakealot;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkClasses.BasePage;
import frameworkClasses.ReadExcel;
import pageObjectsTakealot.BasePageTakealot;
import pageObjectsTakealot.CartPage;
import pageObjectsTakealot.DealsPage;
import pageObjectsTakealot.ItemPage;
import pageObjectsTakealot.LandingPage;
import pageObjectsTakealot.ResultsPage;
import pageObjectsTakealot.SearchResultsPage;
import pageObjectsTakealot.WishListPage;

public class testTakealotSmall {
	//Instantiate Pages
	BasePage basePG = new BasePage();
	LandingPage landPG = new LandingPage();
	DealsPage dealsPG = new DealsPage();
	CartPage cartPG = new CartPage();
	BasePageTakealot baseTakePG = new BasePageTakealot();
	ResultsPage resultsPG = new ResultsPage();
	ItemPage itemPG = new ItemPage();
	SearchResultsPage searchResultsPG = new SearchResultsPage();
	SoftAssert softAssertion = new SoftAssert();
	WishListPage wishPG = new WishListPage();
	ReadExcel rExcel = new ReadExcel();

	@BeforeTest
		public void setUp() {
		baseTakePG.ClickCookiesButton();
	}
	
	@Test
	public void smallTest() {
		System.out.println("Success");
	}
}
