package feb1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestCase1 extends LaunchBrowser {

	
	public static void main(String[] args) {
		TestCase1 obj = new TestCase1();
		obj.launchBrowser();
		
		//current window/tab id
		String parentID=driver.getWindowHandle();
		System.out.println("current window ID is "+parentID);
		
		WebDriver d=driver.switchTo().newWindow(WindowType.TAB);
		d.navigate().to("http://www.whatsapp.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://www.instagram.com");
		
		//for every window/tab id
		Set<String> parentChildID=driver.getWindowHandles();
		System.out.println(parentChildID);
	}
}
