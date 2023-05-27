package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Method_IsEnabled {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean result=driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		System.out.println(result);
		if(result) {
			System.out.println("elementis enable");
		}
		else {
			System.out.println("element is disabled");
		}
	}

}
