package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Conformation_Popup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1111");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		//get text from alert popup
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		//click on cancel button from alert popup
		//driver.switchTo().alert().dismiss();
		
		//click on 'ok' button from 1st alert popup
		driver.switchTo().alert().accept();
		//click on 'ok' button from 2nd alert popup
		driver.switchTo().alert().accept();
		
	}

}
