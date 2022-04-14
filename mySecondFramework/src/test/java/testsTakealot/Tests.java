package testsTakealot;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjectsTakealot.BasePageTakealot;
import pageObjectsTakealot.CartPage;
import pageObjectsTakealot.DealsPage;
import pageObjectsTakealot.ItemPage;
import pageObjectsTakealot.LandingPage;
import pageObjectsTakealot.ResultsPage;
import pageObjectsTakealot.SearchResultsPage;

public class Tests {

	//Instantiate Pages
	LandingPage landPG = new LandingPage();
	DealsPage dealsPG = new DealsPage();
	CartPage cartPG = new CartPage();
	BasePageTakealot baseTakePG = new BasePageTakealot();
	ResultsPage resultsPG = new ResultsPage();
	ItemPage itemPG = new ItemPage();
	SearchResultsPage searchResultsPG = new SearchResultsPage();
	
	@BeforeTest
		public void setUp() {
		baseTakePG.ClickCookiesButton();
	}
	
	@Test 
	 public void GIVEN_ShopperOnLandingPage_WHEN_selectDailyDeals_THEN_DailyScreenOpen_AND_PhillipsAirfryerFirstItemDislayed() {
		//  GIVEN
		//		Given the shopper is on the Landing page
		//	WHEN
		//		He selects daily deals
		//	THEN
		//		The Daily deals URL
		//	AND
		//		First displayed item is Phillips XXL Airfryer
		//
		//	GIVEN_ShopperOnLandingPage_WHEN_selectDailyDeals_THEN_DailyScreenOpen_AND_PhillipsAirfryerFirstItemDislayed(){
		//	landPG.checkLandingPageNavigation();
		//	landPG.selectItem(“DailyDeals”);
		//	dealsPG.checkURL(“Takealot/deals”);
		//	dealsPG.checkFirstItem(“PhillipAirFryer”);
		//	}
	}
	
	@Test
	public void GIVEN_ShooperOnLandingPage_WHEN_SearchforDKNY_AND_CleckOnSearch_THEN_FirstItemDKNY() {
		
		//  GIVEN
		//		Given the shopper is on the Landing page
		//	WHEN
		//		He search for DKNY
		//  AND 
		//      Click on Search
		//	THEN
		//		The first item returned id DKNY
		//
		//	GIVEN_ShooperOnLandingPage_WHEN_SearchforDKNY_AND_CleckOnSearch_THEN_FirstItemDKNY(){
		//	landPG.checkLandingPageNavigation();
		//	landPG.searchFor(“DKNY”);
		//	landPG.clickOnSearch();
		//	landPG.checkFirstItem(“DKNY”);
		//	}

		
	}
	
	/*2
	* GIVEN the shopper is on the landing page
	* WHEN he enters "DKNY" as the search string
	* WHEN clicks the search button
	* THEN "DKNY" is displayed as the first item in the grid
	*/
	@Test
	public void GIVEN_shopperIsOnTheLandingPage_WHEN_ShopperENtersDKNY_AND_ShopperclicksthesearchButton_THEN_DKNYBeDelicois50ml() {
		baseTakePG.NavigateToHomePage();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar("DKNY");
		landPG.clickOnSearchButton();
		searchResultsPG.clickFirstItem();
		searchResultsPG.SwitchToNewTab();
		//resultsPG.getElementTextofFirstItem();
		String theText = resultsPG.getElementTextofFirstItem();
		System.out.println("Print the Text" + " " + theText );
	}

}
