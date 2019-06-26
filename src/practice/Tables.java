package practice;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //if unable to find any element then it will thorugh an error as "No such element find"
		driver.findElement(By.xpath("//img[@alt='Table']")).click();
		List<WebElement> rows = driver.findElements(By.tagName("tr")); //rows will have all tr values
		int rowsize = rows.size();
		System.out.println("The number of rows present in the table is "+rowsize);
		WebElement firstrow = rows.get(0);  //get index-table first row will starts with 0
		List<WebElement> columns = firstrow.findElements(By.tagName("th"));//rows will have columns values instead of th tagname
		int columnsize = columns.size();
		System.out.println("The number of columns present in table is "+columnsize);
		/*List<WebElement> alldata = driver.findElements(By.tagName("td"));
		for (WebElement webElement : alldata) {  //we can use this code for static table
			String mytext = webElement.getText();
			if (mytext.equalsIgnoreCase("Learn to interact with Elements")) {
				String printtext1 = rows.get(2).findElements(By.tagName("td")).get(1).getText();
				
			   System.out.println("The Col value is "+printtext1);  
			}	
			
			}*/ 
			
		for (int row = 0; row < rowsize; row++) { //If Dynamic Table then foreach loop don't have feature of increment the cell values in table. So using for loop
			List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));//row will have col value in the form of tag 'td'. rows has all row values
			int colsize = cols.size();
			for (int col = 0; col < colsize; col++) {
				String colvalue = cols.get(col).getText();
				if (colvalue.equalsIgnoreCase("Learn to interact with Elements")) {
					String printingtext = cols.get(col+1).getText();
					
					System.out.println("My progress Value is "+printingtext);
				}
				
			}
			
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//Implicit
		
		WebDriverWait wait = new WebDriverWait(driver, 10);//Explicit
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//img[@alt='Table']"))));
       
	}

}
