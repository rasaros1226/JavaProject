package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestScenario2 extends LaunchBorwser{
	
	public static void main(String[] args) throws InterruptedException {
		
		TestScenario2 obj = new TestScenario2();
		obj.launchChromeBrowser();
		
		WebDriver tab1= driver.switchTo().newWindow(WindowType.TAB);
		tab1.get(url2);
		
		WebDriver tab2 = driver.switchTo().newWindow(WindowType.TAB);
		tab2.get("http://www.whatsapp.com");
		

		WebDriver window1= driver.switchTo().newWindow(WindowType.WINDOW);
		window1.manage().window().maximize();
		window1.get(url);
		Thread.sleep(3000);
		window1.close();
		Thread.sleep(3000);
		driver.quit();
		
		
	}
	

}
