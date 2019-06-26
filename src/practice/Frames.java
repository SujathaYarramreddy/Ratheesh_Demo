package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Frame']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@src,'default.html')]")));
		driver.findElement(By.id("Click")).click();
		driver.switchTo().parentFrame();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[starts-with(@src,'page')]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
		driver.findElement(By.id("Click1")).click();
		driver.switchTo().defaultContent();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The number of frames is "+size);
		

	}

}
