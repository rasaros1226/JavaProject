package actitime;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Execution {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get("http://localhost/login.do");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
		 driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		 
		 driver.findElement(By.xpath("(//img[@height='93'])[4]")).click();
		 
		 
		 WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(5));
		 WebElement e1= w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='ext-gen33']")));
		 e1.click();
		 
		 driver.findElement(By.xpath("//button[@id='ext-gen41']")).click();
		 
		 
		 List<WebElement> elements= driver.findElements(By.xpath("//ul[@class='x-menu-list']/li"));
		 int count = elements.size();
         System.out.println(count);
         
         for(int i =0; i< count; i++) {
        	 WebElement element= elements.get(i);
        	 
        	 String attri= element.getText();
             System.out.println(attri);    
             if(attri.equals("- New Customer -")) {
            	 element.click();
             }
             
         
         }
         driver.findElement(By.xpath("//img[@class='closeButton']")).click();
         
         driver.switchTo().alert().accept();
         
		 
		 
		 
		 
		 
		 Thread.sleep(3000);
		 
		 driver.quit();
	
	
	
	
	
	}
}
