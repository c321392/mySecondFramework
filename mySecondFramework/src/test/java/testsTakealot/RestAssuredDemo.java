package testsTakealot;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.pdfbox.pdmodel.PDDocument;
import org.pdfbox.util.PDFTextStripper;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import frameworkClasses.BasePage;
import frameworkClasses.ReadExcel;
import io.restassured.RestAssured;
import pageObjectsTakealot.BasePageTakealot;
import pageObjectsTakealot.CartPage;
import pageObjectsTakealot.DealsPage;
import pageObjectsTakealot.ItemPage;
import pageObjectsTakealot.LandingPage;
import pageObjectsTakealot.ResultsPage;
import pageObjectsTakealot.SearchResultsPage;
import pageObjectsTakealot.WishListPage;

public class RestAssuredDemo extends BasePage {
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
	baseTakePG.ClickCookiesButton();}
	
	public String readPDFContent(String appURL, int expectedNoPages) throws Exception {
		
		URL url = new URL(appURL);
		InputStream input = url.openStream();
		BufferedInputStream fileToParse = new BufferedInputStream(input);
		PDDocument document = null;
		String output = null;
		
		try {
			document = PDDocument.load(fileToParse);
			output = new PDFTextStripper().getText(document);
			int numberOfPages = getPageCount(document);
			Assert.assertEquals(numberOfPages,  expectedNoPages);
			
		} finally {
			if (document != null) {
				document.close();
			}
			fileToParse.close();
			input.close();
			
		}
		return output;
		
		
	}
	
	public int getPageCount(PDDocument doc) {
		int pageCount = doc.getNumberOfPages();
		return pageCount;
	}
}
