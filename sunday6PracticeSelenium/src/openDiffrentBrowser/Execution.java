package openDiffrentBrowser;

public class Execution extends LaunchBrowser {

	public static void main(String[] args) {
		
		Execution obj = new Execution();
		obj.launchEdgeBrowser();
		
		driver.get(url);
		
		obj.launchFirefoxBrowser();
		driver.get(url);
	}
}

