package feb10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class TestScenario5 extends LaunchBrowser{

	public static void main(String[] args) {
		
		TestScenario5 obj = new TestScenario5();
		obj.launchBrowser();
		
//		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//				.withTimeout(30, TimeUnit.SECONDS)
//				.pollingEvery(1, TimeUnit.SECONDS)
//				.ignoring(Exception.class);
//		
		
	}
}
