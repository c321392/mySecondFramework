package pageObjectsDemoWebShop;

import frameworkClasses.BasePage;

public class DWSBasePage extends BasePage{

	//secondTestSystem
	public void NavigateToHomePage() {

		String URL = getDataConfigPropeties("systemUnderTest");
		driver.get(URL);
		waitForUrl(30, "Demo Web Shop");
	}
}
