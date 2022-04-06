package testsTakealot;

import org.testng.annotations.Test;

import pageObjectsTakealot.CartPage;
import pageObjectsTakealot.DealsPage;
import pageObjectsTakealot.LandingPage;

public class Tests {

	//Instantiate Pages
	LandingPage landPG = new LandingPage();
	DealsPage dealsPG = new DealsPage();
	CartPage cartPG = new CartPage();
	
	
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


}
