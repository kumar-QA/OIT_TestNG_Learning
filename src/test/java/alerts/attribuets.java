package alerts;

import org.testng.annotations.Test;

public class attribuets {

	
	@Test
	public void login() {
		System.out.println("log");
	}
	
	@Test(dependsOnMethods = "login",alwaysRun = true)
	public  void Clickoncatalog() {
		System.out.println("clciked on login");
	}
	
}
