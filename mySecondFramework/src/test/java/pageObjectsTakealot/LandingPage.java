package pageObjectsTakealot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;

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
	
	//Check Cart Summary
	public boolean cartSummary(String checkCount) {
		String itemElement = getElementText(By.cssSelector(".badge-button-module_badge-button-outer_1gN1K"));
		System.out.println(getElementText(By.cssSelector(itemElement)));
		System.out.println(checkCount);
		
		if(getElementText(By.cssSelector(itemElement)).contains(checkCount))
		{
			Reporter.log("Amount Correct " + checkCount);
			Reporter.log("Text is " + getElementText(By.cssSelector(itemElement)));

			return true;
		}
		Reporter.log("Amount inCorrect " + checkCount);
		Reporter.log("Text is " + getElementText(By.cssSelector(itemElement)));

		return false;
	}
	
}
