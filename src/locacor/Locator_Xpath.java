package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Xpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//login id of facebook
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vrushali");
		//find element password of facebook
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("vrp@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
