package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import common.Common;
import utils.SeleniumUtils;

public class WindowHandling {
	
	public static void main(String[] args) {
	
		WebDriver driver = Common.driver;
		driver = Common.getChrome();
		
		driver.get("https://www.naukri.com/");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("BUREAU VERITAS - ISM Global Shared Service Centre")).click();
		
		SeleniumUtils.switchToWindow(driver, "Bureau Veritas");
		
		//driver.switchTo().window(string);		
		
		
		driver.findElement(By.xpath("(//a[text()='Jobs'])[1]")).click();
		
		if(driver.getTitle().equals("Jobs | Bureau Veritas"))
			System.out.println("Test Case Pass");
		else
			System.out.println("Test Case Fail");
		
		
		
		//go back to main window
		//driver.switchTo().defaultContent();
		SeleniumUtils.switchToWindow(driver, "Jobs - Recruitment");
		
		System.out.println(driver.getTitle());
		
		
		//Cibersites India Private Limited
		SeleniumUtils.ClikOnElement(SeleniumUtils.elementLinkText(driver, "Cibersites India Private Limited"), driver);
		
		
		SeleniumUtils.switchToWindow(driver, "Ciber Jobs");
		
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
	}
}
