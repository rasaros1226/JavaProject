package grouping;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test(groups={"Metaverse"})
public class GroupD {
	@Test(priority = 1,groups= {"chrome.Sanity"})
	public void d1() {
		System.out.println("d1 is executing from  Sanity group class d");
	}

	@Test(priority = 2, invocationCount = 5,groups= {"IE.Functional"})
	public void d2() {
		System.out.println("d2 is executing from Functional group class d");
	}

	@Test(priority = 3, timeOut = 9000,groups= {"opera.Functional","chrome.Regression"})
	public void d3() {
		System.out.println("d3 is executing from Functional or Regression group class d");
	}

	@Test(priority = 4,groups= {"firefox.Regression"})
	public void d4() {
		
		System.out.println("d4 is executing from Regression group class d");
	    Assert.fail();
	}

	@Test(priority = 5, dependsOnMethods = "d4",groups={"firefox..Sanity"})
	public void d5() {
		System.out.println("d5 is executing from  Sanity group class D");
	}

	@Test(enabled = false)
	public void d6() {
		System.out.println("d6 is executing from No group class d");
	}

	@Test(groups={"chrome.Functional"})
	public void d7() {
		System.out.println("d7 is running from Functional group class d");
	}

	
}
