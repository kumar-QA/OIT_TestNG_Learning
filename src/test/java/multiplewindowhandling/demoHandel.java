package multiplewindowhandling;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demoHandel {
	
	
	@Test
	public void verifyMultipleWindowFunctionality() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		 String   parentWindow =driver.getWindowHandle();
		 System.out.println("parent window id is:  "+parentWindow);
		
	WebElement	MainPageTextBox=driver.findElement(By.id("name"));
	MainPageTextBox.sendKeys("hi");
	WebElement   newbutton=driver.findElement(By.id("newWindowBtn"));
	newbutton.click();
	                Set<String> ids  = driver.getWindowHandles();
	                Iterator elements=ids.iterator();
	                String parentid=(String) elements.next();
	                String childid=(String) elements.next();
	                driver.switchTo().window(childid);
	                Thread.sleep(2000);
	                driver.findElement(By.id("firstName")).sendKeys("kumar");
	                driver.switchTo().window(parentid);
	                MainPageTextBox.clear();
	                MainPageTextBox.sendKeys("bye");
	                
	                
	                
	                
	
	}

}
