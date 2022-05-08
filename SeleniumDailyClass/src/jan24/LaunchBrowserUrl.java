package jan24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserUrl implements TestBaseFunctionality{

	
	static WebDriver driver;
	static String expUrl ="https://www.facebook.com/";
	
	public void launchBrowser() {
		
		System.setProperty(key, Value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		
	}
}
