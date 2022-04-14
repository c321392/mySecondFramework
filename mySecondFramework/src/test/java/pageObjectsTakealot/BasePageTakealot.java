package pageObjectsTakealot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import frameworkClasses.BasePage;

public class BasePageTakealot extends BasePage {

	//Method: Go to Home Page
	public void NavigateToHomePage() {
		driver.get("https://www.takealot.com/");
		waitForUrl(30, "takealot");
	}
	
	//Clear the Cookies bar
	public void ClickCookiesButton() {
		String cookiesButton = ".button.cookies-banner-module_dismiss-button_24Z98";
		if(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cookiesButton)) != null)
			clickElement(By.cssSelector(cookiesButton));
	}

}
