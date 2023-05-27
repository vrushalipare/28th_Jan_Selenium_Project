package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class enableMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		boolean result = driver.findElement(By.xpath("//button[contains(@class,'_51sy')]")).isEnabled();
		System.out.println(result);
		if(result) {
			System.out.println("button is enabled");
		}
		else {
			System.out.println("button is disabled");
		}
	}

}
