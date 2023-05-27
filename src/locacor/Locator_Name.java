package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Name {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/name.html");
		Thread.sleep(3000);
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("xyz123")).sendKeys("abc");
	}

}
