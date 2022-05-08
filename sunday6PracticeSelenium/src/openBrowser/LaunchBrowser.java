package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser implements TestBaseFunctionality {

	
	public void launchChromeBrowser() {
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
	}

}
