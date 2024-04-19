package js;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoJS {

	@Test
	public void scroll() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		   JavascriptExecutor js=((JavascriptExecutor)driver);
		   js.executeScript("window.scrollBy(0,900);");
		   js.executeScript("window.scrollTo(0,900);");
	}
	
	@Test
	public void jsClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		   JavascriptExecutor js=((JavascriptExecutor)driver);
		   js.executeScript("window.scrollBy(0,900);");
		   js.executeScript("window.scrollTo(0,900);");
	}
}
