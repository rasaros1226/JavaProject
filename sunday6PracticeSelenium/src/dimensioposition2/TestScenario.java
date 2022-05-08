package dimensioposition2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class TestScenario extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		Dimension d1 = driver.manage().window().getSize();
		System.out.println(d1.getWidth());
		System.out.println(d1.getHeight());
		
		Dimension set = new Dimension(500, 700);
		driver.manage().window().setSize(set);
		
		Point p1 =driver.manage().window().getPosition();
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		
		Point set2 = new Point(693,372);
		driver.manage().window().setPosition(set2);
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
