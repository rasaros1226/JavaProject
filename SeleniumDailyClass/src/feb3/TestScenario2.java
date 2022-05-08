package feb3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestScenario2 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario2 obj = new TestScenario2();
		obj.launchBrowser();
		
		//drop down by index
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1 = new Select(day);
		s1.selectByIndex(25);
	
		//dropdown by value
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2 = new Select(month);
		s2.selectByValue("9");
		
		//dropdown by visible
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3 = new Select(year);
		s3.selectByVisibleText("1997");
		
		
		
		
		
		//to count how many years are there
		
		List<WebElement> years= s3.getOptions();
		int count = years.size();
		System.out.println(count);
		
		for(int i=0;i<count;i++)
		{
			String text = years.get(i).getText();
			System.out.println(text);
			
		}
		Thread.sleep(2000);
		driver.quit();
		
		
	}
}
