package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt='Windows']")).click();
        driver.findElement(By.xpath("//button[@onclick='openWin();']")).click();
        driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
        int size = driver.getWindowHandles().size();
        System.out.println("The number of Open windows are "+size);
        driver.findElement(By.id("color")).click();
        String parentwindow = driver.getWindowHandle(); //parent window handle
        Set<String> allwindows = driver.getWindowHandles(); //remaining window handles-windows are unordered
        for (String handle : allwindows) {
        	if (!(handle.equals(parentwindow))) {
        		driver.switchTo().window(handle);
        		driver.close();
				
			} 
			
		}
        driver.switchTo().window(parentwindow); //to bring back control to the parent window after closed all other windows
       driver.findElement(By.xpath("//button[@onclick='openWindowsWithWait();']")).click();//in this case we need to handle those newly opened windows also so using list class
       Thread.sleep(5000);
       Set<String> allUnordered = driver.getWindowHandles();
       List<String> allOrdered = new ArrayList<String>(); //created List for to get the ordered windows
       boolean addAll = allOrdered.addAll(allUnordered); //allUnordered windows it will make it as ordered as it is List
       System.out.println("addAll values are"+addAll);
       String parent = allOrdered.get(0);
       String child1 = allOrdered.get(1);
       System.out.println(child1);
       driver.switchTo().window(child1);
       Thread.sleep(2000);
       driver.close();
       String child2 = allOrdered.get(2);
       System.out.println(child2);
       driver.switchTo().window(child2);
       Thread.sleep(2000);
       driver.close();
       driver.switchTo().window(parent);
       System.out.println(parent);
       driver.close();
         
        
	}

}
