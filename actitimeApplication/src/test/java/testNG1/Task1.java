package testNG1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import actitimeApplicationHomeLoging.ActitimeHomePagePF;
import actitimeApplicationHomeLoging.ActtitimeLoginPagePF;
import actitimeTimeTrackPF.ActitimeTimeTrack;
import actitimeTimeTrackPF.EnterTimeTrack;
import actitimeTimeTrackPF.ViewTimeTrack;

public class Task1 {

	ActtitimeLoginPagePF loginobj;
	ActitimeHomePagePF homeobj;
	EnterTimeTrack entertimetrackobj;
	ViewTimeTrack viewtimetrackobj;
	ActitimeTimeTrack timetrackobj;
	WebDriver driver;

	@Test
	public void chromeTesting() {
		System.out.println("Open chrome browser");

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://localhost/login.do");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		loginobj = new ActtitimeLoginPagePF(driver);

		homeobj = new ActitimeHomePagePF(driver);

		entertimetrackobj = new EnterTimeTrack(driver);

		loginobj.setUsername();
		loginobj.setPassword();
		loginobj.verifyLoginbutton();

		entertimetrackobj.verifyClickToLeave();

		entertimetrackobj.setSelectOption(1);

		entertimetrackobj.setLeaveTimeSpentTextBox("4:00");

		entertimetrackobj.verifyLeaveOkButton();

		entertimetrackobj.verifyLeaveSaveButton();

		entertimetrackobj.verifySaveChangesButton();

		homeobj.verifyLogout();

		driver.quit();

		System.out.println("closing browser");
	}
	
	
	
	@Test
	public void firefoxTesting() {
		System.out.println("Open firefox browser");

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");

		driver = new FirefoxDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://localhost/login.do");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		loginobj = new ActtitimeLoginPagePF(driver);

		homeobj = new ActitimeHomePagePF(driver);

		viewtimetrackobj = new ViewTimeTrack(driver);

		timetrackobj = new ActitimeTimeTrack(driver);
		
		
		loginobj.setUsername();
		loginobj.setPassword();
		loginobj.verifyLoginbutton();

		timetrackobj.verifyViewTimeTrack();
		
		viewtimetrackobj.verifySelectCustomer();
		
		viewtimetrackobj.verifySelectedCustomer();
		
		viewtimetrackobj.verifySelectAll();
		
		viewtimetrackobj.verifyClose();

		homeobj.verifyLogout();
		
		
		driver.quit();

		System.out.println("closing firefox browser");
	}


}
