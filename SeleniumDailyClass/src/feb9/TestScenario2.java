package feb9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenario2  extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario2 obj = new TestScenario2();
		obj.launchBrowser();
		
		//1st click button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		//3rd click button
		
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]"));
		e2.click();
		Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		//if we give comment to both we will get UnhandledAlertException
		
		
		Thread.sleep(3000);
		
		//4th click button
		
		driver.findElement(By.xpath("//button[contains(@id,'confirmButton')]")).click();
		Thread.sleep(3000);
		String exptext ="Do you confirm action?"; 
		String acttext = driver.switchTo().alert().getText();
		
		
		if(exptext.equals(acttext)) {
			System.out.println("Test Pass, text is "+ acttext);
		}
		
		else {
			System.out.println("Test Fail, text is "+ acttext);
		}
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(6000);
		driver.quit();
	}
}
