package testsTakealot;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import frameworkClasses.ReadExcel;
import frameworkClasses.Utilities;

public class ReadDataFromExcel {

	ReadExcel rExcel = new ReadExcel();
	Utilities uts = new Utilities();
	
	String outputDirectory = uts.getDataConfigPropeties("OutputDir");
	String outputfile = outputDirectory + "output11.txt";
	
	@BeforeTest
	public void setup() {
		uts.resetOutputFile(outputfile);
	}
	
	@Test(dataProvider="Brand and Quantity")
	public void BrandQuantitySting(String brand, String quantity) {
		System.out.println(brand + " " + quantity);
		boolean bool = true;
		
		String result;
		if(bool) {
			result = "It's true";
		}else {
			result = "It's a fail";
		}
		String content = brand + ","+ quantity +","+result;
		
		try {
			
			Files.write(Paths.get(outputfile), (content + System.lineSeparator()).getBytes(),
					StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		}catch (IOException e) {
			System.out.println("the error is " + e.getMessage());
		}
	}
	
	@DataProvider(name = "Brand and Quantity")
	public Object[][] getDataFromExcel(){
		String excelDirectory = rExcel.getDataConfigPropeties("excelDataDir");
		Object[][] errObj = rExcel.getExcelData(excelDirectory +"BrandANDQuantity.xlsx", "Sheet1");
		return errObj;
	}
}
