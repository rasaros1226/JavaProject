package feb10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenario3 extends LaunchBrowser {

	public static void main(String[] args) {
		TestScenario3 obj = new TestScenario3();
		obj.launchBrowser();
		
		WebElement e1 = driver.findElement(By.xpath("//input[@type='tel']"));
		boolean check = e1.isEnabled();
		
		if(check == true) {
			System.out.println("Test scenario pass");
		}
		else 
		{
			System.out.println("Test Scenario fail");
		}
		
	}
}
