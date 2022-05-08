package screenshtots1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshots extends LaunchBrowser {

	public static void main(String[] args) throws IOException, InterruptedException {
		TakeScreenshots obj = new TakeScreenshots();
		obj.launchBrowser();
		
		
		String path = "D:\\A.png";
		File ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileHandler.copy(ss, f);
		
		
		String path2 ="D:\\B.png";
		WebElement e1 = driver.findElement(By.xpath("//button[@name='login']"));
		File ss1 = e1.getScreenshotAs(OutputType.FILE);
		File f1 = new File(path2);
		FileHandler.copy(ss1, f1);
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
