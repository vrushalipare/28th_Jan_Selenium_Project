package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttributeMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//input[contains(@class,'_6luy')])[1]")).getAttribute("value");
		System.out.println(text);
	}

}
