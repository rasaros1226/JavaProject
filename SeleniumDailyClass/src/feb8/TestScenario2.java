package feb8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestScenario2 extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
	
		TestScenario2 obj = new TestScenario2();
		obj.launchBrowser();
		
		
		
		//1st scenario
		driver.switchTo().frame(0);

		WebElement e1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement e2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a1 = new Actions(driver);
	//	a1.clickAndHold(e1).moveToElement(e2).release().build().perform();
		
		a1.dragAndDrop(e1, e2).perform();
		
		
		
		Thread.sleep(3000);
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		a1.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(3000);
		a1.sendKeys(Keys.PAGE_UP).perform();
		a1.sendKeys(Keys.PAGE_UP).perform();
		a1.sendKeys(Keys.PAGE_UP).perform();
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		WebElement e3 =driver.findElement(By.xpath("(//a[contains(text(),'jQuery UI')])[1]"));
		a1.click(e3).perform();
		
		Thread.sleep(3000);
		
		WebElement e4 =driver.findElement(By.xpath("//input[@placeholder = 'Search']"));
		a1.sendKeys(e4,"java" , Keys.ENTER).build().perform();
		
		Thread.sleep(3000);
		WebElement e5 = driver.findElement(By.xpath("//div[@id = 'content']"));
		a1.contextClick(e5).perform();
		
		Thread.sleep(3000);
		WebElement e6 = driver.findElement(By.xpath("//a[text()='Resizable']"));
		a1.doubleClick(e6).perform();
		Thread.sleep(3000);
		driver.close();
	
	}
	
}
