package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_Selected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		boolean result=driver.findElement(By.xpath("(//label[@class='_58mt'])[1]")).isSelected();
		System.out.println(result);
		if(result) {
			System.out.println("radio button selected");
		}
		else {
			System.out.println("radio button de-selected");
		}
	}

}
