package insta;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exec {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe";
		String url="https://www.instagram.com/accounts/login/";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.tagName("input")).sendKeys("hemantahire148@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("DubaraMatPuchna");
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		
}
}