package actitimeTaskPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ArchivesTask {

	@FindBy(xpath = "//select[@class='controlBorder']")
	private WebElement customerDropDown;
	
	@FindBy(xpath = "//input[@id='showProjects']")
	private WebElement checkboxshowproject;
	
	@FindBy(xpath = "//input[@class='showCustomersButton']")
	private WebElement showresultbutton;
	
	WebDriver driver;
	
	public ArchivesTask(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver, this);
	}
	
	public void verifyCustomerDropDown(int index) {
		Select s= new Select(customerDropDown);
		s.selectByIndex(index);
		
	}
	
	public boolean getCheckBox() {
		
		boolean result= checkboxshowproject.isEnabled();
	    return result;
	}
	
	public void verifyShowResult() {
		showresultbutton.click();
	}
	
}
