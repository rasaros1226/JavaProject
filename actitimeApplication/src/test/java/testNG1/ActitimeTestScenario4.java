package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import actitimeApplicationHomeLoging.ActitimeHomePagePF;
import actitimeApplicationHomeLoging.ActtitimeLoginPagePF;
import actitimeWorkSchedulePF.ActitimeWorkSchedule;

public class ActitimeTestScenario4 {

	WebDriver driver;
	ActtitimeLoginPagePF loginobj;
	ActitimeHomePagePF homeobj;
	ActitimeWorkSchedule workscheduleobj;
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("opening application");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		loginobj = new ActtitimeLoginPagePF(driver);
		
		homeobj = new ActitimeHomePagePF(driver);
		
		workscheduleobj = new ActitimeWorkSchedule(driver);
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("login to the application");
		loginobj.setUsername();
		
		loginobj.setPassword();
		
		loginobj.verifyLoginbutton();
		
		homeobj.verifyWorkSchedule();
	}
	
	@Test
	public void test1() {
		System.out.println("test execution start");
		workscheduleobj.verifyMonthView();
		
		workscheduleobj.verifyThreeMonthview();;
		
		System.out.println("test execution end");
	}
	
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("logout to application");
		homeobj.verifyLogout();
	}
	
	
	@AfterClass
	public void afterclass() {
		System.out.println("closing browser");
		driver.quit();
	}
	
	
	
	
	
	
}
