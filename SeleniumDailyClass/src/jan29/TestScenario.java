package jan29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestScenario extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		TestScenario obj = new TestScenario();
		obj.launchChromeBrowser();
		
		
		
		//total 8 types for relative XPATH
		
		
		
		//Relative xpath by TAGNAME
		/*
		 * Syntax:
		 *     
		 * 1    //tagname
		 */
		WebElement e1 =driver.findElement(By.xpath("//input"));
		e1.sendKeys("Hemant");
		
		
		
		
		//Relative xpath by index  
		/*
		 * Syntax:
		 *    
		 *  2  //tagname[index]/tagname
		 *  3  //tagname[index]/tagname[index]
		 */ 
		
		
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("Hemant@123");
		
		
		
		
		/*
		 *  Relative Xpath by index using Signature
		 *  
		 *  Syntax:
		 *  
		 *  4  (//xpath)[index]
		 */
		
		WebElement e2 = driver.findElement(By.xpath("(//input)[3]"));
		e2.sendKeys("hemantahire148@gmail.com");
		
		
		
		/*
		 *  Relative Xpath by Attribute
		 *  
		 *  Syntax:
		 *  
		 *  5  //tagname[@AttributeName='AttributeValue']
		 */
		
		driver.findElement(By.xpath("//input[@class='mnclass']")).sendKeys("9975001109");
		
		
		/* Relative Xpath by TextFunction
		 * 
		 * Syntax:
		 * 
		 * 6  //tagname[text()='TextValue']
		 * 
		 */
		
		WebElement e3 = driver.findElement(By.xpath("//a[text()='Forgotton Password?']"));
		e3.click();
		
		
		driver.navigate().back();
		
		
		
		/* Relative Xpath by contains using Attribute
		 * 
		 * Syntax:
		 * 
		 * 7  //tagname[contains(@AttributeName,'AttributeValue')]
		 */
		
		
		driver.findElement(By.xpath("//input[contains(@type,'radio')]")).click();
		
		
		
		
		/* Relative Xpath by contains using textfunction
		 * 
		 *  Syntax:
		 *  
		 * 8  //tagname[contains(text(),'TextValue')]
		 */
		
		
		WebElement e4 = driver.findElement(By.xpath("//a[contains(text(),'Forgotton Password?')]"));
		e4.click();
		
		
	
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
