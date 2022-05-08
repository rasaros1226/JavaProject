package loginfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Execution extends LaunchBrowser {
	
	public static void main(String[] args) {
		Execution obj = new Execution();
		obj.launchChromeBrowser();
		
		
		WebElement e1 =driver.findElement(By.id("email"));
		e1.sendKeys("hemantahire333000@gmail.com");
		
		
		WebElement e2 =driver.findElement(By.id("pass"));
		e2.sendKeys("DubaraMatPuchna");
		
		
		WebElement e3 =driver.findElement(By.tagName("button"));
		e3.click();
		
	}

}
