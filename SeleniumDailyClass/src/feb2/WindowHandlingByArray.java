package feb2;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class WindowHandlingByArray extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		
		WindowHandlingByArray obj =new WindowHandlingByArray();
		obj.launchBrowser();
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
		Thread.sleep(3000);
		
		Set<String> id= driver.getWindowHandles();
		
		ArrayList<String> indexid = new ArrayList<String>(id);
		
		String parent =indexid.get(0);
		String child = indexid.get(1);
		
		driver.switchTo().window(child);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("SRK");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		
		
		
	}
}
