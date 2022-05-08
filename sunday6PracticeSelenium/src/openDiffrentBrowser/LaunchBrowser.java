package openDiffrentBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser implements TestBaseFunctionality1 {

	static WebDriver driver;
	public void launchEdgeBrowser() {
		System.setProperty(key1, value1);
		
		driver = new EdgeDriver();
		
	}

	
	public void launchFirefoxBrowser() {
        System.setProperty(key2, value2);
        
        driver = new FirefoxDriver();
	}


}
