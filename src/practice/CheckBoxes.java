package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		WebElement findElement = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		if (findElement.isSelected()) {
			System.out.println("Selenium is checked");
			
		} else {
       
			System.out.println("Selenium is not selected");
		}
		List<WebElement> findElements = driver.findElements(By.xpath("(//div[@class='example'])[3]/input"));
		for (WebElement webElement : findElements) {
			if (webElement.isSelected()) {
				webElement.click();
				System.out.println("I have deselected the checked one");
			} else {
  
				System.out.println("The element is not checked");
				
			}
			
		}
		List<WebElement> findElements2 = driver.findElements(By.xpath("(//div[@class='example'])[4]/input"));
		for (WebElement webElement : findElements2) {
			if (!(webElement.isSelected())) {
				webElement.click();
				System.out.println("I have checked all the checkboxes");
				
			}
			else {
				
				System.out.println("No actions needed");
			}
			
		}
	}

}
