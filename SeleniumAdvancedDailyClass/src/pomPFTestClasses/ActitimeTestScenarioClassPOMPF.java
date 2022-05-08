package pomPFTestClasses;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pomPFCoreClasses.ActitimeHomePagePOMPF;
import pomPFCoreClasses.ActitimeLoginPagePOMPF;

public class ActitimeTestScenarioClassPOMPF {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");

		//chromeoptions are use to chgange browser setting and all
		ChromeOptions o = new ChromeOptions();
		
		//EAGER,NONE, NORMAL this three way we can pass 
		//it is use to load page fast,normal,none
		o.setPageLoadStrategy(PageLoadStrategy.EAGER);

		//without passing object above method are useless
		WebDriver driver = new ChromeDriver(o);

		//To avoid timeout exception we can use it 
		//if  page is not load within time it through exception timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.get("http://localhost/login.do");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		System.out.println("Login to application");

		ActitimeLoginPagePOMPF obj = new ActitimeLoginPagePOMPF(driver);
		Thread.sleep(2000);
		obj.setActitimeLoginUsername();
		Thread.sleep(2000);
		obj.setActitimeLoginPassword();
		Thread.sleep(2000);
		obj.verifyActitimeLoginButton();

		System.out.println("user sees home page and started verifiying the logo");

		ActitimeHomePagePOMPF obj2 = new ActitimeHomePagePOMPF(driver);
		Thread.sleep(2000);
		obj2.verifyActitimeLogo();
		Thread.sleep(2000);
		obj2.verifyActitimeLogoutButton();

		Thread.sleep(2000);
		driver.quit();

	}

}
