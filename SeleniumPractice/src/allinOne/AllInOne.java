package allinOne;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllInOne {

//	static String url = "https://www.facebook.com";

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","D:\\hemant\\ChromeDriver98_SeleniumFile\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

	//	driver.get(url);
		
		driver.navigate().to("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		
//		File ss= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File f = new File("D:\\screenshot.png");
//		FileHandler.copy(ss, f);
//		
//		WebElement e1= driver.findElement(By.xpath("//font[contains(text(),'THIS IS A DEMO PAGE FOR TESTING')]"));
//		File ss1 = e1.getScreenshotAs(OutputType.FILE);
//		File f1 = new File("D:\\\\screenshot1.png");
//		FileHandler.copy(ss1, f1);
//		
//		Dimension d = new Dimension(400,600);
//		driver.manage().window().setSize(d);
//		
//		
//		Point p = new Point(600,300);
//		driver.manage().window().setPosition(p);
//		
//		
//		String v = driver.getPageSource();
//		System.out.println(v);
////		
////		
//		Select s = new Select(e1);
//		List<WebElement> e12 = s.getOptions();
//		
//		int size1=e12.size();
//		
//		for(int i=0;i<size1;i++) {
//			WebElement element = e12.get(i);
//			String text =element.getText();
//			System.out.println(text);
//			
//			
//		}
		
//		driver.switchTo().defaultContent();
//		JavascriptExecutor j =(JavascriptExecutor)driver;
//		j.executeScript("scroll(0,500)");
//	    
	  WebElement e1= driver.findElement(By.xpath("//button[text()='Automation Tools']"));

	    e1.isDisplayed();
	    e1.isSelected();
	    e1.isEnabled();
	    Actions a = new Actions(driver);
	    a.moveToElement(e1).perform();
	
	    List<WebElement> elements = driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
	    
	    int count = elements.size();
	    
	    for(int i=0;i<count;i++) {
	    	WebElement element= elements.get(i);
	    	String Text=element.getText();
	    	if(Text.equals("TestNG")) {
	    		a.click(element).perform();
	    		
	    		break;
	    	}
	    }
	    
	    driver.switchTo().alert().getText();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    WebDriverWait w = new WebDriverWait(driver,10);
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));	    
	
	}
	
	
	
	
	
}
