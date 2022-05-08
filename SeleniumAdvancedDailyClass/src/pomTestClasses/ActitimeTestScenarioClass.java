package pomTestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomCoreClasses.ActitimeHomePagePOM;
import pomCoreClasses.ActitimeLoginPagePOM;

public class ActitimeTestScenarioClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		System.out.println("Login to application");
		
		ActitimeLoginPagePOM obj = new ActitimeLoginPagePOM(driver);
		Thread.sleep(2000);
		obj.setActitimeLoginUsername();
		Thread.sleep(2000);
		obj.setActitimeLoginPassword();
		Thread.sleep(2000);
		obj.verifyActitimeLoginButton();
		
		System.out.println("user sees home page and started verifiying the logo");
		
		ActitimeHomePagePOM obj2 = new ActitimeHomePagePOM(driver);
		Thread.sleep(2000);
		obj2.verifyActitimeLogo();
		Thread.sleep(2000);
		obj2.verifyActitimeLogoutButton();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
	
	
}
