package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContainsAttribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abs");
		driver.findElement(By.xpath("//input[contains(@class,'_9npi')]")).sendKeys("njh");
		driver.findElement(By.xpath("//button[contains(@class,'selected')]")).click();
		driver.findElement(By.xpath("")).click();
	}

}
