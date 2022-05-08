package pomCoreClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLoginPagePOM {

	//declaration
	private WebElement username;
	private WebElement password;
	private WebElement loginbutton;
	WebDriver driver;
	
	
	//initialization
	public ActitimeLoginPagePOM(WebDriver driver) {
		this.driver = driver;
		
		username = driver.findElement(By.id("username"));
		password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		loginbutton = driver.findElement(By.id("loginButton"));	
	}
	
	
	
	//usage
	
	
	public void setActitimeLoginUsername() {
	username.sendKeys("admin");	
	}
	
	public void setActitimeLoginPassword() {
	password.sendKeys("manager");	
	}
	
	public void verifyActitimeLoginButton() {
	loginbutton.click();	
	}
}
