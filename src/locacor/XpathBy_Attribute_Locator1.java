package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBy_Attribute_Locator1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.findElement("locator type")
		//driver.findElement(By.xpath(xpathExpression))
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		//enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
