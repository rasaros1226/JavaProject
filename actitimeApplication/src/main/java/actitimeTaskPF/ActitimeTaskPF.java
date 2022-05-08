package actitimeTaskPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeTaskPF {

	@FindBy(xpath ="//a[text()='Archives']")
	private WebElement archives;

	WebDriver driver;
	
	public ActitimeTaskPF(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements( driver, this);	
	}
	
	public void verifyArchives() {
		archives.click();
	}
}
