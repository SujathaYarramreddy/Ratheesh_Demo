package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String Expectedtitle = "OrangeHRM";
		driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		String ActualTitle = driver.getTitle();
		if(Expectedtitle.equals(ActualTitle)) {
			System.out.println("The title is the same");
			driver.findElement(By.id("welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
			//driver.close();
		}
		else {
			System.out.println("The title is not same");
			driver.close();
		}
	
	}
	

}
