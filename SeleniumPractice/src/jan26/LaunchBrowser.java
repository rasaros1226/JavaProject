package jan26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\VelocityTraining\\SetUps\\ChromeDriver97_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
	
	}
}
