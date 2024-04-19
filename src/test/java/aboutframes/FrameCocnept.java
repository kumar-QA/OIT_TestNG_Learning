package aboutframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameCocnept {

	@Test
	public void NormalFrame() {
	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/iframe");
			driver.switchTo().frame(0);
		WebElement	ele=driver.findElement(By.tagName("p"));
		System.out.println(ele.getText());
	}
	
	
	@Test
	public void MultipleFrame() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/nested_frames");
			driver.switchTo().frame(0);
			driver.switchTo().frame(1);
			System.out.println(driver.findElement(By.id("content")).getText());
			driver.switchTo().defaultContent();
			driver.switchTo().frame(1);
			System.out.println(driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText());

	}
	
}
