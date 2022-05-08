package dropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestScenario2 extends LaunchBrowser{

	public static void main(String[] args) {
		TestScenario2 obj = new TestScenario2();
		obj.launchBrowser();
		
		
		WebElement e1 = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s1 = new Select(e1);
		s1.selectByIndex(25);
		List<WebElement> option = s1.getOptions();
		System.out.println(option.size());
		
		for(int i =0;i<31;i++) {
			String option1 = option.get(i).getText();
			System.out.println(option1);
		}
		
	}
}
