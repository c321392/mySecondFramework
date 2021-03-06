package pageObjectsTakealot;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import frameworkClasses.BasePage;

public class BasePageTakealot extends BasePage {

	// Method: Go to Home Page
	public void NavigateToHomePage() {
//		String browser = getDataConfigPropeties("browser");
		String URL = getDataConfigPropeties("systemUnderTest");
//		String pdriverDir = getDataConfigPropeties("driverdir");
//		driver.get("https://www.takealot.com/");
		driver.get(URL);
		waitForUrl(30, "takealot");
	}

	// Clear the Cookies bar
	public void ClickCookiesButton() {
		String cookiesButton = ".button.cookies-banner-module_dismiss-button_24Z98";
		try {
			clickElement(By.cssSelector(cookiesButton));
		}
		// if(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cookiesButton))
		// != null)
		catch (Exception e) {
			System.out.println("Cookie not There");
		}
	}

	public void quizPopUp() {
		String nextButton = "_hj-3HqTJ__styles__surveyActionButton";
		try {
			clickElement(By.className("_hj-2fsWS__styles__closeEndedOptionText"));
			clickElement(By.className(nextButton));
			clickElement(By.className(nextButton));
			clickElement(By.className("_hj-3Y4y-__styles__closeButton"));

		}

		catch (Exception e) {
			System.out.println("Cookie not There");
			e.printStackTrace();
		}
	}
}
