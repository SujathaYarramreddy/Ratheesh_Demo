package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Link']")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		String attribute = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println("The Link Value is "+attribute);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String text = driver.findElement(By.xpath("/html/body/h1")).getText();
		String mytext = "Not Found";
		if (mytext.equals(text)) {
			System.out.println("The website is not working");
		} else {
            System.out.println("The website is working");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.navigate().back();
		int size = driver.findElements(By.tagName("a")).size();
		System.out.println("The number of links present is "+size);
	}

}
