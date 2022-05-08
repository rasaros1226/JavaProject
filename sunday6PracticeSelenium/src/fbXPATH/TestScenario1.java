package fbXPATH;

import org.openqa.selenium.By;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) {
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		//absolute xpath
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form/div[1]/div[1]/input")).sendKeys("hemantahire333000@gmail.com");
		
		//relative xpath
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("DubaraMatPuchna");
		
		driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy')]")).click();
		
	}
}
