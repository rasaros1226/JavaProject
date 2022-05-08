package map;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	
	
 public static void main(String[] args) throws InterruptedException {
	String url = "https://www.google.co.in/maps/@18.8154265,76.7751434,7z?hl=en&authuser=0";
	 
	 System.setProperty("webdriver.chrome.driver", "D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.get(url);
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	 
	 driver.findElement(By.xpath("//button[@id='xoLGzf-T3iPGc']")).click();
	 
	 driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[4]")).sendKeys("pune");
	 
	 //Thread.sleep(3000);
	 
	 driver.findElement(By.xpath("(//input[@class='tactile-searchbox-input'])[5]")).sendKeys("mumbai" , Keys.ENTER);
	 
	 
}
}
