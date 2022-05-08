package jan28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Execution2  extends LaunchBrowser{

	
	public static void main(String[] args) {
		Execution2 obj = new Execution2();
		obj.launchChromeBrowser();
		
		WebElement e1=driver.findElement(By.xpath("html/body/div[3]/input[2]"));
		e1.click();
		
		
	}
}
