package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\eclipse-workspace\\Training TD_Bank\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/");
		
		
		//get text using partial link
		
		String link = driver.findElement(By.partialLinkText("Partial Link")).getText();
		System.out.println("Partial link text from selenium:**"+link);

		if(link.equals("Partial Link"))
			System.out.println("test case pased");
		else
			System.out.println("Test case failed");
		
		
	//get text using link text
		
		String link2 = driver.findElement(By.linkText("Link Test")).getText();
		System.out.println("Partial link text from selenium:**"+link2);

		if(link2.equals("Link Test"))
			System.out.println("test case pased");
		else
			System.out.println("Test case failed");
		
		driver.findElement(By.name("firstname")).sendKeys("Ajit");
		driver.findElement(By.xpath("//*[@id='content']/div[1]/div/div/div/div[2]/div/form/fieldset/div[11]/input")).sendKeys("Ajit");
		
		driver.findElement(By.id("sex-0")).click();
		
		driver.findElement(By.id("exp-6")).click();
		
		driver.findElement(By.id("datepicker")).sendKeys("02-05-1989");
		
		driver.findElement(By.id("profession-1")).click();
			
	}
	

}
