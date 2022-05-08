package loginFBbyxpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowserImplementation implements TestBaseFunctionality{


	static WebDriver driver;
	public void launchBrowser() {
		System.setProperty(key,value);
		
		driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		
		
		
	}
	
}
