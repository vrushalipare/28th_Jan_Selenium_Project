package locacor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathBy_Text_Locator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//click on forgotton password link
		//driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}

}
