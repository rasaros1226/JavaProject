package feb12;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableDynamic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(35,TimeUnit.SECONDS);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("scroll(0,1800)");

		Thread.sleep(3000);
		//in html table
		//tr = row
		//th = headlines
		//td = column
		
		
		for(int i=1;i<=7;i++) {
			for(int j = 1;j<=4;j++) {
				if(i==1) {
					WebElement element =driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/th["+j+"]"));
				    String Text1= element.getText();
				    System.out.print(Text1+" ");
				}
				if(i>1) {
				
				WebElement e1 = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr["+i+"]/td["+j+"]"));	
		        String Text = e1.getText();
		        System.out.print(Text+" ");
				}
			}
			System.out.println();
		}
		
		Thread.sleep(3000);
		driver.quit();
		
	}
}
