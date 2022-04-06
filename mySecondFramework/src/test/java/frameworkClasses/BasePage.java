package frameworkClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	// Declare Webdriver
	public static WebDriver driver;

	// Constructor
	public BasePage() {
		if (driver == null) {
			// Set Parameter values
//		String browser = getDataConfigPropeties("browser");
//		String URL = getDataConfigPropeties("systemUnderTest");
//		String pdriverDir = getDataConfigPropeties("driverdir");
			String browser = "chrome";
			String URL = "https://www.takealot.com/";
			String pdriverDir = "C:\\Users\\aventer\\selenium-java-4.1.2\\";

			// String pdriverDirFireFox = getDataConfirgPropeties("driverdirFirefox");
			// String pdriverDirEdge = getDataConfirgPropeties("driverdirEdge");

			// check if parameter passed as "chrome"
			if (browser.equalsIgnoreCase("chrome")) {
				// Set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver", pdriverDir + "chromedriver.exe");
				// create an instance of chrome
				driver = new ChromeDriver();
				driver.get(URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		}
	}
	// Check of our Driver have been started , if not then start

	// Set the Browser and URL

	// Method: Wait for Element, Wait for Click,
	// ...Wait for Element
	public void waitForElement(int elementWait, By pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(pLocator));
	}

	// ...Wait for Click
	public void waitforClick(int elementWait, By pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.elementToBeClickable(pLocator));
	}

	// ...Wait for URL
	public void waitForUrl(int elementWait, String pLocator) {
		WebDriverWait wait = new WebDriverWait(driver, elementWait);
		wait.until(ExpectedConditions.urlContains(pLocator));
	}

	// Method: Get text on element
	public String getElementText(By pLocator) {
		String elementText = getElement(pLocator).getText();
		return elementText;
	}

	// Method: Click n a Element

	// Method: Check Element exists

	// Method: Get Element
	public WebElement getElement(By pLococator) {
		waitforClick(30, pLococator);
		return driver.findElement(pLococator);
	}

	// Method: Cleanup i.e close the Driver

	// Method: Enter text on field

	// Method: Clear text from field

	// Method: Select from dropdown

	// Method: Get text on Method - pass

}
