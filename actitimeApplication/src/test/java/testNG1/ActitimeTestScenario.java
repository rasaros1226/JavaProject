package testNG1;


import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actitimeApplicationHomeLoging.ActitimeHomePagePF;
import actitimeApplicationHomeLoging.ActitimeUserCreatNewUserPF;
import actitimeApplicationHomeLoging.ActitimeUserPF;
import actitimeApplicationHomeLoging.ActtitimeLoginPagePF;


public class ActitimeTestScenario {
 

  
  WebDriver driver;	
  ActtitimeLoginPagePF loginobj;
  ActitimeHomePagePF homeobj;	
  ActitimeUserPF userobj;
  ActitimeUserCreatNewUserPF newuserobj;
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("opening browser");
	  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().deleteAllCookies();
	  
	  driver.get("http://localhost/login.do");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  loginobj = new ActtitimeLoginPagePF(driver);
	  
	  homeobj = new ActitimeHomePagePF(driver);
	  
	  userobj = new ActitimeUserPF(driver);
	  
	  newuserobj = new ActitimeUserCreatNewUserPF(driver);
}
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Login to application");
	  loginobj.setUsername();
	  loginobj.setPassword();
	  loginobj.verifyLoginbutton();
  }


  @Test
  public void createuser() {
	  System.out.println("create user scenario execution start");
	  
	  homeobj.verifyUser();
	  
	  userobj.verifyUser();
	  
	  newuserobj.setFirstName("Hemant");
	  
	  newuserobj.setMiddleName("Raju");
	  
	  newuserobj.setLastName("Ahire");
	  
	  newuserobj.setEmail("hemantahire148@gmail.com");
	  
	  newuserobj.setUserName("iamhemant");
	  
	  newuserobj.setPassword("Hemant@123");
	  
	  newuserobj.setRetypePassword("Hemant@123");
	  
	  JavascriptExecutor j = (JavascriptExecutor)driver;
	  j.executeScript("scroll(0,400)");
	  
	  newuserobj.verifyCreateUserButton();
	  
	  System.out.println("create user execution end");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("logout from application");
	  homeobj.verifyLogout();
  }
  
  
  @AfterClass
  public void afterClass() throws InterruptedException {
	  System.out.println("closing browser");
	  Thread.sleep(2000);
	  driver.quit();
  }

}
