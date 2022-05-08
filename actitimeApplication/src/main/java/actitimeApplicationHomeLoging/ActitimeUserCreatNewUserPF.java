package actitimeApplicationHomeLoging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeUserCreatNewUserPF {

	@FindBy(xpath = "//input[@id='userDataLightBox_firstNameField']")
	private WebElement firstname;
	
	@FindBy(xpath = "//input[@id='userDataLightBox_middleNameField']")
	private WebElement middlename;
	
	@FindBy(xpath = "//input[@id='userDataLightBox_lastNameField']")
	private WebElement lastname;
	
	@FindBy(xpath = "//input[@id='userDataLightBox_emailField']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='userDataLightBox_usernameField']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='userDataLightBox_passwordField']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='userDataLightBox_passwordCopyField']")
	private WebElement retypepassword;
	
	@FindBy(xpath = "//div[@class='buttonIcon']")
	private WebElement createuserbutton;
	
	WebDriver driver;
	
	
	public ActitimeUserCreatNewUserPF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements( driver, this);
	}
	
	public void setFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void setMiddleName(String mname) {
		middlename.sendKeys(mname);
	}
	
	public void setLastName(String lname) {
		lastname.sendKeys(lname);
	}
	
	public void setEmail(String emailip) {
		email.sendKeys(emailip);
	}
	
	public void setUserName(String usernameip) {
		username.sendKeys(usernameip);
	}
	
	public void setPassword(String passwordip) {
		password.sendKeys(passwordip);
	}
	public void setRetypePassword(String repasswordip) {
		retypepassword.sendKeys(repasswordip);
	}
	
	public void verifyCreateUserButton() {
		createuserbutton.click();
	}
}
