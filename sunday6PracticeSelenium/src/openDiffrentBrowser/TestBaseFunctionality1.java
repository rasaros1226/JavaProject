package openDiffrentBrowser;

public interface TestBaseFunctionality1 {


	String key1 = "webdriver.edge.driver";
	String value1 = "D:\\hemant\\EdgeDriver_SeleniumFile\\edgedriver_win64\\msedgedriver.exe";
	
	String key2 = "webdriver.gecko.driver";
	String value2 = "D:\\hemant\\FirefoxDriver_SeleniumFile\\geckodriver\\geckodriver.exe";

	String url="http://www.facebook.com";
	
	void launchEdgeBrowser();
	void launchFirefoxBrowser();
}
