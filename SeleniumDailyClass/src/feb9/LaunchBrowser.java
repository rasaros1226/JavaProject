package feb9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser implements TestBaseFunctionality {

	static WebDriver driver;
	public void launchBrowser() {
		
		System.setProperty(key,value);
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//1st task
		driver.get(url);
		
		//2ndtask
		//driver.get(url2);
	}

}
