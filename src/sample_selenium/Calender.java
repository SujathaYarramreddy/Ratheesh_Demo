package sample_selenium;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Calendar']")).click();
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.id("datepicker")).sendKeys("04/10/2019");//we can send the data using sendkeys also
		List<WebElement> findElements = driver.findElements(By.xpath("//a[contains(@class,'state')]"));
		for (WebElement webElement : findElements) {
			String text = webElement.getText();
			if (text.equalsIgnoreCase("10")) { //equalsignorecase will be like case sensive if our text is case sensitive also it will take it
				webElement.click(); 
			}
			
			
		}
		TakesScreenshot screen = ((TakesScreenshot)driver); //Declaring Type Casting in Java as getScreenshotAS method will not access the Driver object.
		File screenshotAs = screen.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(screenshotAs, new File("C:\\Users\\IBM_ADMIN\\Desktop\\screen.png"));
		FileUtils.copyFile(screenshotAs, new File("C:\\Users\\IBM_ADMIN\\Desktop\\"+System.currentTimeMillis()+".png")); //to differentiate the screenshots for every time
	}

}
