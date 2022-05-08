package feb8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestScenario extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//1st way to drag and drop
		//action performing on driver so we pass driver 
		Actions a1 = new Actions(driver);
		
		//a1.clickAndHold(e1).moveToElement(e2).release(e1).build().perform();
		
		//2nd way to drag and drop
		
		a1.dragAndDrop(e1, e2).perform();
		
		Thread.sleep(3000);
		
		
		//to scroll down
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		
		Thread.sleep(3000);
		
		a1.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(3000);
		
		//to click on logo
		driver.switchTo().parentFrame();
		
		WebElement e3 = driver.findElement(By.xpath("(//a[contains(text(),'jQuery UI')])[1]"));
		
		a1.click(e3).perform();
		
		//to send input on webelement
		WebElement e4 = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		
		a1.sendKeys(e4, "Hemant").perform();
		
		
		Thread.sleep(3000);
		
		//to right click on WebElement
		WebElement e5= driver.findElement(By.xpath("//a[text()='API Documentation']"));
		
		a1.contextClick(e5).perform();
		
		Thread.sleep(3000);
		
		
		//to double click on WebElement
		WebElement e6 = driver.findElement(By.xpath("//a[text()='About']"));
		a1.doubleClick(e6);
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
