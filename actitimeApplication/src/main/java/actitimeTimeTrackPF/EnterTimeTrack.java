package actitimeTimeTrackPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterTimeTrack {

	@FindBy(xpath = "//div[@id='leaveButton_1_mainContentTd']")
	private WebElement clicktoleave;
	
	@FindBy(xpath = "//input[@id='LeavePopupRadio_TimeOff']")
	private WebElement enterleavetime;
	
	@FindBy(xpath = "//select[@name='LeaveTypeSelect']")
	private WebElement selectoption;
	
	@FindBy(xpath = "//input[@id='LeaveTimeSpent']")
	private WebElement leavetimespenttextbox;
	
	@FindBy(xpath = "//input[@name='LeavePopupOK']")
	private WebElement leaveokbutton;
	
	@FindBy(xpath = "//div[text()='Save']")
	private WebElement leavesavebutton;
	
	@FindBy(xpath = "(//input[@value='Save Changes'])[1]")
	private WebElement savechangesbutton;
	
	WebDriver driver;
	
	public EnterTimeTrack(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements( driver , this);
	}
	
	public void verifyClickToLeave() {
		clicktoleave.click();
	}
	
	public void verifyEnterLeaveTime() {
		enterleavetime.click();
	}
	
	public void setSelectOption(int index) {
		Select s = new Select(selectoption);
		s.selectByIndex(index);
	}
	
	public void setLeaveTimeSpentTextBox(String hour) {
		leavetimespenttextbox.clear();
		leavetimespenttextbox.sendKeys(hour);
	}
	
	public void verifyLeaveOkButton() {
		leaveokbutton.click();
	}
	
	public void verifyLeaveSaveButton() {
		leavesavebutton.click();
	}
	
	public void verifySaveChangesButton() {
		savechangesbutton.click(); 
	}
}
