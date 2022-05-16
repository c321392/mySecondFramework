package pageObjectsDemoWebShop;

import frameworkClasses.BasePage;

public class DWSBasePage extends BasePage{

	//secondTestSystem
	public void NavigateToHomePage() {

		String URL = getDataConfigPropeties("systemUnderTest");
		driver.get(URL);
		waitForUrl(30, "demowebshop");
	}
	
	public String getHomePageTitle () {
		String myTitle = driver.getTitle();
		System.out.println("THis is the Page Title = " + myTitle);
		return myTitle;
	}
}
