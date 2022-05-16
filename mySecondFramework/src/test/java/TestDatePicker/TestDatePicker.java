package TestDatePicker;

import org.testng.annotations.Test;

import pageObjectsDatePickerProject.DPBasePage;

public class TestDatePicker {

	//create an object of the date picker
	DPBasePage DPBasePG = new DPBasePage();
	
	@Test
	public void datePickerTest1() throws InterruptedException {
		DPBasePG.ClickCookiesButton();
		DPBasePG.selectDateFromDatePicker("9/21/2026 4:30 PM");
	}
	
	@Test
	public void datePickerTest2() throws InterruptedException {
		DPBasePG.ClickCookiesButton();
		DPBasePG.enterDateandTime("9/21/2026 4:30 PM");
	}
}
