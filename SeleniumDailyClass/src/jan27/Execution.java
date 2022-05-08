package jan27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Execution extends LaunchBrowser{

	
	public static void main(String[] args) throws InterruptedException {
		Execution obj = new Execution();
		obj.launchEdgeBrowser();
		
		WebElement El=driver.findElement(By.tagName("input"));
		El.sendKeys("Hemant Ahire");
		
		driver.findElement(By.className("pwdclass")).sendKeys("Hemant@123");
		
		
		Thread.sleep(5000);
		
		driver.close();
		
	}
}
