package sample_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Image_Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testleaf.herokuapp.com");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//img[@alt='Images']")).click();
        driver.findElement(By.xpath("//img[starts-with(@onclick,'window')]")).click();
        driver.navigate().back();
        WebElement myele = driver.findElement(By.xpath("//img[contains(@src,'abcd')]"));
        if (myele.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The image is broken "+myele.getAttribute("outerHTML"));
		} else {
            System.out.println("The image is not broken");
		}
        WebElement ourElement = driver.findElement(By.xpath("(//img[contains(@onclick,'location')])[2]"));
        Actions builder = new Actions(driver); //to perform the mouse or Keyboard function
        builder.click(ourElement).build().perform();
        
        
	}

}
