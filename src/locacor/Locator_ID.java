package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_ID {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/id.html");
		//first name
		driver.findElement(By.id("1234")).sendKeys("abc");
		//last name
		driver.findElement(By.id("1234")).sendKeys("xyz");
				
	}

}
