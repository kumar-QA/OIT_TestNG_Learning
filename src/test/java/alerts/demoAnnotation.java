package alerts;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoAnnotation {
	
	@BeforeMethod
	public void data() {
		System.out.println("opend browser");
	}
	
	@BeforeGroups
	public void ss() {
		System.out.println();
	}
	@AfterGroups
	public void sd() {
		
	}
	
	@AfterMethod
	public void data1() {
		System.out.println("close the browser");
	}
	@Test(description = "Testing LoginFunction",groups = "smoke")
	public void m1() {
		System.out.println("m1 method");
	}

	@Test(invocationCount = 3,groups = "smoke")
	public void m2() {
		System.out.println("m2 method");
	}

	@Test(timeOut = 1000,groups = "retesing")
	public void m3() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("m3 method");
	}
}
