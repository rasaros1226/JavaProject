package actitimeApplicationHomeLoging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeUserPF {

	@FindBy(xpath = "//span[text()='User']")
	private WebElement user;
	
	WebDriver driver;
	
	public ActitimeUserPF(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements( driver, this);
	}
	
	public void verifyUser() {
		user.click();
		
	}
	
}
