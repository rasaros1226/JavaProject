package elementsbyLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenario1 extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario1 obj = new TestScenario1();
		obj.launchChromeBrowser();
		
		WebElement e1 = driver.findElement(By.tagName("input"));
		e1.sendKeys("Hemant Ahire");
		
		driver.findElement(By.className("pwdclass")).sendKeys("Hemant@123");
		
		WebElement e2 = driver.findElement(By.id("id_eal01"));
		e2.sendKeys("hemantahire148@gmail.com");
		
		driver.findElement(By.linkText("Forgotton Password?")).click();
		
		Thread.sleep(3000);
		driver.navigate().back();
		
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.partialLinkText("on Pa"));
		e3.click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.className("geclass")).click();
		driver.findElement(By.id("id_ck01")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("signuplink")).click();
		driver.close();
	}
}
