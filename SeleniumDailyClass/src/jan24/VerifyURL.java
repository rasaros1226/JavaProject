
package jan24;

public class VerifyURL extends LaunchBrowserUrl {

	public static void main(String[] args) throws InterruptedException {
		VerifyURL obj = new VerifyURL();
		obj.launchBrowser();

		String actUrl=driver.getCurrentUrl();
		System.out.println("Actual URL of page is "+actUrl);
	    if(expUrl.equals(actUrl)) {
	        System.out.println("Test Scenario is Pass Actual URL is matched with Expected URL ");	
	    }
	    else {
	    	System.out.println("Test Scenario is Fail Log the defect");
	    }
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
