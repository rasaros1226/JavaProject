package jan28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Execution  extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		Execution obj = new Execution();
		obj.launchChromeBrowser();
		
		WebElement e1=driver.findElement(By.tagName("input"));
		e1.sendKeys("Hemant Ahire");
		
		WebElement e2=driver.findElement(By.className("pwdclass"));
		e2.sendKeys("Hemant@123");
		
		//WebElement e3=driver.findElement(By.tagName("a"));
		//e3.click();
		
		WebElement e4=driver.findElement(By.className("emclass"));
		e4.sendKeys("hemant@1234.com");
		
		WebElement e5=driver.findElement(By.className("mnclass"));
		e5.sendKeys("9975001109");
		
		WebElement e6=driver.findElement(By.id("id_me01"));
		e6.click();
		
		WebElement e7=driver.findElement(By.className("ckclass"));
		e7.click();
		
		//WebElement e8=driver.findElement(By.linkText("Forgotton Password?"));
		//e8.click();
		
		//WebElement e9=driver.findElement(By.partialLinkText("on Pas"));
		//e9.click();
		
		driver.findElement(By.className("signuplink")).click();
		
		Thread.sleep(5000);
		driver.close();
		
	}
}
