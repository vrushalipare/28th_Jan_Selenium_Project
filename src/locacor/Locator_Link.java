package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Link {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/vrush/OneDrive/Documents/HTML%20Files/link.html");
		driver.findElement(By.linkText("FACEBOOK")).click();
	}

}
