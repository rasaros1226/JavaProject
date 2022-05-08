package testNG1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import actitimeApplicationHomeLoging.ActitimeHomePagePF;
import actitimeApplicationHomeLoging.ActtitimeLoginPagePF;
import actitimeTaskPF.ActitimeTaskPF;
import actitimeTaskPF.ArchivesTask;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeTestScenario2chrome {

	
	ActtitimeLoginPagePF loginobj;
	ActitimeHomePagePF homeobj; 
	ActitimeTaskPF taskobj;
	ArchivesTask architaskobj;
	WebDriver driver;
    
	@BeforeClass
	public void beforeClass() {
	System.out.println("Opening chrome browser");
	
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("http://localhost/login.do");
	
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	loginobj = new ActtitimeLoginPagePF(driver);
	homeobj = new ActitimeHomePagePF(driver);
	taskobj = new ActitimeTaskPF(driver);
	architaskobj = new ArchivesTask(driver);
	
	}

	
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("login to the application");	
	loginobj.setUsername();
	loginobj.setPassword();
	loginobj.verifyLoginbutton();
	}
	
	
	
	@Test(priority=1)
	public void firstOption() {
      	System.out.println("Test execution started for Test Scenario first optin");
		
		homeobj.verifyTask();
      	
      	taskobj.verifyArchives();
      	
      	architaskobj.verifyCustomerDropDown(0);
      	
      	architaskobj.verifyShowResult();
      	
      	System.out.println("Test execution done for Test Scenario  first option ");
	
	}
	
	@Test(priority=2)
    public void secondOption() {
		System.out.println("Test execution started for Test Scenario second option");

		
		homeobj.verifyTask();
		
		taskobj.verifyArchives();
		
		architaskobj.verifyCustomerDropDown(1);
		
		architaskobj.verifyShowResult();
		
		System.out.println("Test execution done for Test Scenario second option");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("Logout the application");
	homeobj.verifyLogout();
	}

	
	@AfterClass
	public void afterClass() {
	System.out.println("chrome browser quit");	
	driver.quit();
	
	
	}

}
