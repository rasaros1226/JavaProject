package jan20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeAuto {

	public static void main(String[] args) {
		
		//System class is in JRE library 
		//setProperty() is method in System class 
		//arguments of this method is key and value
		System.setProperty("webdriver.chrome.driver","H:\\VelocityTraining\\SetUps\\ChromeDriver97_SeleniumFile\\chromedriver_win32\\chromedriver.exe");
	
		//upcasting
		WebDriver d = new ChromeDriver();
	    
		
	}
}
