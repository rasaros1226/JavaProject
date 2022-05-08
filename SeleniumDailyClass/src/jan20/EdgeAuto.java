package jan20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeAuto {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "H:\\VelocityTraining\\SetUps\\EdgeDriver_SeleniumFile\\edgedriver_win64\\msedgedriver.exe");
	
		WebDriver d = new EdgeDriver();
	}
}
