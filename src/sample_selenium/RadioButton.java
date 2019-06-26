package sample_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[starts-with(@alt,'Radio')]")).click();
		driver.findElement(By.id("no")).click();
		List<WebElement> findElements = driver.findElements(By.name("news")); //findelements are Checked & Unchecked
		for (WebElement webElement : findElements) {
			if (webElement.isSelected()) {
				System.out.println("The selected element is "+webElement.getAttribute("value"));
			} 
			
		}
		WebElement age = driver.findElement(By.xpath("//input[@name='age']"));
		if (age.isSelected()) {
		   System.out.println("My age group is selected");	
		}
		else {
			age.click();
			System.out.println("I have selected My age group");
		}
		/*WebElement age = driver.findElement(By.xpath("(//input[@name='age'])[2]"));
		if (age.isSelected()) {
		   System.out.println("My age group is selected");	
		}
		else {
			age.click();
			System.out.println("I have selected My age group");
		}*/
		
	}

}
