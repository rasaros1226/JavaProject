package jan26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEdgeFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","H:\\VelocityTraining\\SetUps\\EdgeDriver_SeleniumFile\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		System.setProperty("webdriver.gecko.driver","H:\\VelocityTraining\\SetUps\\FirefoxDriver_SeleniumFile\\geckodriver\\geckodriver.exe");
		
		WebDriver driver1 = new FirefoxDriver();
		
	}
}
