package jan21;

public interface InterfaceCommonMethod {

	String key1 ="webdriver.chrome.driver";
	//(copy as a path)path+filename
	String value1="H:\\VelocityTraining\\SetUps\\ChromeDriver97_SeleniumFile\\chromedriver_win32\\chromedriver.exe";
	
	String key2 ="webdriver.edge.driver";
	String value2="H:\\VelocityTraining\\SetUps\\EdgeDriver_SeleniumFile\\edgedriver_win64\\msedgedriver.exe";
	
	String key3 ="webdriver.gecko.driver";
	String value3="H:\\VelocityTraining\\SetUps\\FirefoxDriver_SeleniumFile\\geckodriver\\geckodriver.exe";
	
	String URL = "https://www.facebook.com";
	void launchChromeDriver();
	void launchEdgeDriver();
	void launchFirefoxDriver();
	
	
	
	
}
