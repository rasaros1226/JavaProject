package jan24;

public class VerifyTitle extends LaunchBrowserTitle {

	public static void main(String [] args) throws InterruptedException {
		VerifyTitle obj = new VerifyTitle();
		obj.launchBrowser();
		String actTitle=driver.getTitle();
		System.out.println("the title of our page is "+actTitle);
		
		if(expTitle.equals(actTitle)){
			System.out.println("Test Scenario is pass actutal Title is matched with expected Title ");
		}
		else {
			System.out.println("Test Scenario is fail actual Title is not matched with expected title Please check with Dev");
		}
			
		driver.quit();

	}
	
}
