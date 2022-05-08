package feb11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelHandling4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

		driver.manage().timeouts().pageLoadTimeout(5,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		FileInputStream src = new FileInputStream("C:\\Users\\mmc\\Desktop\\testData.xlsx");
	    Sheet s1= WorkbookFactory.create(src).getSheet("Sheet1");
	
	    double data = s1.getRow(1).getCell(3).getNumericCellValue();
	    //long data2 = (long) s1.getRow(1).getCell(3).getNumericCellValue();
	    long data1 =(long)data;
	    System.out.println(data1);
	    
	    WebElement e1 = driver.findElement(By.id("email"));
	    //e1.sendKeys(String.valueOf(data1));
	    e1.sendKeys(Long.toString(data1));
	    
	    
	
	    
	
	}
}
