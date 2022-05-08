package jan21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplementClass implements InterfaceCommonMethod {

	static WebDriver d;
	
	@Override
	public void launchChromeDriver() {
		System.setProperty(key1, value1);
		d = new ChromeDriver();
		d.get(URL);
	}

	
	@Override
	public void launchEdgeDriver() {
		System.setProperty(key2, value2);
		d = new EdgeDriver();
		d.get(URL);
	}


	@Override
	public void launchFirefoxDriver() {
		System.setProperty(key3, value3);
		d=new FirefoxDriver();
		d.get(URL);
		
		
	}

}
