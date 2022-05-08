package jan31;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class TestScenario1 extends LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		TestScenario1 obj = new TestScenario1();
		obj.launchBrowser();
		
		//1st way to find the  width and height  
		int height=driver.manage().window().getSize().getHeight();
		int width=driver.manage().window().getSize().getWidth();
		System.out.println("width of full window is "+ width);
		System.out.println("height of full window is "+height);
		
		
		
		//2nd way to find height and width
		//here dimension act as a non primitive data type
		Dimension size =driver.manage().window().getSize();
		System.out.println("width of full window is "+size.getWidth());
		System.out.println("height of full window is "+size.getHeight());
		
		
		//to set the window as per given width and height here first is width and second is height
		//Dimension is class persent in Selenium
		Dimension setS = new Dimension(300,500);
		driver.manage().window().setSize(setS);
	  
	    int width1 = setS.width;
	    System.out.println("width of  current window is "+width1);
		
	    int height1 =setS.height;
	    System.out.println("height of current window is "+height1);
	    
	    
	    //1st way to find position of window by x,y coordinate
	    int x = driver.manage().window().getPosition().x;
	    int y = driver.manage().window().getPosition().y;
	    System.out.println("Position of x is "+x);
	    System.out.println("Position of y is "+y);
	    
	    //2nd way to find position of window by x,y coordinate
	    //point act as a non primitive data type
	    Point Position = driver.manage().window().getPosition();
	    System.out.println("The position of current window X,Y is "+ Position.x+","+Position.y );
	    
	    //to set the position of window as per x,y coordinate
	    //Point is a class which is present in Selenium
	    Point setP= new Point(500,200);
	    driver.manage().window().setPosition(setP);
	    
	    int x1 =setP.x;
	    int y1 =setP.y;
	    System.out.println("after set Position the coordinates are: "+x1+","+y1);
	    
	    
	    
	    
	    
	    
		Thread.sleep(3000);
		driver.close();
	}
}
