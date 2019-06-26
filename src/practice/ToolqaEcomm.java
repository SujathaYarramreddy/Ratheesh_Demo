package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import businessLogic.CommonBusinessMethods;
import common.Common;

public class ToolqaEcomm {

	static WebDriver driver = null;
	public static String url="http://store.demoqa.com/";
	
	@BeforeClass
	
	public void beforeClass() {
		driver=Common.getChrome();
	}
	
	@BeforeMethod
	
	public void beforeMethod() {
		
		CommonBusinessMethods.openURL(driver, url);
	}
	
	
	//click on ipads
	@Test
	
	public void TC02() {
		CommonBusinessMethods.mouseHoverAndClick(driver, "iPads");
	}
	
	
	//click on iphones
	@Test
	
	public void TC01() {
		CommonBusinessMethods.mouseHoverAndClick(driver, "iPhones");
	}
	
	@AfterMethod
	
	public void afterMethod() {
		driver.close();
	}
	
	@AfterClass
	
	public void afterClass() {
		driver.quit();
		
	}
}
