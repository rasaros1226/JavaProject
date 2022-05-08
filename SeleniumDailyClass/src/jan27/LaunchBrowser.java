package jan27;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser implements TestBaseFunctionality{


	static WebDriver driver;
	
	public void launchEdgeBrowser() {

		System.setProperty(key, value);
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
		

		
	}

}
