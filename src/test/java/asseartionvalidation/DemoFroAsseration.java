package asseartionvalidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoFroAsseration {

	@Test
	public void verifyLoginPage() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement usernamefiled = driver.findElement(By.id("Email"));
		WebElement passwordField = driver.findElement(By.id("Password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usernamefiled.clear();
		usernamefiled.sendKeys("admin@yourstore.com");
		passwordField.clear();
		passwordField.sendKeys("admin");
		loginButton.click(); 
		String ExpextedValue="Dashboard / nopCommerce administration";
		String actualvalue=driver.getTitle();
		Assert.assertEquals(actualvalue, ExpextedValue);
	
	}
	
	@Test
	public void VerifyNegativeTesting() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement usernamefiled = driver.findElement(By.id("Email"));
		WebElement passwordField = driver.findElement(By.id("Password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usernamefiled.clear();
		usernamefiled.sendKeys("aevsdvesvn");
		passwordField.clear();
		passwordField.sendKeys("admin");
		loginButton.click(); 
		String expectedvalue="invalid username";
	String	actualvalue=driver.findElement(By.id("Email-error")).getText();
////	Assert.assertEquals(actualvalue, expectedvalue);
//	Assert.assertTrue(expectedvalue.equals(actualvalue));
	
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualvalue, expectedvalue);
	s.assertAll();
	
		
	}
	
	@Test
	public void differenceAssert() {
		
//		System.out.println("1");
//		System.out.println("2");
//		Assert.assertEquals("hi", "bye");
//		System.out.println("3");
//		System.out.println("4");
		
		
		System.out.println("1");
		System.out.println("2");
		SoftAssert s=new SoftAssert();
		s.assertEquals("hi", "bye");
		System.out.println("3");
		s.assertAll();
		System.out.println("4");
		
		
		
		
	}

}
