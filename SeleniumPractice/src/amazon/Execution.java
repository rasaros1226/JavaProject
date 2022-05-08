package amazon;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Execution {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		WebElement e1= driver.findElement(By.xpath("(//span[contains(@class,'nav-icon nav-arrow')])[2]"));
		
		Thread.sleep(2000);
		
		Actions a1 = new Actions(driver);
		a1.moveToElement(e1).perform();
		
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@id='nav-al-your-account']/a"));
		
		int count = e2.size();
		System.out.println(count);
		
		
		
		
		
	}
}
