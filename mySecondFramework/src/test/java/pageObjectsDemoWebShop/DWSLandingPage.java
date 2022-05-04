package pageObjectsDemoWebShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import frameworkClasses.BasePage;

public class DWSLandingPage extends BasePage{

	public void clickBooks() {
		//clickElement(By.cssSelector("div.master-wrapper-page:nth-child(4) div.master-wrapper-content div.master-wrapper-main:nth-child(5) div.leftside-3 div.block.block-category-navigation:nth-child(1) div.listbox ul.list li.inactive:nth-child(1) > a:nth-child(1)"));
		//clickElement(By.xpath("//body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
		//clickElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]"));
		clickElement(By.xpath("//body/div[@class='master-wrapper-page']//ul[@class='top-menu']//a[@href='/books']"));
	}
}
