package listBox_;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_getMonth_In_Alphabetical_order {
	public static void main(String[] args ) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		TreeSet sor = new TreeSet(); 
		
		List<WebElement> get = s.getOptions();	
		for(WebElement w:get) {
			sor.add(w.getText());
			System.out.println(w.getText());
		}
		System.out.println("-------");
	System.out.println("after sorting");
		
	System.out.println(sor);	
	} 

}
