package pomPFCoreClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPagePOMPF {

	//declaration
	

	@FindBy( id= "username")
	private WebElement username;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement password;
	
	@FindBy(id = "loginButton")
	private WebElement loginbutton;
	
	WebDriver driver;
	
	
	//initialization
	public ActitimeLoginPagePOMPF(WebDriver driver) {
		PageFactory.initElements(driver, this);
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
