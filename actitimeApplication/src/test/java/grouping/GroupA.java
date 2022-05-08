package grouping;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups= {"META_GROUP"})
public class GroupA {
	
	
	@BeforeClass
	public void beforeclass() {
		System.out.println();
	}

	@Test(priority = 1,groups= {"Sanity"})
	public void a1() {
		System.out.println("a1 is executing from  Sanity group class a");
	}
 
	@Test(priority = 2, invocationCount = 5,groups= {"Functional"})
	public void a2() {
		System.out.println("a2 is executing from Functional group class a");
	}

	@Test(priority = 3, timeOut = 9000,groups= {"Functional","Regression"})
	public void a3() {
		System.out.println("a3 is executing from Functional or Regression group class a");
	}

	@Test(priority = 4,groups= {"Regression"})
	public void a4() {
		
		System.out.println("a4 is executing from Regression group class a");
	    Assert.fail();
	}

	@Test(priority = 5, dependsOnMethods = "a4",groups={"Sanity"})
	public void a5() {
		System.out.println("a5 is executing from  Sanity group class a");
	}

	@Test(enabled = false)
	public void a6() {
		System.out.println("a6 is executing from No group class a");
	}

	@Test(groups={"Functional"})
	public void a7() {
		System.out.println("a7 is running from Functional group class a");
	}

}
