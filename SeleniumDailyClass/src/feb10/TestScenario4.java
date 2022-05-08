package feb10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestScenario4 extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario4 obj = new TestScenario4();
		obj.launchBrowser();
		
		Thread.sleep(3000);
		//WebDriverWait o = new WebDriverWait(driver,5); 
		WebDriverWait o = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		
		WebElement e1 = o.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Buy FASTag']")));
		e1.click();
		
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}
}
