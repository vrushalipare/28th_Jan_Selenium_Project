package webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_Maximize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//3 steps to maximize the browser
	//	Options s1=driver.manage();
	//	Window s2=s1.window();
	//	s2.maximize();
		driver.manage().window().maximize();
	}

}
