package sample_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testleaf_sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Edit / Text Fields']")).click();
		driver.findElement(By.id("email")).sendKeys("yarramreddy.sujatha@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Apple");
		String attribute = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println("The Value present is "+attribute);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		/*WebElement checking = driver.findElement(By.xpath("//input[@disabled='true']"));
		if(checking.isEnabled()) {
			System.out.println("The element is enabled");
		}
		else {
			System.out.println("The element is disabled");
		}*/
		
		boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		//driver.close();
		

	}

}
