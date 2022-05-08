package feb2;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();

		//1st scenario
		// only parent id
		String parentID = driver.getWindowHandle();
		System.out.println(parentID);

		driver.findElement(By.xpath("//a[text()=' Click this link to start new Tab ']")).click();

		// parent+child id
		Set<String> parentChildID = driver.getWindowHandles();
		System.out.println(parentChildID);

		//1st for each loop
		for (String i : parentChildID) {

			if (!i.equals(parentID)) {

				driver.switchTo().window(i);
				driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SRK", Keys.ENTER);

				Thread.sleep(3000);
				driver.close();
			}

		}

		
		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='post-count-link']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
		
		
		//2nd scenario
		driver.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();

		// for 2nd tab when child change 2nd time
		Set<String> parentChildID2 = driver.getWindowHandles();
		System.out.println(parentChildID2);

		//2nd for each loop
		for (String i : parentChildID2) {
			if (!i.equals(parentID)) {
				driver.switchTo().window(i);
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hemantahire333000@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("DubaraMatPuchna");
				driver.findElement(By.xpath("//button[@name='login']")).click();
				Thread.sleep(15000);
				driver.close();
			}
		}

		driver.switchTo().window(parentID);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2019/']")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		
		
		
		//3rd scenario
		driver.findElement(By.xpath("//a[contains(text(),' Click this link to start  Session in same window')]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2017/']")).click();
		Thread.sleep(3000);

		driver.quit();

	}
}
