package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestScenario  extends LaunchBrowser{

	public static void main(String[] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(e1);
		s1.selectByIndex(25);
		
		WebElement e2 = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(e2);
		s2.selectByValue("9");
		
		WebElement e3 = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(e3);
		s3.selectByVisibleText("1997");
		
		
		 List<WebElement> options = s3.getOptions();
		 System.out.println(options.size());
		 
		
		 for(int i=0;i<118;i++) {
			String years = options.get(i).getText();
			System.out.println(years);
		 }
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
