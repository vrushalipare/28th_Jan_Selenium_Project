package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sendkeys_and_clear_methods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		UN.sendKeys("abc");
		Thread.sleep(2000);
		UN.clear();
		Thread.sleep(2000);
		UN.sendKeys("xyz");
	} 

}
