package feb12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TableDynamic2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
		
		driver.get("https://ui.cogmento.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hemantahire2609@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hemant@123");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		Thread.sleep(3000);
		
		Actions a1 = new Actions(driver);
		WebElement e1= driver.findElement(By.xpath("//div[@id='main-nav']"));
		a1.moveToElement(e1).perform();
		
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
		WebElement e2 = driver.findElement(By.xpath("//div[@id='dashboard-toolbar']"));
		a1.moveToElement(e2).perform();
		
		Thread.sleep(3000);
		String before ="//table[@class='ui celled sortable striped table custom-grid']/tbody/tr[";
		String after = "]/td[2]";
		
		for(int i=1;i<=5;i++) {
			WebElement e3 = driver.findElement(By.xpath(before+i+after));
			String Text = e3.getText();
			System.out.println(Text);
			if(Text.equals("Niraj Wankhede")) {
				driver.findElement(By.xpath(before+i+"]/td[1]")).click();
			}
		}
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
