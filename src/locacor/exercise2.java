package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exercise2 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.shopdisney.com/");
driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vrushalipare@gmail.com");
//driver.findElement(By.xpath("//button[@id='BtnSubmit']")).click();
Thread.sleep(2000);
//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
