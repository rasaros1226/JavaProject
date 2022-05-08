package multipletabs;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TestScenarioExecution extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException, IOException {
		
		TestScenarioExecution obj = new TestScenarioExecution();
		obj.launchBrowser();
		
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		Set<String> parentChildID = driver.getWindowHandles();
		System.out.println(parentChildID);
		
		for(String i: parentChildID) {
			if(!i.equals(parentID)) {
				driver.switchTo().window(i);
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SRK", Keys.ENTER );
				
				
				String path="H:\\Hemant.png";
				
				File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File ss = new File(path);
				FileHandler.copy(f, ss);
				
				Thread.sleep(3000);
				driver.close();
				
			}
		}
		
		
		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2022/']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
		
		
		
		//2ndScenario
		
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
		
		Set<String> parentChildID1= driver.getWindowHandles();
		System.out.println(parentChildID1);
		
		for(String i:parentChildID1) {
			if(!i.equals(parentID)) {
				driver.switchTo().window(i);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemantahire333000@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("DubaraMatPuchna");
				driver.findElement(By.xpath("//button[@name='login']")).click();
				driver.findElement(By.xpath("(//div[@class='mm8kr34x i09qtzwb rq0escxv n7fi1qx3 pmk7jnqg j9ispegn kr520xx4'])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//i[@class='hu5pjgll eb18blue'])[1]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[@dir='auto'])[9]")).click();
			}
		}
	
		
		
		
	}
	
	
}
