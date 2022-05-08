package actitimeApplicationHomeLoging;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomePagePF {

	@FindBy(xpath = "(//img[@width='84'])[1]")
	private WebElement timetrack;
	
	@FindBy(xpath = "(//img[@width='84'])[2]")
	private WebElement task;
	
	@FindBy(xpath ="(//img[@width='84'])[3]")
	private WebElement report;
	
	@FindBy(xpath = "(//img[@width='84'])[4]")
	private WebElement users;
	
	@FindBy(xpath = "(//img[@width='84'])[5]")
	private WebElement workschedule;
	
	@FindBy(xpath = "//a[contains(@class,'logout')]")
	private WebElement logout;
	
	WebDriver driver;
	
	public ActitimeHomePagePF(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTimeTrack() {
		timetrack.click();
	}
	
	public void verifyTask() {
		task.click();
	}
	
	public void verifyReports() {
		report.click();
	}
	
	public void verifyUser() {
		users.click();
	}
	
	public void verifyWorkSchedule() {
		workschedule.click();
	}
	
	public void verifyLogout() {
		logout.click();
	}
}
