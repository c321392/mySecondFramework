package pageObjectsTakealot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class WishListPage extends BasePage {

	//Check Page Text
	public String getPGText() {
		String text1 = getElementText(By.cssSelector(
				"h1"));
		return text1;
	}
	
	//Check First Item Element Text
	public String getSelectItemText() {
		String text1 = getElementText(By.cssSelector(
				"h3"));
		return text1;
	}	
}
