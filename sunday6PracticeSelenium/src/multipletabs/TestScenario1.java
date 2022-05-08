package multipletabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		//1st scenario
		String parentID= driver.getWindowHandle();
		System.out.println("parent ID = "+parentID);
		
		
		driver.findElement(By.xpath("(//a[text()=' Click this link to start new Tab '])[1]")).click();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("MS DHONI" , Keys.ENTER);
		
		
//		Set<String> parentChildId= driver.getWindowHandles();
//		System.out.println("parentchild ID"+parentChildId);
//		
//		for(String i :  parentChildId) {
//			if(!i.equals(parentID)) {
//				driver.switchTo().window(i);
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("MS DHONI" , Keys.ENTER);
//				Thread.sleep(3000);
//				driver.close();
//			}	
//		}
//		
//		driver.switchTo().window(parentID);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2022/']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
//		
//		
//		//2nd scenario
//		
//		driver.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[1]")).click();
//		
//		Set<String> parentChildId2= driver.getWindowHandles();
//		
//		for(String i : parentChildId2) {
//			if(!i.equals(parentID)) {
//				driver.switchTo().window(i);
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemantahire333000@gmail.com");
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("DubaraMatPuchna");
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//button[@name='login']")).click();
//				Thread.sleep(10000);
//				driver.close();
//		
//			}
//		}
//		
//		driver.switchTo().window(parentID);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2019/']")).click();
//		Thread.sleep(3000);
//		driver.navigate().back();
//		
//		//3rd scenario
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("(//a[@href='http://www.facebook.com'])[2]")).click();
//		Thread.sleep(7000);
//		driver.navigate().back();
//		
//		
//		
//		
//		
//		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
