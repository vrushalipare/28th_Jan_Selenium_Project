package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_TagName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/tagname.html");
		//enter firstname
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("abc");
		//enter lastname
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("xyz");
		//in tagname locator both the actions performs on first name
		//there is no action on last name because both is having tagname 'input'
		
	}

}
