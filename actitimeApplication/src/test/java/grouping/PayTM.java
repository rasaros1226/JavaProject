package grouping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PayTM {

	@Test
	public void method() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/recharge");
//		WebDriverWait w = new WebDriverWait(driver,5);
//		WebElement e1= w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'radio1')]")));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[contains(@class,'_3M_F')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
	
}
