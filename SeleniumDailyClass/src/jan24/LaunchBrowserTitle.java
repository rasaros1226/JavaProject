package jan24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchBrowserTitle implements TestBaseFunctionality{
	
	static WebDriver driver;
	static String expTitle="Facebook – log in or sign up";
	
	public void launchBrowser() {
		System.setProperty(key, Value);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
		
		
		
		
	}
}
