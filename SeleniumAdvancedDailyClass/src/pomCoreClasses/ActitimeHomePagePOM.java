package pomCoreClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeHomePagePOM {

	//declaration
	
	private WebElement logo;
	private WebElement logoutbutton;
    WebDriver driver;
	
	
	//initialization
	public ActitimeHomePagePOM(WebDriver driver) {
		this.driver = driver;
		logo = driver.findElement(By.xpath("//img[@width='179']"));
		logoutbutton = driver.findElement(By.xpath("//a[text()='Logout']"));
		
	}
	
	
	//usage
	
	public void verifyActitimeLogo() {
		boolean result = logo.isDisplayed();
		if(result==true) {
			System.out.println("Test scenario pass and logo is displayed");
		}
		else
		{
			System.out.println("Test scenario fail and logo is not displayed");
		}
	}
	
	public void verifyActitimeLogoutButton() {
		logoutbutton.click();
		
	}	
}
