package pomPFCoreClasses;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePagePOMPF {

	//declaration
	
	@FindBy(xpath = "//img[@width='179']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutbutton;
    
	WebDriver driver;
	
	
	//initialization
	public ActitimeHomePagePOMPF(WebDriver driver) {
		PageFactory.initElements( driver , this);
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
