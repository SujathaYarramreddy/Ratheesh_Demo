package utils;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumUtils {

	
	public static void ClikOnElement(WebElement wb, WebDriver driver) {
		
		try {
			
			wb.click();
		}catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Element not found");
		}
		
	}
	
	
	public static WebElement elementLinkText(WebDriver driver, String text) {
		try {
			return driver.findElement(By.linkText(text));
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public static void switchToWindow(WebDriver driver, String partialPageTitle) {
		Set<String> winIDs=driver.getWindowHandles();
		
		for (String s : winIDs) {

			if(driver.switchTo().window(s).getTitle().contains(partialPageTitle)) {
					break;			
			}
			
		}
	}
	
	
	public static void MouseHoverAndClik(WebDriver driver, WebElement wb,String menu) {
		
		try {
		Actions act = new Actions(driver);
		act.moveToElement(wb).build().perform();
		act.click(driver.findElement(By.xpath("(//span[text()='"+menu+"'])[1]"))).build().perform();
		
		act.moveToElement(wb).build().perform();
		}catch (Exception e) {
			// TODO: handle exception
			
			new RuntimeException("Unable to perform mouse hover");
		}
	}
	

	
}
