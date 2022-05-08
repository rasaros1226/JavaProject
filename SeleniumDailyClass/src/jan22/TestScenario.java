package jan22;

public class TestScenario extends LaunchBrowser {

	public static void main(String [] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchChromeBrowser();
		
		d.manage().window().maximize(); // size maximize window
		d.get(URL1); 
		Thread.sleep(3000); //delay of 3sec
		d.navigate().to(URL2);
		Thread.sleep(3000);
		d.navigate().back(); //navigate to back page
		Thread.sleep(3000);
		d.navigate().forward(); //navigate to forward page
		Thread.sleep(3000); //JRE library we have class
		d.navigate().to(URL3);
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.manage().window().minimize(); //Minimize window + size also minimize
		Thread.sleep(3000);
		
		d.close(); // it close the tab only
		
		
	}
}
