package feb10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenario2 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario2 obj = new TestScenario2();
		obj.launchBrowser();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement e1 = driver.findElement(By.id("radio0"));
		boolean check = e1.isSelected();
		
		if(check == true) {
			System.out.println("Test Scenario pass");
		}
		else {
			System.out.println("Test Scenario fail");
		}
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}
}
