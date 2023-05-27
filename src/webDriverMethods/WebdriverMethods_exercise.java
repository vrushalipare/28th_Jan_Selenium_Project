package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods_exercise {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
		Thread.sleep(2000);
		//driver.close();
		driver.navigate().to("https://www.google.com/");
		
		
		
		Thread.sleep(2000);
		driver.navigate().to("http://www.facebook.com/");
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.quit();
		
	}

}
