package naukriInspect;

import java.util.Set;

import org.openqa.selenium.By;

public class TestScenario1 extends LaunchBrowser {

	
	public static void main(String[] args) {
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("//a[@title='Jobseeker Register']")).click();
		String child=driver.getWindowHandle();
		System.out.println(child);
		Set<String> s=driver.getWindowHandles();
	    System.out.println(s);
		
	}
	
	
	
}
