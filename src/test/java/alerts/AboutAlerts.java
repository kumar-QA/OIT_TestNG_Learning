package alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutAlerts {
	ChromeDriver driver;
	@BeforeMethod
	public void launch() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	@Test
	public void normalAlert() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	  Thread.sleep(2000);
	}
	
	@Test
	public void confirmationAlert() throws InterruptedException {
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	
	@Test(priority = 1)
	public void promptAlert() throws InterruptedException {

	WebElement	ele=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
	ele.click();
	Alert alt=driver.switchTo().alert();
	alt.sendKeys("iam m prasannakumar");
	Thread.sleep(2000);
	alt.dismiss();
		
	}
	
	
	
	

}
