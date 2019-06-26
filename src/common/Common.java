package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Common {
	
	public static WebDriver driver = null;
	
	public static WebDriver getChrome() {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\eclipse-workspace\\Training TD_Bank\\driver\\chromedriver.exe");
		
		return new ChromeDriver();
	}
	
	

}
