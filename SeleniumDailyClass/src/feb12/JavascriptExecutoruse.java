package feb12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutoruse {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		WebElement e1 =driver.findElement(By.xpath("//input[@name='email']"));
		
		JavascriptExecutor j = (JavascriptExecutor)driver;
		
		//to send argument in text field
		j.executeScript("arguments[0].setAttribute('value' ,'Hemant Ahire')",e1);
		
		
		driver.navigate().to("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		driver.switchTo().frame("comment-editor");
		
		WebElement e2 =driver.findElement(By.xpath("//input[@name='postCommentSubmit']"));
		
		
		//for scrolling until the webelement
		j.executeScript("arguments[0].scrollIntoView(true);", e2);
		

		//for click on element
		j.executeScript("argumenys[0].click();", e2);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
}
