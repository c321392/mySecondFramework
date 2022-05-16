package testsTakealot;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.apache.hc.core5.reactor.IOSession.Status;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
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

/*
* Rest assured is java library for testing Restful Web services.
* It can be used to test XML & JSON based web services.
* It supports GET, POST, PUT, PATCH, DELETE, OPTIONS and HEAD requests and
* can be used to validate and verify the response of these requests.
* Syntax: The syntax of Rest Assured.io is the most beautiful part, as it is
* very gherkin syntax like and understandable.
*
* Given(). param("x", "y"). header("z", "w"). when(). Method(). Then().
* statusCode(XXX). body("x, ”y", equalTo("z"));
*
* Given() ‘Given’ keyword, lets you set a background, here, you pass the
* request headers, query and path param, body, cookies. This is optional if
* these items are not needed in the request
* When() ‘when’ keyword marks the
* premise of your scenario. For example, ‘when’ you get/post/put something, do
* something else. Method() Substitute this with any of the CRUD
* operations(get/post/put/delete)
* Then() Your assert and matcher conditions go
* here
*
* Methods HTTP methods (GET, PUT, POST, PATCH and DELETE) and these methods can
* be mapped to CRUD operations. GET retrieves the resource at a specified URI.
* PUT updates a resource at a specified URI. Also be used to create a new
* resource at a specified URI. Replaces the entire product entity. PATCH
* support partial updates. POST creates a new resource. DELETE deletes a
* resource at a specified URI.
*/

public class restDemo {
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
	RestAssuredDemo RAD = new RestAssuredDemo();
	
	
	@BeforeTest
	public void setUp() {
		//Specify the base URLto the RESTFUL web service
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
	}
	
	@Test
	public void getResponseExampleAndLoggingBaseURI() {
		given().
		when().
//		log().
//		//after preparing the request but not yet sent to the server
//		all()
		get("").
		then().log().
		//this will log /print everything after receiving the response from the server
		all()
		;
		
	}
	
	@Test
	public void getResponseExampleAndLoggingwithoutBaseURI() {
		given().
		when().
//		log().
//		//after preparing the request but not yet sent to the server
//		all()
		get("https://demoqa.com/BookStore/v1/Books").
		then().log().
		//this will log /print everything after receiving the response from the server
		all()
		;
		
	}
	
	@Test
	public void getISBNoFirstBook() {
		given().
		when().
//		log().
//		//after preparing the request but not yet sent to the server
//		all()
		get("").
		then().statusCode(200).body("books[0].isbn",equalTo("9781449325862"));
		
	}
	
	@Test
	public void getPublisherOfTheFourthBookFirstBook() {
		given().
		when().
		get("").
		then().
		statusCode(200).
		body("books[3].publisher",equalTo("O'Reilly Media"));	
		
	}
	
	@Test
	public void getPageNumbers() {
		given().
		when().
		get("").
		then().
		statusCode(200).
		body("books[2].pages",equalTo(28));	
		
	}
	
	@Test
	public void testUsing2Assertions() {
		given().
		when().
		get("").
		then().
		statusCode(200).
		body("books[2].pages",equalTo(28)).
		and().
		body("books[3].publisher",equalTo("O'Reilly Media"));	
		
	}
	
	@Test
	public void testTitleHasItem() {
		given().
		when().
		get("").
		then().
		statusCode(200).
		body("books.subTitle",hasItems("Harnessing the Power of the Web"));	
		
	}
	
	
	@Test
	public void testCreateAVariable() {
		String isbn =
		given().
		when().
		get("").
		then().
		statusCode(200).
		extract().path("books[0].isbn");	
		System.out.println("Books ISBN No = " + isbn);
	}
	
	@Test
	public void testCreateAList() {
		List<String> isbn =
		given().
		when().
		get("").
		then().
		statusCode(200).
		extract().path("books.isbn");
		for (String book : isbn) {
			System.out.println("Books ISBN No = " + book);
		}
		
	}
	
	
	@Test
	public void checkPDF() throws Exception {
		String pdfURL = "";
		
		int expectedNoPages = 1;
		
		String pdfConent = RAD.readPDFContent(pdfURL, expectedNoPages);
		Assert.assertTrue(pdfConent.contains("Panigrahi"));
	}
}
