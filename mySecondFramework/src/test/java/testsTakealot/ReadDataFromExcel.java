package testsTakealot;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import frameworkClasses.ReadExcel;

public class ReadDataFromExcel {

	ReadExcel rExcel = new ReadExcel();
	
	@Test(dataProvider="Brand and Quantity")
	public void BrandQuantitySting(String brand, String quantity) {
		System.out.println(brand + " " + quantity);
	}
	
	@DataProvider(name = "Brand and Quantity")
	public Object[][] getDataFromExcel(){
		String excelDirectory = rExcel.getDataConfigPropeties("excelDataDir");
		Object[][] errObj = rExcel.getExcelData(excelDirectory +"BrandANDQuantity.xlsx", "Sheet1");
		return errObj;
	}
}
