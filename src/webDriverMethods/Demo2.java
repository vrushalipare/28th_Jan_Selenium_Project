package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
	}

}
