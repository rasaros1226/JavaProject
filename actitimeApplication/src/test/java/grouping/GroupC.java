package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test(groups= {"META_GROUP"})
public class GroupC {

	@Test(priority = 1,groups= {"edge.Sanity"})
	public void c1() {
		System.out.println("c1 is executing from  Sanity group class C");
	}

	@Test(priority = 2, invocationCount = 5,groups= {"firefox.Functional"})
	public void c2() {
		System.out.println("c2 is executing from Functional group class c");
	}

	@Test(priority = 3, timeOut = 9000,groups= {"IE.Functional","opera.Regression"})
	public void c3() {
		System.out.println("c3 is executing from Functional or Regression group class c");
	}

	@Test(priority = 4,groups= {"chrome.Regression"})
	public void c4() {
		
		System.out.println("c4 is executing from Regression group class C");
	    Assert.fail();
	}

	@Test(priority = 5, dependsOnMethods = "c4",groups={"opera.Sanity"})
	public void c5() {
		System.out.println("c5 is executing from  Sanity group class c");
	}

	@Test(enabled = false)
	public void c6() {
		System.out.println("c6 is executing from No group class c");
	}

	@Test(groups={"chrome.Functional"})
	public void c7() {
		System.out.println("c7 is running from Functional group class c");
	}

	
}
