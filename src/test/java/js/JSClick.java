package js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JSClick {

	@Test
	public void clickOperation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
WebElement ele=driver.findElement(By.xpath("//a[@href=\"https://jqueryui.com/draggable/\"]"));
		
       JavascriptExecutor  js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].clcik();",ele);
		
	}
	
	
	
}

