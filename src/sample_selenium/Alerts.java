package sample_selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Alert']")).click();
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("IBM Training");
		Thread.sleep(2000);
		alert.accept(); //to close the alert
		driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();
		Alert alert2 = driver.switchTo().alert();
		String text = alert2.getText();
		System.out.println("The value present in the alert is "+text);
		alert2.accept();
	}

}
