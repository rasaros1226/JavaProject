package jan29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class Execution extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	
	Execution obj = new Execution();
	obj.launchBrowser();
	
//	driver.navigate().to("https://facebook.com");
	
//	Thread.sleep(2000);
//	
//	driver.navigate().back();
//	
//	Thread.sleep(2000);
//	
//	driver.navigate().forward();
//	
//	WebDriver d=driver.switchTo().newWindow(WindowType.TAB);
//	
//	d.get("http://instagram.com");
	
//	String d1 = driver.getCurrentUrl();

//	System.out.println(d1);
	
//	String d2=driver.getTitle();
//	System.out.println(d2);
	

	WebElement e1 = driver.findElement(By.name("firstname"));
	e1.sendKeys("Hemant");

	
	
	}
}
