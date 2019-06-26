package practice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Common;
import utils.SeleniumUtils;

public class TC01_03 {
	public static WebDriver driver = null;
	@BeforeClass
	public void initBrowser() {
		driver=Common.getChrome();
	}

	// Navigate to naukri and click on a link, do a switch to window
	
	@Test
	public static void TC01() throws IOException {
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
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
	}
	
	//navigate to back to main window 
	
	//@Test
	public static void TC02() {
		SeleniumUtils.switchToWindow(driver, "Jobs - Recruitment");
		
		System.out.println(driver.getTitle());
	}
	
	
	//click on a link and go to the new window
	//@Test
	public static void TC03() {
		//Cibersites India Private Limited
				SeleniumUtils.ClikOnElement(SeleniumUtils.elementLinkText(driver, "Cibersites India Private Limited"), driver);
				
				
				SeleniumUtils.switchToWindow(driver, "Ciber Jobs");
				
				
				System.out.println(driver.getTitle());
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	

}
