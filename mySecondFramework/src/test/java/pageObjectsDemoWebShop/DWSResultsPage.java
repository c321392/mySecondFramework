package pageObjectsDemoWebShop;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class DWSResultsPage extends BasePage{

	//Select first Item
	public void clickAddToCart() {
		clickElement(By.cssSelector(
				"div:nth-of-type(1) > .product-item input[value='Add to cart']"));
		
	}
}
