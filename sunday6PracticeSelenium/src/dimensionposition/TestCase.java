package dimensionposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

public class TestCase extends LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
	
    	TestCase obj = new TestCase();
    	obj.launchBrowser();
    	
    	//1st way
    	int height = driver.manage().window().getSize().getHeight();
    	int width = driver.manage().window().getSize().getWidth();
    	System.out.println(width);
    	System.out.println(height);
    	
    	//2nd way
    	Dimension d = driver.manage().window().getSize();
    	System.out.println(d.getWidth());
    	System.out.println(d.getHeight());
    	
    	//to set width and height
    	Dimension d1 = new Dimension(800,500);
    	driver.manage().window().setSize(d1);
    	
    	//to get position
    	
    	//1st way
    	
    	int x =driver.manage().window().getPosition().getX();
    	int y =driver.manage().window().getPosition().getY();
    	System.out.println(x);
    	System.out.println(y);
    	
    	//2nd way
    	
    	Point size = driver.manage().window().getPosition();
    	System.out.println(size.x);
    	System.out.println(size.y);
    	
    	//to set position
    	
    	Point s = new Point(688,372);
    	driver.manage().window().setPosition(s);
    	
    	
    	
    	Thread.sleep(3000);
    	driver.quit();
}
	
}
