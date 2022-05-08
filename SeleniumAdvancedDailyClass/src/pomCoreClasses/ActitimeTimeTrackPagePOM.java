package pomCoreClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeTimeTrackPagePOM {

	//declaration
	private WebElement pagetitle;
	private WebElement tasksearchbox;
	private WebElement savechangesbutton;
	WebDriver driver;
	
	//initialization
	
	public ActitimeTimeTrackPagePOM(WebDriver driver) {
		this.driver =driver;
		pagetitle = driver.findElement(By.xpath("//td[contains(text(),'Enter Time-Track')]"));
		tasksearchbox = driver.findElement(By.xpath("//input[@id='taskSearchControl_field']"));
		savechangesbutton = driver.findElement(By.xpath("//input[@id='SubmitTTButton']"));	
	}
	
	
	//usage
	
	public void verifyActitimeTimeTrackPagetitle() {
		boolean result = pagetitle.isDisplayed();
		if(result == true) {
			System.out.println("Test Scenario pass and title is displayed");
		}
		else
		{
			System.out.println("Test Scenario fail and title is not displayed");
		}
	}
	
	public void setActitimeTimeTrackTasksearchbox() {
		tasksearchbox.sendKeys("Hemant");
	}
	
	public void setActitimeTimeTrackSavechangesbutton() {
		savechangesbutton.click();
	}
}
