package feb2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class TestScenario2 extends LaunchBrowser{

	public static void main(String[] args) throws IOException {
		
	
	TestScenario2 obj = new TestScenario2();
	obj.launchBrowser();
	
	//how to take screenshot
	String path="H:\\VelocityTraining\\hemant.png";
	
	//import File from JRE
	//import TakeScreenshot from Selenium
	//FileHandler will give compilation error bcz
	//it can occur IOexceptions Throw IOException
	
	File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File r = new File(path);
	FileHandler.copy(ss, r);
	
	
	
	
	
	
	}
}
