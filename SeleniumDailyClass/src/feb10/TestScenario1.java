package feb10;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenario1 extends LaunchBrowser{

	public static void main(String[] args) {
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		//sometime what happen xpath or locator is correct but browser takes time to load 
		//the webelement 
		//to match the speed of our tool and application speed we need to give wait
		//1st way it is old avaialable in 3.141.59
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//2nd way updated available in new Selenium WebDriver 4
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement logoPaytm = driver.findElement(By.xpath("//a[@class='wpwl']")); 
		
		boolean check = logoPaytm.isDisplayed();
		
		if(check==true) {
			System.out.println("Test Scenario is pass Logo is displayed");
		}
		
		else {
			System.out.println("Test Scenario is fail Logo is not displayed");
		}
		
		
	}
}
