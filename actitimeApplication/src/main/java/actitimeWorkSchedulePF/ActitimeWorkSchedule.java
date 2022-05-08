package actitimeWorkSchedulePF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeWorkSchedule {

	@FindBy(xpath = "//span[text()='Select the Number of Months to View']")
	private WebElement monthtoview;
	
	@FindBy(xpath = "//div[@id='format3']")
	private WebElement threemonthview;
	
	WebDriver driver;
	
	public ActitimeWorkSchedule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void verifyMonthView() {
		monthtoview.click();
	}
	
	public void verifyThreeMonthview() {
		threemonthview.click();
	}
	
}
