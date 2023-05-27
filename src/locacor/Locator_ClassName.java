package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Locator_ClassName {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/classname.html");
		driver.findElement(By.className("abc123")).sendKeys("abc");
		driver.findElement(By.className("abc123")).sendKeys("xyz");
	}

}
