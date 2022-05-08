package feb9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestScenario extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	
		TestScenario obj = new TestScenario();
		obj.launchBrowser();
		
		WebElement e1 =driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
		
		Actions a1 = new Actions(driver);
		
		//only move cursour to the webelement
		a1.moveToElement(e1).perform();
		
		//store all webelements
		List<WebElement> elements =driver.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		//get size total cuount of webelement
		int count= elements.size();
		System.out.println("Total count of dropdown content: "+count);
		
		//to perform particular action 
		
		for(int i=0;i<count;i++) {
		
			//store webelement one by one in element variable
			WebElement element=  elements.get(i);
			
			//to get attribute of webelement it is string and then we compare it
		     String attribute =element.getAttribute("innerHTML");
		     
			 System.out.println(attribute);
		     //compare the webelement with another we want to perform action on TestNg
			 if(attribute.equals("TestNG"))
		     {
				 
		    	 element.click();
		    	 break;
		     }
		}
		
		
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();
	}
}
