package pomTestClasses;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomCoreClasses.ActitimeLoginPagePOM;
import pomCoreClasses.ActitimeTimeTrackPagePOM;

public class ActitimeTestScenario2Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("login to application");
		
		ActitimeLoginPagePOM obj = new ActitimeLoginPagePOM(driver);
		obj.setActitimeLoginUsername();
		obj.setActitimeLoginPassword();
		obj.verifyActitimeLoginButton();
		
		System.out.println("user sees the TimeTrack page and verify Enter time track logo ");
		
		ActitimeTimeTrackPagePOM obj2 = new ActitimeTimeTrackPagePOM(driver);
		obj2.verifyActitimeTimeTrackPagetitle();
		obj2.setActitimeTimeTrackTasksearchbox();
		
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("scroll(0,200)");
		
		Thread.sleep(3000);
		obj2.setActitimeTimeTrackSavechangesbutton();
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
