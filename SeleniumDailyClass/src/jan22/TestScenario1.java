package jan22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario1 obj = new TestScenario1();
		
		obj.launchChromeBrowser();
		Thread.sleep(2000);
		d.manage().window().maximize();
		Thread.sleep(2000);
		d.get(URL3);
		Thread.sleep(2000);
		
		
		WebDriver newTab=d.switchTo().newWindow(WindowType.TAB);
		newTab.get(URL1);
		Thread.sleep(2000);
		
		
		WebDriver newTab1=d.switchTo().newWindow(WindowType.TAB);
		newTab1.get(URL2);
		Thread.sleep(2000);
		
		
		
		WebDriver newTab2=d.switchTo().newWindow(WindowType.WINDOW);
		newTab2.get(URL2);
		
		d.quit();
		
		
		
	}
}
