package feb5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TestScenario extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		//parent ID
		String parentId= driver.getWindowHandle();
		
		Thread.sleep(3000);
		
		
		//typecasting(explicite)
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		//how much we want to scroll down
		j.executeScript("scroll(0,2100)");
		Thread.sleep(3000);
		
		//switch to frame
		driver.switchTo().frame("a077aa5e");
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		//parent child ID
		Set<String> parentChildId =driver.getWindowHandles();
		
		
		//Switch to child ID
		for(String i: parentChildId) {
			if(!i.equals(parentId)) {
				driver.switchTo().window(i);
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//img[@class='custom-logo'])[1]")).click();
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		//switch to parentID
		driver.switchTo().window(parentId);
		Thread.sleep(3000);
		
		//scroll up
		j.executeScript("scroll(0,-2100)");
		
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='images/logo_1.png']")).click();
		
		
		
	}
}
