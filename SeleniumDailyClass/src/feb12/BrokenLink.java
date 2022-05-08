package feb12;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mmc\\Desktop\\ChromeDriver98_SeleniumFile\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		//link will hav tagName as a
		List<WebElement> elements =driver.findElements(By.tagName("a"));
		
		int count= elements.size();
		System.out.println(count);
		
		for(int i =0;i<count;i++) {
			WebElement element = elements.get(i);
			//link are always store in href attribute
			String attributeurl = element.getAttribute("href");
             
			try {
				URL url = new URL(attributeurl);
				
				HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
				httpURLConnect.setConnectTimeout(3000);
				httpURLConnect.connect();
				
				if(httpURLConnect.getResponseCode()==200) {
					System.out.println(attributeurl+ " - "+ httpURLConnect.getResponseCode()+"-" +httpURLConnect.getResponseMessage());
				}
				else
				{
					System.out.println(attributeurl+ " - " + httpURLConnect.getResponseCode()+""+httpURLConnect.getResponseMessage());
				}
				
					
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             			
		}
		
	}
	
}
