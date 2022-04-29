package pageObjectsTakealot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class ResultsPage extends BasePage{

	//Check First Item Element Text
	public String getElementTextofFirstItem() {
		String text2 = getElementText(By.cssSelector(
				".title-content-list a"));
		return text2;
	}
	
	//Check First Item Element Text
	public String getElementTextofSecondItem() {
		String text1 = getElementText(By.cssSelector(
				"h1"));
		//h1[contains(text(),"TTP Women's Suede Ankle Polar Boots with Shoe Lace")]
		//h1[contains(text(),"TTP Women's Suede Ankle Polar Boots with Shoe Lace")]
		return text1;
	}
	
	//Add item selected to cart
	public void clickAddToCart() {
		clickElement(By.cssSelector(".buybox-actions-module_add-to-cart-cell_3fXyS [data-ref]"));
	}

	//Navigate to Cart
	public void clickGoToCart() {
		clickElement(By.cssSelector(".content-wrapper .checkout-now"));
	}
	
	public int getUnitPrice() {
		String unitPriceString = getElementText(By.cssSelector("[data-ref='buybox-price-main']"));
		//String unitPriceRStripped = unitPriceString.substring(2);
		//String unitPrice = unitPriceRStripped.replaceAll(",", "");
		String unitPrice = unitPriceString.replaceAll("\\D", "");
		int unitPriceInt = Integer.parseInt(unitPrice);
		return unitPriceInt;
	}
	
	//Add item selected to Wish List
	public void clickAddToWishList() {
		clickElement(By.cssSelector(".button.shade-gray.wishlist-button.wishlist-split-button-module_wishlist-button_36rqk > .wishlist-split-button-module_text_E0HQC"));
	}
	
	//Navigate to WishList	
	public void clickGoToWishList() {
		clickElement(By.cssSelector(".icon-link.top-nav-module_wishlist-button_mIJ0_.wish > svg[role='presentation'] > path"));
	}
	//Navigate to WishList	
	public void clickGoToWishListV() {
		clickElement(By.cssSelector(".icon-link.top-nav-module_wishlist-button_mIJ0_.wish > svg[role='presentation'] > path"));
	}
	
}
