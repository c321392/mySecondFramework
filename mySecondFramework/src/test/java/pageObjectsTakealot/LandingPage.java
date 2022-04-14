package pageObjectsTakealot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import frameworkClasses.BasePage;

public class LandingPage  extends BasePage {

	
	//	landPG.checkLandingPageNavigation();
	//	landPG.selectItem(“DailyDeals”);
	//	dealsPG.checkURL(“Takealot/deals”);
	//	dealsPG.checkFirstItem(“PhillipAirFryer”);

	public boolean checkLandingPageNavigation() {
		return false;
		
	}
	
	public void selectItem(String selectItem) {
		
	}
	

	
	//	landPG.searchFor(“DKNY”);
	//	landPG.clickOnSearch();
	//	landPG.checkFirstItem(“DKNY”);
	
	public void searchFor(String searcFor) {
		
	}
	
	public void clickOnSearchButton() {
		clickElement(By.cssSelector("button[type='submit']"));
	}
	
	public boolean checkFirstItem(String checkFirstItem) {
		return false;
	}
	
	public void clickSearchBar() {
		clickElement(By.name("search"));
		
	}
	
	public void clickElement(By pLocator) {
		waitforClick(30,pLocator);
		getElement(pLocator).click();
	}
	
	//Enter text in Search Bar
	public void enterTextInSearchBar(String EnterTextInSearchBar) {
		enterText(By.name("search"), EnterTextInSearchBar);
		
	}
	
//	//Check First Item Element Text
//	public String checkElementTextofFirstItem() {
//		String text1 = getElementText(By.cssSelector(
//				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
//		return text1;
//	}
//	
	public void clickElementTextofFirstItem() {
		clickElement(By.className(null));
	}
}
