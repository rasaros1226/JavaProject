package loginFBbyxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ExecutionClass extends LaunchBrowserImplementation{

	public static void main(String[] args) {
		ExecutionClass obj = new ExecutionClass();
		obj.launchBrowser();
		
		WebElement e1 = driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]"));
		e1.sendKeys("hemantahire333000@gmail.com");
		
		WebElement e2 = driver.findElement(By.xpath("//input[contains(@name,'pass')]"));
		e2.sendKeys("DubaraMatPuchna");
		
		WebElement e3 = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		e3.click();
		
		
		
	}
	
	
	
}
