package testsTakealot;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import frameworkClasses.BasePage;
import frameworkClasses.ReadExcel;
import pageObjectsTakealot.BasePageTakealot;
import pageObjectsTakealot.CartPage;
import pageObjectsTakealot.DealsPage;
import pageObjectsTakealot.ItemPage;
import pageObjectsTakealot.LandingPage;
import pageObjectsTakealot.ResultsPage;
import pageObjectsTakealot.SearchResultsPage;
import pageObjectsTakealot.WishListPage;

public class Tests {

	//Instantiate Pages
	BasePage basePG = new BasePage();
	LandingPage landPG = new LandingPage();
	DealsPage dealsPG = new DealsPage();
	CartPage cartPG = new CartPage();
	BasePageTakealot baseTakePG = new BasePageTakealot();
	ResultsPage resultsPG = new ResultsPage();
	ItemPage itemPG = new ItemPage();
	SearchResultsPage searchResultsPG = new SearchResultsPage();
	SoftAssert softAssertion = new SoftAssert();
	WishListPage wishPG = new WishListPage();
	ReadExcel rExcel = new ReadExcel();

	@BeforeTest
		public void setUp() {
		baseTakePG.ClickCookiesButton();
	}
	
//	@Test 
//	 public void GIVEN_ShopperOnLandingPage_WHEN_selectDailyDeals_THEN_DailyScreenOpen_AND_PhillipsAirfryerFirstItemDislayed() {
//		//  GIVEN
//		//		Given the shopper is on the Landing page
//		//	WHEN
//		//		He selects daily deals
//		//	THEN
//		//		The Daily deals URL
//		//	AND
//		//		First displayed item is Phillips XXL Airfryer
//		//
//		//	GIVEN_ShopperOnLandingPage_WHEN_selectDailyDeals_THEN_DailyScreenOpen_AND_PhillipsAirfryerFirstItemDislayed(){
//		//	landPG.checkLandingPageNavigation();
//		//	landPG.selectItem(“DailyDeals”);
//		//	dealsPG.checkURL(“Takealot/deals”);
//		//	dealsPG.checkFirstItem(“PhillipAirFryer”);
//		//	}
//	}
//	
//	@Test
//	public void GIVEN_ShooperOnLandingPage_WHEN_SearchforDKNY_AND_CleckOnSearch_THEN_FirstItemDKNY() {
//		
//		//  GIVEN
//		//		Given the shopper is on the Landing page
//		//	WHEN
//		//		He search for DKNY
//		//  AND 
//		//      Click on Search
//		//	THEN
//		//		The first item returned id DKNY
//		//
//		//	GIVEN_ShooperOnLandingPage_WHEN_SearchforDKNY_AND_CleckOnSearch_THEN_FirstItemDKNY(){
//		//	landPG.checkLandingPageNavigation();
//		//	landPG.searchFor(“DKNY”);
//		//	landPG.clickOnSearch();
//		//	landPG.checkFirstItem(“DKNY”);
//		//	}
//
//		
//	}
//	
	/*2a
	* GIVEN the shopper is on the landing page
	* WHEN he enters "DKNY" as the search string
	* WHEN clicks the search button
	* THEN "DKNY" is displayed as the first item in the grid
	*/
//	@Test
//	public void GIVEN_shopperIsOnTheLandingPage_WHEN_ShopperENtersDKNY_AND_ShopperclicksthesearchButton_THEN_DKNYBeDelicois50ml() {
//		//Variables
//		String searchInput = "DKNY";
//		String xpectedText =  searchInput;
//		String actualText1;
//		String actualDescription1;
//		//Process
//		baseTakePG.NavigateToHomePage();
//		landPG.clickSearchBar();
//		landPG.enterTextInSearchBar(searchInput);
//		landPG.clickOnSearchButton();
//		searchResultsPG.clickFirstItem();
//		searchResultsPG.SwitchToNewTab();
//		actualText1 = resultsPG.getElementTextofFirstItem();
////		softAssertion.assertEquals("sdfsdf","sdfsdfkkkk","Soft Assertion");
//	
//		System.out.println("Print the Text" + " " + actualText1 );
//		Reporter.log("Expected Value " + " " + xpectedText + " and Actual Value " + actualText1);
//		//Assert.assertEquals(xpectedText, actualText1);
//		actualDescription1 = resultsPG.getElementTextofSecondItem();
//		System.out.println("Print the Text" + " " + actualDescription1 );
//		Reporter.log(" Actual Value " + actualDescription1);
////		softAssertion.assertEquals("Charlotte","Louise","2nd Soft Assertion");
////		softAssertion.assertAll("All Soft Assertion");
////		searchResultsPG.closeChildBrowser();
//		searchResultsPG.closeChildBrowser();
//	}
	/*2b
	* GIVEN the shopper is on the landing page
	* WHEN he enters "Boot" as the search string
	* WHEN clicks the search button
	* THEN "Boot" is displayed as the first item in the grid
	*/
//	@Test
//	public void GIVEN_shopperIsOnTheLandingPage_WHEN_ShopperENtersBoot_AND_ShopperclicksthesearchButton_THEN_Boot() {
//		String searchInput = "boot";
//		String actualBrand;
//		String expectedBrand = "FitFlop";
//		String actualItemDescription;
//		String expectedItemDescription = "failed";
//		baseTakePG.NavigateToHomePage();
//		landPG.clickSearchBar();
//		landPG.enterTextInSearchBar(searchInput);
//		landPG.clickOnSearchButton();
//		searchResultsPG.clickFirstItem();
//		searchResultsPG.SwitchToNewTab();
//		actualBrand = resultsPG.getElementTextofFirstItem();
//		System.out.println("Print the Text " + actualBrand);
//		actualItemDescription = resultsPG.getElementTextofSecondItem();
//		System.out.println("The heading of the first item is text " + actualItemDescription);
//		Reporter.log("Expected Brand is " + " " + expectedBrand);
//		Reporter.log("Actual Brand is " + actualBrand);
//		Reporter.log("Actual Item Description is " + actualItemDescription);
//		Reporter.log("Expected Item Description is " + expectedItemDescription);
//		Assert.assertEquals(actualBrand, expectedBrand);
//		Assert.assertTrue(actualItemDescription.contains("Failed Brand"));
//		searchResultsPG.closeChildBrowser();
//
//	}
	/*3a
	* GIVEN first item DKNY
	* WHEN Click on Add to cart
	* THEN Open Cart Page
	*/
	
	@Test
	public void GIVEN_FirstItemDKNY_Cart() {
		//Variables
		String searchInput = "DKNY";
		String xpectedText =  searchInput;
		String actualText1;
		String actualDescription1;

		//Process
		baseTakePG.NavigateToHomePage();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar(searchInput);
		landPG.clickOnSearchButton();
		searchResultsPG.clickFirstItem();
		searchResultsPG.SwitchToNewTab();
//		actualText1 = resultsPG.getElementTextofFirstItem();
//		actualDescription1 = resultsPG.getElementTextofSecondItem();
//		Assert.assertEquals(actualText1.contains("DKNY"),true);
//		
//		resultsPG.clickAddToCart();
//		resultsPG.clickGoToCart();
//		
//		Assert.assertEquals(cartPG.checkCartCount("(1 item)"), true);
		searchResultsPG.closeChildBrowser();
		
				
	}

	/*3b
	* GIVEN first item DKNY
	* WHEN Click on Add to cart
	* THEN Open Cart Page
	* AND Change the QTY
	*/
//	
//	@Test
//	public void GIVEN_FirstItemDKNY_CartANDAmendQTY() throws InterruptedException {
//		//Variables
//		String searchInput = "DKNY";
//		String xpectedText =  searchInput;
//		String actualText1;
//		String actualDescription1;
//		int unitPrice;
//
//		//Process
//		baseTakePG.NavigateToHomePage();
//		landPG.clickSearchBar();
//		landPG.enterTextInSearchBar(searchInput);
//		landPG.clickOnSearchButton();
//		searchResultsPG.clickFirstItem();
//		searchResultsPG.SwitchToNewTab();
////		actualText1 = resultsPG.getElementTextofFirstItem();
////		actualDescription1 = resultsPG.getElementTextofSecondItem();
////		Assert.assertEquals(actualText1.contains("DKNY"),true);
//		
//		unitPrice = resultsPG.getUnitPrice();
//		resultsPG.clickAddToCart();
//		resultsPG.clickGoToCart();
//		
//		Assert.assertEquals(cartPG.checkCartCount("(1 item)"), true);
//		cartPG.selectQTY("2");
////		Thread.sleep(3000);
////		Assert.assertEquals(cartPG.checkCartCount("(2 items)"), true);
//		cartPG.selectQTY("1");
////		Thread.sleep(3000);
//		Assert.assertEquals(cartPG.checkCartCount("(1 item)"), true);
//		cartPG.removeFromCart();
//		Assert.assertEquals(cartPG.checkCartIsEmpty(), true);
//		//Assert.assertEquals(cartPG., null);
//		Assert.assertEquals(landPG.cartSummary("0"), true);
//		searchResultsPG.closeChildBrowser();
//
//	
//	}
//
//	/*4a
//	* GIVEN first item DKNY
//	* WHEN Click on Add to Wishlist
//	* THEN item selected displays in Wishlist
//	*/
//	
	@Test
	public void GIVEN_FirstItemDKNY_CheckWishList() {
		//Variables
		String searchInput = "DKNY";
		String actualDescriptionRG;
		String actualDescription1;
		String actualDescriptionWL;

		//Process
		baseTakePG.NavigateToHomePage();
		landPG.clickSearchBar();
		landPG.enterTextInSearchBar(searchInput);
		landPG.clickOnSearchButton();
		searchResultsPG.clickFirstItem();
		searchResultsPG.SwitchToNewTab();

		actualDescriptionRG = resultsPG.getElementTextofSecondItem();
		Reporter.log("Actual Searched Item Description is " + actualDescriptionRG);

		resultsPG.clickAddToWishList();
		resultsPG.clickGoToWishListV();
		actualDescription1 = wishPG.getPGText();
		Reporter.log("Actual Item Description is " + actualDescription1);
		actualDescriptionWL = wishPG.getSelectItemText();
		Reporter.log("Actual WL Item Description is " + actualDescriptionWL);
		Assert.assertEquals(actualDescriptionWL.contains(actualDescriptionRG), true);
		//Assert.assertEquals(actualDescriptionWL.contains("DKNY Be Delicious EDT 50ml"), true);
		searchResultsPG.closeChildBrowser();
	}

	@Test
	public void checkPDF() throws Exception {
		String pdfURL ="";
		int expectedNoPages = 1;
		String pdfContent = landPG.readPDFContent(pdfURL, expectedNoPages);
		Assert.assertTrue(pdfContent.contains(""));
	}
	/*5a
	* GIVEN the shopper is on the landing page
	* WHEN he enters "DKNY" as the search string
	* WHEN clicks the search button
	* THEN "DKNY" is displayed as the first item in the grid
	*/
//	@Test(dataProvider="Brand and Quantity")
//	public void SearchSiteWithExcel(String brand, String quantity) throws InterruptedException {
//		System.out.println(brand + " " + quantity);
//		//Variables
//		int unitPrice;
//		String itemCount;
//
//		//Process
//		baseTakePG.NavigateToHomePage();
//		landPG.clickSearchBar();
//		landPG.enterTextInSearchBar(brand);
//		landPG.clickOnSearchButton();
//		searchResultsPG.clickFirstItem();
//		searchResultsPG.SwitchToNewTab();
//
//		unitPrice = resultsPG.getUnitPrice();
//		resultsPG.clickAddToCart();
//		resultsPG.clickGoToCart();
//		
//		//Assert.assertEquals(cartPG.checkCartCount("(1 item)"), true);
//	
//		cartPG.selectQTY(quantity);
//		Thread.sleep(3000);
//		
////		Assert.assertEquals(cartPG.checkCartCount("(2 items)"), true);
////		cartPG.selectQTY("1");
////		itemCount = cartPG.checkCartCount();
////		Assert.assertEquals(itemCount.contains(quantity), true);
//
//		searchResultsPG.closeChildBrowser();
//
//	}
//	
//	@DataProvider(name = "Brand and Quantity")
//	public Object[][] getDataFromExcel(){
//		String excelDirectory = rExcel.getDataConfigPropeties("excelDataDir");
//		Object[][] errObj = rExcel.getExcelData(excelDirectory +"BrandANDQuantity.xlsx", "Sheet1");
//		return errObj;
//	}
//	
//	@AfterTest
//	public void afterCleanup() {
//		afterCleanup();
//	}
	
//	private Boolean resultsPG.getElementTextofSecondItem(String string) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}

