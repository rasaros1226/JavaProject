package basicTesting;

public class TestScenario1 extends LaunchBrowser {

	static String expTitle = "Facebook – log in or sign up";
	public static void main(String[] args) {
		TestScenario1 obj = new TestScenario1();
		obj.launchChromeBrowser();
		
		String actTitle = driver.getTitle();
		driver.close();
		
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Test Scenario pass the actual title is " + actTitle);
		}
		else {
			System.out.println("Test Scenario fail the actual title is "+ actTitle);
		}
		
		
	}
}
