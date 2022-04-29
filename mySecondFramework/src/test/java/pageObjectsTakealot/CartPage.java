package pageObjectsTakealot;

import org.openqa.selenium.By;
import org.testng.Reporter;

import frameworkClasses.BasePage;

public class CartPage  extends BasePage{

	public boolean checkCartCount(String checkCount) {
		String itemElement = ".cart-summary-module_cart-summary-item-count_3jkNC > span";
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
	
	public boolean checkCartIsEmpty() {
		String itemElement = "img[alt='Empty shopping cart']";
		if (driver.findElements(By.cssSelector(itemElement)).size() != 0) {
			System.out.println("Element Exist");
			Reporter.log("Element Exists " + itemElement);
			Reporter.log("Text is " + getElementText(By.cssSelector(itemElement)));
			return true;
		} else {
			System.out.println("Element does not Exist");
			Reporter.log("Element Exists " + itemElement);
			Reporter.log("Text is " + getElementText(By.cssSelector(itemElement)));
			return false;
		}
		
	}
	
	public boolean checkEmptyCartWithIsDisplayed() {
		String itemElement = "img[alt='Empty shopping cart']";
		Boolean Display = elementExists(By.cssSelector(itemElement));
		return Display;
	}

	//Select QTY and change the QTY
	public void selectQTY(String QTY) {
		selectDropdown(By.id("cart-item_undefined"), QTY);
	}
	
	//
	private Boolean elementExists(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}
	
	//Remove Item from Cart
	public void removeFromCart() {
		clickElement(By.cssSelector(".button.clear.remove-item"));
	}
}
