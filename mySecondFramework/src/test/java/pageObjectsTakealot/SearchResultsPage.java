package pageObjectsTakealot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class SearchResultsPage  extends BasePage{

	//Click on First Item 
	public void clickFirstItem() {
		clickElement(By.cssSelector(
				"div:nth-of-type(2) > .grid.search-product  .product-anchor.product-card-module_product-anchor_TUCBV"));
		
	}


}
