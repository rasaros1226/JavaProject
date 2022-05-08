package basicCommands;

public class TestScenario1 extends LaunchBorwser {

	public static void main(String[] args) throws InterruptedException {
		
	
	TestScenario1 obj =new TestScenario1();
	obj.launchChromeBrowser();
	
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);
	driver.navigate().to(url2);
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.close();
	
	
	
	}
}
