package jan20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxAuto {

	public static void main(String [] args) {
	
		System.setProperty("webdriver.gecko.driver","H:\\VelocityTraining\\SetUps\\FirefoxDriver_SeleniumFile\\geckodriver\\geckodriver.exe\\");
		WebDriver d = new FirefoxDriver();
		
	}
}
