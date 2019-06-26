package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ToolqaDemo1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\eclipse-workspace\\Training TD_Bank\\driver\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		
		driver.manage().window().maximize();
		
		//Mouse hover
		
		Actions act = new Actions(driver);
		
		//Did a mouse hover
		act.moveToElement(driver.findElement(By.xpath("(//ul[@id='primary-menu']/li[7]//span[text()='DEMO SITES'])[1]"))).build().perform();
		
		act.click(driver.findElement(By.xpath("(//span[text()='Automation Practice Form'])[1]"))).build().perform();
		
		//file attachment in case of input tag
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\IBM_ADMIN\\Desktop\\Ignite Latest guide box link.txt");
		
		
		//Selection
		Select sel = new Select(driver.findElement(By.id("continents")));
		
		
		if(sel.getFirstSelectedOption().getText().equals("Asia"))
			System.out.println("Test case pass");
		else
			System.out.println("Fail");
			
		sel.selectByVisibleText("Africa");
		
		Thread.sleep(4000);
		
		sel.selectByIndex(5);
		
		
	}

}
