package abouttable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tabledemo {

	@Test
	public void gettotalrowCountIntableBody() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		System.out.println(driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[2]/td[3]")).getText());

	}

	@Test
	public void getTbodyData() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");

		int rowcount = driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr")).size();
		int columncount = driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr[1]/td")).size();

		for (int i = 1; i <= rowcount; i++) {
			for (int j = 1; j <= columncount; j++) {
	WebElement  ele=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr["+i+"]/td["+j+"]"));
	  System.out.print(ele.getText()+"  ");
			}
			System.out.println();

		}
		

		

	}

}
