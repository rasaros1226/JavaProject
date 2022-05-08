package screenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Execution extends LaunchBrowser {

	public static void main(String[] args) throws IOException {
		Execution obj = new Execution();
		obj.launchBrowser();
		String path = "D:\\hemant.png";
		
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File f = new File(path);
		FileHandler.copy(ss,f);
		
		String path2="D:\\hemant1.png";
		WebElement e1 =driver.findElement(By.xpath("//button[@name='login']"));
		File ss2 = e1.getScreenshotAs(OutputType.FILE);
		File f1 = new File(path2);
		FileHandler.copy(ss2,f1);
		
		
	}
}
