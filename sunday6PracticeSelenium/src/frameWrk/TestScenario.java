package frameWrk;

import org.openqa.selenium.By;

public class TestScenario extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		driver.findElement(By.tagName("input")).sendKeys("Hemant");
		
		driver.switchTo().frame("iframe");
		
		driver.findElement(By.id("ib_bd")).sendKeys("26/09/1997");
		driver.findElement(By.xpath("//input[@id='id_a']")).sendKeys("24");
		
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@value='Sign Up']")).click();
		
		
		
	}
}
