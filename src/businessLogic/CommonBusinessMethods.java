package businessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumUtils;

public class CommonBusinessMethods {

	
	public static void openURL(WebDriver driver,String url) {
		
		driver.get(url);
	}
	
	
	public static void mouseHoverAndClick(WebDriver driver, String subMenu) {
		
		SeleniumUtils.MouseHoverAndClik(driver, driver.findElement(By.xpath(".//*[@id='menu-item-33']/a[text()='Product Category']")),subMenu);
		
	}
	
	
}
