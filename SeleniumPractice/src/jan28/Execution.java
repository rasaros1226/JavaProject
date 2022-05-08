package jan28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Execution extends LaunchBrowser {

	public static void main(String[] args) {
		Execution obj = new Execution();
		obj.launchBrowser();
		//firstname
		WebElement e1 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input"));
		e1.sendKeys("Hemant");
		
		//surname
		WebElement e2= driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input"));
		e2.sendKeys("Ahire");
		
		//mobile
		WebElement e3= driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form/div[1]/div[2]/div[1]/div[1]/input"));
		e3.sendKeys("9975001109");
		
		//password
		WebElement e4 = driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/input"));
		e4.sendKeys("Hemant@123");
		
		//bdate
		WebElement e5 = driver.findElement(By.id("day"));
		e5.click();
		e5.sendKeys("26");
		e5.click();
		
		
		
	}
}
