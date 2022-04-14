package pageObjectsTakealot;

import org.openqa.selenium.By;

import frameworkClasses.BasePage;

public class ResultsPage extends BasePage{

	//Check First Item Element Text
	public String getElementTextofFirstItem() {
		String text1 = getElementText(By.cssSelector(
				".title-content-list a"));
		return text1;
	}
	

}
