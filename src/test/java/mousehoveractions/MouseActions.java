package mousehoveractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {

	@Test
	public void verifyRigthClickOperation() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act = new Actions(driver);
		act.contextClick(ele).build().perform();

	}

	@Test
	public void verifydoubleClick() {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement dbelement = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(dbelement).build().perform();

	}

	@Test
	public void verifymouseHover() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement blogsele = driver.findElement(By.id("blogsmenu"));
		WebElement link4 = driver.findElement(By.xpath("//a[@href=\"http://www.seleniumtwo-by-arun.blogspot.com\"]"));
		Actions act = new Actions(driver);
		act.moveToElement(blogsele).moveToElement(link4).click().build().perform();

	}

	@Test
	public void verifyDragAndDrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement firstelemnt = driver.findElement(By.id("draggable"));
		WebElement secondelement = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(firstelemnt, secondelement).build().perform();

	}

}
