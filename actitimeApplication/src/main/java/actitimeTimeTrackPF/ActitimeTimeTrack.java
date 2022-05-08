package actitimeTimeTrackPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTimeTrack {

	@FindBy(xpath = "//a[text()='View Time-Track']")
	private WebElement viewtimetrack;
	
	@FindBy(xpath = "//a[text()='Enter Time-Track']")
	private WebElement entertimetrack;
	
	WebDriver driver;
	
	
	public ActitimeTimeTrack(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements( driver, this);
	}
	
	public void verifyEnterTimeTrack() {
		entertimetrack.click();
	}
	
	public void verifyViewTimeTrack() {
		
		viewtimetrack.click();
	}
}
