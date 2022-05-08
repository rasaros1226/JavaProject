package actitimeTimeTrackPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewTimeTrack {

	@FindBy(xpath ="//span[@id='ext-gen47']")
	private WebElement selectcustomer;
	
	@FindBy(xpath ="(//img[@class='x-form-radio'])[2]")
	private WebElement selectedcustomerradiobutton;
	
	@FindBy(id = "ext-gen133")
	private WebElement selectall;
	
	@FindBy(xpath = "//span[text()='Close']")
	private WebElement close;
	
	WebDriver driver;
	
	public ViewTimeTrack(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver , this);
	}
	
	public void verifySelectCustomer() {
		selectcustomer.click();
	}
	
	public void verifySelectedCustomer() {
		selectedcustomerradiobutton.click();
	}
	
	public void verifySelectAll() {
		selectall.click();
	}
	
	public void verifyClose() {
		close.click();
	}
	
	
}
