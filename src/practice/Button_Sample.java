package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//img[starts-with(@class,'wp')])[2]")).click();
		driver.findElement(By.xpath("//button[contains(@onclick,'loca')]")).click();
		driver.navigate().back();
		Point location = driver.findElement(By.id("position")).getLocation(); 
		System.out.println(location);
		int x = location.getX();
		System.out.println("The X locations is "+x);
		int y = location.getY();
        System.out.println("The Y locations is "+y);
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println("The Back ground color is "+cssValue);
		WebElement findElement = driver.findElement(By.id("size"));
		int height = findElement.getSize().getHeight();
		System.out.println("The height of the button is "+height);
		int width = findElement.getSize().getWidth();
		System.out.println("The Width of the button is "+width);
		
	}

}
