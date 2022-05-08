package grouping;



import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups= {"Metaverse"})
public class GroupB {

	@Test(priority = 1,groups= {"Sanity"})
	public void b1() {
		System.out.println("b1 is executing from  Sanity group class b");
	}

	@Test(priority = 2, invocationCount = 5,groups= {"Functional"})
	public void b2() {
		System.out.println("b2 is executing from Functional group class b");
	}

	@Test(priority = 3, timeOut = 9000,groups= {"Functional","Regression"})
	public void b3() {
		System.out.println("b3 is executing from Functional or Regression group class b");
	}

	@Test(priority = 4,groups= {"Regression"})
	public void b4() {
		
		System.out.println("b4 is executing from Regression group class b");
	    Assert.fail();
	}

	@Test(priority = 5, dependsOnMethods = "b4",groups={"Sanity"})
	public void b5() {
		System.out.println("b5 is executing from  Sanity group class b");
	}

	@Test(enabled = false)
	public void b6() {
		System.out.println("b6 is executing from No group class b");
	}

	@Test(groups={"Functional"})
	public void b7() {
		System.out.println("b7 is running from Functional group class b");
	}

	
}



