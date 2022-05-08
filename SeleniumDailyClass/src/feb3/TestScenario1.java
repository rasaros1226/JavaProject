package feb3;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class TestScenario1  extends LaunchBrowser{
//take screenshot of webelement specially
	
	public static void main(String[] args) throws IOException {
		
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		//path for saving the screenshot
		String path="H:\\VelocityTraining\\A.png";
		
		//first find we element and store it
		WebElement e1= driver.findElement(By.xpath("//button[text()='Sign Up']"));
		
		//by using getScreenshot() method take screenshot of webelement
		File ss = e1.getScreenshotAs(OutputType.FILE);
		
		//saving path to f
		File f = new File(path);
		
		//screenshot will copy from ss to f 
		FileHandler.copy(ss, f);
		
	
		
	}

}
