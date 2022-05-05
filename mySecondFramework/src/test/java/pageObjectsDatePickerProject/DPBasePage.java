package pageObjectsDatePickerProject;



import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameworkClasses.BasePage;

public class DPBasePage extends BasePage{
	public void selectDateFromDatePicker(String desiredDateTime) throws InterruptedException {
		// example date "5/3/2022 3:40 PM"
		// extract the desired month 5
		// extract the desired day 3
		// extract the desired year
		// extract the desired time

		//Split the desiredDateTime to get only the Date Part
		String date_MM_dd_yyyy[] = (desiredDateTime.split(" ")[0].split("/"));


		//navigate to the datepicker url which comes from config



		// click on the date button

		clickElement(By.cssSelector("button:nth-of-type(2) > .k-button-icon.k-i-calendar.k-icon"));

		// find the right arrow element for for future dates
		WebElement rightArrow = driver.findElement(By.cssSelector(".k-i-arrow-60-right.k-icon"));


		// find the middle button to click the month year
		WebElement middleButton = driver.findElement(By.cssSelector(".k-header.k-hstack > a:nth-of-type(2)"));



		// find the left arrow element for for past dates
		WebElement leftArrow = driver.findElement(By.cssSelector(".k-button-icon.k-i-arrow-60-left.k-icon"));




		////for the date part



		// click middle
		Thread.sleep(1000);
//		rightArrow.click();
//		Thread.sleep(1000);
		middleButton.click();
		Thread.sleep(2000);
//		leftArrow.click();
//		Thread.sleep(1000);


		// figure out if the year is in the past present or future
		//get the year difference between current year and the desired year
		int yearDiff = Integer.parseInt(date_MM_dd_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("The calculate year Difference = " + yearDiff);
		
		//get the desired year
		if (yearDiff != 0) {
			// if you have to move to the next year
			if (yearDiff > 0) {
				for (int i=0; i<yearDiff; i++) {
					System.out.println("The  year Difference = " + i);
					rightArrow.click();
				}
			}
			// if you have to move to a previous year
				else if (yearDiff < 0) {
					for (int i=0; i< (yearDiff*(-1)); i++) {
						System.out.println("The  year Difference = " + i);
						leftArrow.click();
					}
			}
		}
		
		// Get all the Months from the calendar and place them in a list
		Thread.sleep(2000);

		List<WebElement> list_AllMonths = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td"));
		//extract the string month and converting into an int
		int DesiredMonth = Integer.parseInt(date_MM_dd_yyyy[0]);
		// select the desired month
		list_AllMonths.get(DesiredMonth-1).click();
		System.out.println("The Desired Month = " + DesiredMonth);
		
		Thread.sleep(2000);
		
		// Get all the days from the calendar and place them in a list
		List<WebElement> list_AllDays = driver.findElements(By.xpath("//div[@id='datetimepicker_dateview']//table//tbody//td[not(contains(@class, 'k-other-month'))]"));
		//extract the string day and converting into an int
		int DesiredDay = Integer.parseInt(date_MM_dd_yyyy[1]);
		System.out.println("The Desired Day = " + DesiredDay);
		// select the desired day
		list_AllDays.get(DesiredDay-1).click();

		Thread.sleep(2000);

		//// time part
		
		// click the time button
		clickElement(By.cssSelector(".k-i-clock"));
		// get a list of all the time
		List<WebElement> allTime = driver.findElements(By.xpath("//ul//li[@role='option']"));
		//System.out.println("The .. Time  = " + allTime);
		//desiredDateTime = desiredDateTime.split(" ")[1] + " " + desiredDateTime.split(" ")[2];
		desiredDateTime = desiredDateTime.substring(desiredDateTime.indexOf(" ")+1);
		System.out.println("The Desired Time  = " + desiredDateTime);
		
		// select the desired time
		// for loop syntax
		// for (statement 1; statement 2; statement 3;) {
		// statement 1 is executed on time
		// statement 2 condition for executing the code block
		// statement 3 is executed everytime after the code block}
		
		// for each loop
		// for each loop which is used exclusively for looping through elements in an array
		// for (type variable name : array)
		for(WebElement webElement: allTime) {
			if (webElement.getText().equalsIgnoreCase(desiredDateTime)) {
				System.out.println("The Selected Time  = " +  webElement.getText());
				webElement.click();				

				//System.out.println("The Selected Date  = " +  webElement.getText());
				//webElement.click();				
			}
			else {
				System.out.println("The Desired Time not on the hour or half hour  = " + desiredDateTime);
				break;
			}
		}
		
		
		
	}
	
	// Clear the Cookies bar
	public void ClickCookiesButton() {
		String cookiesButton = "button#onetrust-accept-btn-handler";
		try {
			clickElement(By.cssSelector(cookiesButton));
		}
		// if(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cookiesButton))
		// != null)
		catch (Exception e) {
			System.out.println("Cookie not There");
		}
	}
}
