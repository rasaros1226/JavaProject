package basicTesting;

public class TestScenario2 extends LaunchBrowser {

	static  String expUrl="https://www.facebook.com/";
	public static void main(String[] args) {
		TestScenario2 obj = new TestScenario2();
		obj.launchChromeBrowser();
		
		String actUrl= driver.getCurrentUrl();
		driver.close();
		
		if(expUrl.equals(actUrl)) {
			System.out.println("Test Scenario pass actual url is "+ actUrl);
			
		}
		else {
			System.out.println("Test Scenario fail actual url is "+ actUrl);
		}
		
	}
}
